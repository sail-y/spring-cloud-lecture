package com.test.springlecture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * @author yangfan
 * @date 2019/11/23
 */
@Controller
public class JspController {

    @GetMapping("/jsp")
    public String jspn(ModelMap model) {
        model.put("date", new Date());
        return "result";
    }
}
