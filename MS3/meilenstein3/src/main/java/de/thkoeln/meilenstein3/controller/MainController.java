package de.thkoeln.meilenstein3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/addEntry")
    public String addEntry(Model model) {
        return "addEntry";
    }

    @PostMapping("/addEntry")
    public String formController(@RequestPart("schlafrange") double schlafrange) {

        System.out.println("Schlafrange: " + schlafrange);

        return "index";
    }

}
