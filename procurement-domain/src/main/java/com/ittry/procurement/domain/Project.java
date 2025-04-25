package com.ittry.procurement.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Project {
    private Long id;
    private String projectCode;        // 项目编号
    private String projectName;        // 项目名称
    private String projectType;        // 项目类型
    private String projectStatus;      // 项目状态
    private BigDecimal totalAmount;    // 项目总金额
    private String description;        // 项目描述
    private String department;         // 所属部门
    private String manager;            // 项目负责人
    private Date startDate;           // 开始日期
    private Date endDate;             // 结束日期
    private Date createTime;          // 创建时间
    private String createBy;          // 创建人
    private Date updateTime;          // 更新时间
    private String updateBy;          // 更新人
    private List<ProjectDetail> projectDetails;  // 项目明细列表

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public List<ProjectDetail> getProjectDetails() {
        return projectDetails;
    }

    public void setProjectDetails(List<ProjectDetail> projectDetails) {
        this.projectDetails = projectDetails;
    }
}