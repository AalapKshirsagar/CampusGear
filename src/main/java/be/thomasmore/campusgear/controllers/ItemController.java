package be.thomasmore.campusgear.controllers;

import be.thomasmore.campusgear.model.Item;
import be.thomasmore.campusgear.repositories.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class ItemController {

    private final ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/itemdetails")
    public String itemDetails(Model model) {
        Optional<Item> itemFromDb = itemRepository.findById(1);
        if (itemFromDb.isPresent()) {
            model.addAttribute("item", itemFromDb.get());
        }
        return "itemdetails";
    }
}