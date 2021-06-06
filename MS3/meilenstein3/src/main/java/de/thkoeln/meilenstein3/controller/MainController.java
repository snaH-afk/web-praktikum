package de.thkoeln.meilenstein3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

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
    public String formController(@RequestPart("sleepdurationRange") String sleepduration,
                                 @RequestPart("sleepqualityRange") String sleepquality,
                                 @RequestPart("sportdurationRange") String sportduration,
                                 @RequestPart("sportintensityRange") String sportintensity,
                                 @RequestPart("wellbeingRange") String wellbeing,
                                 @RequestPart("image")MultipartFile image) {

        System.out.println("Sleep duration: " + sleepduration);
        System.out.println("Sleep quality: " + sleepquality);
        System.out.println("Sport duration: " + sportduration);
        System.out.println("Sport intensity: " + sportintensity);
        System.out.println("Sense of wellbeing: " + wellbeing);
        System.out.println("Image: " + image);

        return "index";
    }

}
