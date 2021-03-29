package org.pixel.springsandbox.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/hello")
    public String helloPage(){
        return "main/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage(){
        return "main/goodbye";
    }
}
