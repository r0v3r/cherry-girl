package com.foss.rover.cherrygirl.cherryserver.controller;

import com.foss.rover.cherrygirl.cherryserver.service.BaseItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private BaseItemService itemService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        String res = itemService.test();
        return res;
    }
}