package com.poldichen.knowaboutme.controller;

import com.alibaba.fastjson.JSON;
import com.poldichen.knowaboutme.entity.Education;
import com.poldichen.knowaboutme.entity.Resp;
import com.poldichen.knowaboutme.service.inter.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EducationController {

    @Autowired
    private IEducationService educationService;

    @RequestMapping(value="/education/{id}")
    public Resp getById(@PathVariable int id) {
        Resp resp = new Resp();
        Education education = educationService.getById(id);
        resp.setData(education);
        return resp;
    }

    @RequestMapping(value="/education")
    public Resp getAll() {
        Resp resp = new Resp();
        List<Education> educations = educationService.getAll();
        resp.setData(educations);
        return resp;
    }

    @RequestMapping(value="/education/{id}", method= RequestMethod.PUT)
    public Resp updateById(@PathVariable int id, @RequestBody String params) {
        Resp resp = new Resp();
        Education education = JSON.parseObject(params, Education.class);
        boolean result = educationService.updateById(id, education);
        resp.setData(result);
        return resp;
    }

    @RequestMapping(value="/education", method=RequestMethod.POST)
    public Resp createOne(@RequestBody String params) {
        Resp resp = new Resp();
        Education education = JSON.parseObject(params, Education.class);
        int result = educationService.createOne(education);
        resp.setData(result);
        return resp;
    }
}
