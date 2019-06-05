package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping(path = {"/", "/index"})
    @ResponseBody
    public String home() {
        return "index";
    }

    @GetMapping(path = "/hello")
    @ResponseBody
    public String index() {
        return "hello world";
    }

    @GetMapping(path = "/spring-mvc-xml")
    @ResponseBody
    public String springMvc() {
        return "spring mvc";
    }
}
