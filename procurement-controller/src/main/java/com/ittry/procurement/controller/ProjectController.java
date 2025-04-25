package com.ittry.procurement.controller;

import com.ittry.procurement.domain.Project;
import com.ittry.procurement.domain.ProjectQuery;
import com.ittry.procurement.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    /**
     * 根路径欢迎接口
     */
    @GetMapping("/")
    public Map<String, Object> welcome() {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("msg", "欢迎使用采购项目管理系统API");
        return result;
    }

    /**
     * 查询项目列表
     */
    @PostMapping("/list")
    public Map<String, Object> queryProjectList(@RequestBody ProjectQuery query) {
        Map<String, Object> result = new HashMap<>();
        
        // 查询项目列表
        List<Project> list = projectService.queryProjectList(query);
        // 查询总记录数
        int total = projectService.queryProjectCount(query);
        
        result.put("code", 200);
        result.put("msg", "查询成功");
        result.put("data", list);
        result.put("total", total);
        
        return result;
    }

    /**
     * 新增项目
     */
    @PostMapping("/save")
    public Map<String, Object> saveProject(@RequestBody Project project) {
        Map<String, Object> result = new HashMap<>();
        
        try {
            boolean success = projectService.saveProject(project);
            if (success) {
                result.put("code", 200);
                result.put("msg", "保存成功");
            } else {
                result.put("code", 500);
                result.put("msg", "保存失败");
            }
        } catch (Exception e) {
            result.put("code", 500);
            result.put("msg", "系统异常：" + e.getMessage());
        }
        
        return result;
    }
}