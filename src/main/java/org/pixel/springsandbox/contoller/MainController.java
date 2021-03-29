package org.pixel.springsandbox.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/hello")
    public String helloPage() {
        return "main/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "main/goodbye";
    }


    @GetMapping("/calculator")
    public String calculatorPage(@RequestParam("a") int a,
                                 @RequestParam("b") int b,
                                 @RequestParam("action") String action,
                                 Model model) {

        String message;

        switch (action) {
            case "multi":
                message = a + " * " + b + " = " + (a * b);
                break;
            case "add":
                message = a + "+ " + b + " = " + (a + b);
                break;
            case "sub":
                message = a + " - " + b + " = " + (a * b);
                break;
            case "div":
                message = a + " / " + b + " = " +  ((float) a / b);
                break;
            default:
                message = "action not found";
        }


        model.addAttribute("message", message);

        return "main/calculator";
    }
}
