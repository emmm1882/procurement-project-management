package com.ittry.procurement.mapper;

import com.ittry.procurement.domain.Project;
import com.ittry.procurement.domain.ProjectDetail;
import com.ittry.procurement.domain.ProjectQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProjectMapper {
    
    /**
     * 查询项目列表
     * @param query 查询条件
     * @return 项目列表
     */
    List<Project> selectProjectList(ProjectQuery query);
    
    /**
     * 查询项目总数
     * @param query 查询条件
     * @return 总数
     */
    int selectProjectCount(ProjectQuery query);
    
    /**
     * 新增项目
     * @param project 项目信息
     * @return 影响行数
     */
    int insertProject(Project project);
    
    /**
     * 批量新增项目明细
     * @param projectId 项目ID
     * @param details 项目明细列表
     * @return 影响行数
     */
    int batchInsertProjectDetails(@Param("projectId") Long projectId, @Param("details") List<ProjectDetail> details);
}