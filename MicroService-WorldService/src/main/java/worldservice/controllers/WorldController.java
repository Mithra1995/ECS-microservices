package worldservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorldController {

    @GetMapping("/world")
    public String getWorldPage() {
        return "world"; // This maps to src/main/resources/templates/world.html
    }
}
