package com.poldichen.knowaboutme.controller;

import com.alibaba.fastjson.JSON;
import com.poldichen.knowaboutme.entity.Basic;
import com.poldichen.knowaboutme.entity.Resp;
import com.poldichen.knowaboutme.service.inter.IBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author poldi.chen
 * @className BasicController
 * @description TODO
 * @date 2019/3/16 16:29
 **/
@RestController
public class BasicController {

    @Autowired
    private IBasicService basicService;

    @RequestMapping(value="/basic/{id}")
    public Resp getById(@PathVariable int id) {
        Resp resp = new Resp();
        Basic basic = basicService.getById(id);
        System.out.println(basic.toString());
        resp.setData(basic);
        return resp;
    }

    @RequestMapping(value="/basic/{id}", method = RequestMethod.PUT)
    public Resp updateById(@PathVariable int id, @RequestBody String params) {
        Resp resp = new Resp();
        Basic basic = JSON.parseObject(params, Basic.class);
        boolean result = basicService.updateById(id, basic);
        resp.setData(result);
        return resp;
    }
}
