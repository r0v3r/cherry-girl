package com.foss.rover.cherrygirl.cherryserver.controller;

import com.foss.rover.cherrygirl.cherryserver.service.BaseItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @Autowired
    private BaseItemService itemService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(Model model  ) {
        String res = itemService.test();
        return res;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }
}