package com.mysite.sunwngboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/wng")
    @ResponseBody
    public String index() {
        return "It's WoongBoard!!";
    }

    @RequestMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}
