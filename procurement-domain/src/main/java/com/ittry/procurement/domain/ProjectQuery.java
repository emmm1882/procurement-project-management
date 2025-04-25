package com.ittry.procurement.domain;

import java.util.Date;

public class ProjectQuery {
    private String projectCode;        // 项目编号
    private String projectName;        // 项目名称
    private String projectType;        // 项目类型
    private String projectStatus;      // 项目状态
    private String department;         // 所属部门
    private String manager;            // 项目负责人
    private Date startDateBegin;       // 开始日期范围-开始
    private Date startDateEnd;         // 开始日期范围-结束
    private Integer pageNum;           // 当前页码
    private Integer pageSize;          // 每页记录数

    // Getters and Setters
    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Date getStartDateBegin() {
        return startDateBegin;
    }

    public void setStartDateBegin(Date startDateBegin) {
        this.startDateBegin = startDateBegin;
    }

    public Date getStartDateEnd() {
        return startDateEnd;
    }

    public void setStartDateEnd(Date startDateEnd) {
        this.startDateEnd = startDateEnd;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}