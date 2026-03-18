package be.thomasmore.campusgear.controllers;

import be.thomasmore.campusgear.model.Campus;
import be.thomasmore.campusgear.model.Item;
import be.thomasmore.campusgear.repositories.CampusRepository;
import be.thomasmore.campusgear.repositories.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class CampusController {

    private final CampusRepository campusRepository;
    private final ItemRepository itemRepository;

    public CampusController(CampusRepository campusRepository,
                            ItemRepository itemRepository) {
        this.campusRepository = campusRepository;
        this.itemRepository = itemRepository;
    }

    @GetMapping("/campuslist")
    public String campusList(Model model) {
        Iterable<Campus> campussen = campusRepository.findAll();
        model.addAttribute("campussen", campussen);
        return "campuslist";
    }

    @GetMapping("/campusitems/{campusId}")
    public String campusItems(@PathVariable Integer campusId, Model model) {
        Optional<Campus> campusFromDb = campusRepository.findById(campusId);
        if (campusFromDb.isPresent()) {
            Campus campus = campusFromDb.get();
            List<Item> items = itemRepository.findByCampusId(campusId);
            model.addAttribute("campus", campus);
            model.addAttribute("items", items);
        }
        return "campusitems";
    }
}