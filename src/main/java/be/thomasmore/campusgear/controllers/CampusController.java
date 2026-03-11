package be.thomasmore.campusgear.controllers;

import be.thomasmore.campusgear.model.Campus;
import be.thomasmore.campusgear.repositories.CampusRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class CampusController {

    private final CampusRepository campusRepository;

    public CampusController(CampusRepository campusRepository) {
        this.campusRepository = campusRepository;
    }

    @GetMapping("/campusdetails")
    public String campusDetails(Model model) {
        Optional<Campus> campusFromDb = campusRepository.findById(1);
        if (campusFromDb.isPresent()) {
            model.addAttribute("campus", campusFromDb.get());
        }
        return "campusdetails";
    }
}