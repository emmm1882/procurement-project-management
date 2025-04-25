package com.ittry.procurement.service;

import com.ittry.procurement.domain.Project;
import com.ittry.procurement.domain.ProjectQuery;

import java.util.List;

public interface ProjectService {
    
    /**
     * 查询项目列表
     * @param query 查询条件
     * @return 项目列表
     */
    List<Project> queryProjectList(ProjectQuery query);
    
    /**
     * 查询项目总数
     * @param query 查询条件
     * @return 总数
     */
    int queryProjectCount(ProjectQuery query);
    
    /**
     * 新增项目及明细
     * @param project 项目信息（包含明细）
     * @return 是否成功
     */
    boolean saveProject(Project project);
}