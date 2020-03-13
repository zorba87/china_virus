package com.glshlee.boilerplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController{
    
    @RequestMapping("/")
    public String FirstMainMiew(Model model){
        model.addAttribute("message", "Hi, you guys");
        return "main"; 
    } 
    
    @RequestMapping(value="first",method=RequestMethod.GET)
    public void setFirstMainView() {

    }

}