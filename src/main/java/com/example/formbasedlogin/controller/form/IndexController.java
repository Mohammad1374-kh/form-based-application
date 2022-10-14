package com.example.formbasedlogin.controller.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    //Form Controllers Completed
    @GetMapping(value = {"/index","/"})
    public String home(){
        return "index";
    }
}
