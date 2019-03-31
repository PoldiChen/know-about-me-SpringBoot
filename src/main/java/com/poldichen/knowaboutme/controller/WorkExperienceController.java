package com.poldichen.knowaboutme.controller;

import com.alibaba.fastjson.JSON;
import com.poldichen.knowaboutme.entity.Resp;
import com.poldichen.knowaboutme.entity.Skill;
import com.poldichen.knowaboutme.entity.WorkExperience;
import com.poldichen.knowaboutme.service.inter.ISkillService;
import com.poldichen.knowaboutme.service.inter.IWorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WorkExperienceController {

    @Autowired
    private IWorkExperienceService workExperienceService;

    @RequestMapping(value="/work_experience/{id}")
    public Resp getById(@PathVariable int id) {
        Resp resp = new Resp();
        WorkExperience workExperience = workExperienceService.getById(id);
        resp.setData(workExperience);
        return resp;
    }

    @RequestMapping(value="/work_experience")
    public Resp getAll() {
        Resp resp = new Resp();
        List<WorkExperience> workExperiences = workExperienceService.getAll();
        resp.setData(workExperiences);
        return resp;
    }

    @RequestMapping(value="/work_experience/{id}", method= RequestMethod.PUT)
    public Resp updateById(@PathVariable int id, @RequestBody String params) {
        Resp resp = new Resp();
        WorkExperience workExperience = JSON.parseObject(params, WorkExperience.class);
        boolean result = workExperienceService.updateById(id, workExperience);
        resp.setData(result);
        return resp;
    }

    @RequestMapping(value="/work_experience", method=RequestMethod.POST)
    public Resp createOne(@RequestBody String params) {
        Resp resp = new Resp();
        WorkExperience workExperience = JSON.parseObject(params, WorkExperience.class);
        int result = workExperienceService.createOne(workExperience);
        resp.setData(result);
        return resp;
    }
}
