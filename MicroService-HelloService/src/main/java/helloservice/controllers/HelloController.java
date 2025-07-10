package helloservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String getHelloPage() {
        return "hello"; // This maps to src/main/resources/templates/hello.html
    }
}
