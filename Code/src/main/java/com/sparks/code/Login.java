package com.sparks.code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Login {

    @RequestMapping("/")
    public String index(@ModelAttribute("error") String error){
        return "/index.jsp";
    }

    @RequestMapping("/code")
    public String code(){
        return "/code.jsp";
    }
    
    @PostMapping("/code")
    public String code(@RequestParam("password") String password, RedirectAttributes redirectAttributes){
        if(password.equals("bushido")){
            return "redirect:/code";
	}
        else{
            redirectAttributes.addFlashAttribute("error", "Password Denied");
            return"redirect:/";
        }
    }
}
