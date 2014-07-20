package com.aguacatala.web.conf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping(value="/malparidos", method=RequestMethod.GET)
    public String index(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }
    /*
    @RequestMapping(value="/user", method=RequestMethod.POST)
    public String user_form(String firstname, String lastname, String company, String usrtel, String email, String pwd, Model model) {
        model.addAttribute("firstname", firstname);
        model.addAttribute("lastname", lastname);
        model.addAttribute("company", company);
        model.addAttribute("usrtel", usrtel);
        model.addAttribute("email", email);
        model.addAttribute("pwd", pwd);
        return "user_form";
    }
    
    @RequestMapping(value="/email", method=RequestMethod.POST)
    public String email(String name, String from, String subject, String desc,  Model model) {
        model.addAttribute("name", name);
        model.addAttribute("from", from);
        model.addAttribute("subject", subject);
        model.addAttribute("desc", desc);
        return "email";
    }
    
    @RequestMapping(value="/campaign", method=RequestMethod.POST)
    public String campaign(String name, String desc,  Model model) {
        model.addAttribute("name", name);
        model.addAttribute("desc", desc);
        return "campaign";
    }
    */
    
    
}
