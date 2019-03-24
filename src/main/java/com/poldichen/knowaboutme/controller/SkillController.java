package com.poldichen.knowaboutme.controller;

import com.alibaba.fastjson.JSON;
import com.poldichen.knowaboutme.entity.Resp;
import com.poldichen.knowaboutme.entity.Skill;
import com.poldichen.knowaboutme.service.inter.ISkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author poldi.chen
 * @className SkillController
 * @description TODO
 * @date 2019/3/24 16:32
 **/
@RestController
public class SkillController {

    @Autowired
    private ISkillService skillService;

    @RequestMapping(value="/skill/{id}")
    public Resp getById(@PathVariable int id) {
        Resp resp = new Resp();
        Skill skill = skillService.getById(id);
        resp.setData(skill);
        return resp;
    }

    @RequestMapping(value="/skill")
    public Resp getAll() {
        Resp resp = new Resp();
        List<Skill> skills = skillService.getAll();
        resp.setData(skills);
        return resp;
    }

    @RequestMapping(value="/skill/{id}", method= RequestMethod.PUT)
    public Resp updateById(@PathVariable int id, @RequestBody String params) {
        Resp resp = new Resp();
        Skill skill = JSON.parseObject(params, Skill.class);
        boolean result = skillService.updateById(id, skill);
        resp.setData(result);
        return resp;
    }

    @RequestMapping(value="/skill", method=RequestMethod.POST)
    public Resp createOne(@RequestBody String params) {
        Resp resp = new Resp();
        Skill skill = JSON.parseObject(params, Skill.class);
        int result = skillService.createOne(skill);
        resp.setData(result);
        return resp;
    }
}
