package com.poldichen.knowaboutme.controller;

import com.alibaba.fastjson.JSON;
import com.poldichen.knowaboutme.entity.Project;
import com.poldichen.knowaboutme.entity.Resp;
import com.poldichen.knowaboutme.service.inter.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author poldi.chen
 * @className ProjectController
 * @description TODO
 * @date 2019/3/24 15:46
 **/
@RestController
public class ProjectController {

    @Autowired
    private IProjectService projectService;

    @RequestMapping(value="/project/{id}")
    public Resp getById(@PathVariable int id) {
        Resp resp = new Resp();
        Project project = projectService.getById(id);
        resp.setData(project);
        return resp;
    }

    @RequestMapping(value="/project")
    public Resp getAll() {
        Resp resp = new Resp();
        List<Project> projects = projectService.getAll();
        resp.setData(projects);
        return resp;
    }

    @RequestMapping(value="/project/{id}", method= RequestMethod.PUT)
    public Resp updateById(@PathVariable int id, @RequestBody String params) {
        Resp resp = new Resp();
        Project project = JSON.parseObject(params, Project.class);
        boolean result = projectService.updateById(id, project);
        resp.setData(result);
        return resp;
    }

    @RequestMapping(value="/project", method=RequestMethod.POST)
    public Resp createOne(@RequestBody String params) {
        Resp resp = new Resp();
        Project project = JSON.parseObject(params, Project.class);
        int result = projectService.createOne(project);
        resp.setData(result);
        return resp;
    }

}
