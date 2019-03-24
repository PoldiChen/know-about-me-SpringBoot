package com.poldichen.knowaboutme.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author poldi.chen
 * @className TestController
 * @description TODO
 * @date 2019/3/16 15:22
 **/
@RestController
public class TestController {

    @RequestMapping(value="/test")
    public String test() {
        return "poldi chen aa";
    }
}
