package de.thkoeln.meilenstein3.controller;

import de.thkoeln.meilenstein3.models.Entry;
import de.thkoeln.meilenstein3.models.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

    @Autowired
    private EntryRepository entryRepository;

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/addEntry")
    public String addEntry(Model model) {
        return "addEntry";
    }

    @PostMapping("/addEntry")
    public String formController(Model model,
                                 @RequestParam(value ="title", required = false, defaultValue ="") String title,
                                 @RequestPart("sleepdurationRange") String sleepduration,
                                 @RequestPart("sleepqualityRange") String sleepquality,
                                 @RequestPart("sportdurationRange") String sportduration,
                                 @RequestPart("sportintensityRange") String sportintensity,
                                 @RequestPart("wellbeingRange") String wellbeing,
                                 @RequestPart("image")MultipartFile image,
                                 RedirectAttributes redirectAttributes) {

        Entry entry = new Entry();
        entry.setSleepduration(Double.parseDouble(sleepduration));
        entry.setTitle(title);
        entry.setSleepquality(Double.parseDouble(sleepquality));
        entry.setSportintensity(Double.parseDouble(sportintensity));
        entry.setWellbeing(Double.parseDouble(wellbeing));

        model.addAttribute("entry", entryRepository.findAll());
        model.addAttribute("title", title);
        redirectAttributes.addFlashAttribute("title", title);

        System.out.println("Title: " + title);
        System.out.println("Sleep duration: " + sleepduration);
        System.out.println("Sleep quality: " + sleepquality);
        System.out.println("Sport duration: " + sportduration);
        System.out.println("Sport intensity: " + sportintensity);
        System.out.println("Sense of wellbeing: " + wellbeing);
        System.out.println("Image: " + image);

        return "redirect:/addEntry";
    }

}
