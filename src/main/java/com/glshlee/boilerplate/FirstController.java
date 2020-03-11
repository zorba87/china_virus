package com.glshlee.boilerplate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController{
    
    @RequestMapping("/")
    public String FirstMainMiew(Model model){
        model.addAttribute("message", "Hi, you guys");
        return "view"; 
    } 
    
    @RequestMapping(value="first",method=RequestMethod.GET)
    public void setFirstMainView() {

    }

}