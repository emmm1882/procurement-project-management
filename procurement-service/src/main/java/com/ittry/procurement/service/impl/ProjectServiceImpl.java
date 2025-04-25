package com.ittry.procurement.service.impl;

import com.ittry.procurement.domain.Project;
import com.ittry.procurement.domain.ProjectDetail;
import com.ittry.procurement.domain.ProjectQuery;
import com.ittry.procurement.mapper.ProjectMapper;
import com.ittry.procurement.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public List<Project> queryProjectList(ProjectQuery query) {
        // 设置分页参数
        if (query.getPageNum() == null || query.getPageNum() < 1) {
            query.setPageNum(1);
        }
        if (query.getPageSize() == null || query.getPageSize() < 1) {
            query.setPageSize(10);
        }
        // 计算偏移量
        int offset = (query.getPageNum() - 1) * query.getPageSize();
        query.setPageNum(offset);
        
        return projectMapper.selectProjectList(query);
    }

    @Override
    public int queryProjectCount(ProjectQuery query) {
        return projectMapper.selectProjectCount(query);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean saveProject(Project project) {
        // 设置创建时间和更新时间
        Date now = new Date();
        project.setCreateTime(now);
        project.setUpdateTime(now);
        
        // 新增项目主表
        int rows = projectMapper.insertProject(project);
        if (rows <= 0) {
            return false;
        }
        
        // 获取新增项目的ID
        Long projectId = project.getId();
        
        // 设置项目明细的关联ID和时间
        List<ProjectDetail> details = project.getProjectDetails();
        if (details != null && !details.isEmpty()) {
            for (ProjectDetail detail : details) {
                detail.setProjectId(projectId);
                detail.setCreateTime(now);
                detail.setUpdateTime(now);
                detail.setCreateBy(project.getCreateBy());
                detail.setUpdateBy(project.getUpdateBy());
            }
            // 批量新增项目明细
            rows = projectMapper.batchInsertProjectDetails(projectId, details);
            if (rows <= 0) {
                throw new RuntimeException("新增项目明细失败");
            }
        }
        
        return true;
    }
}