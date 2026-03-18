package be.thomasmore.campusgear.controllers;

import be.thomasmore.campusgear.model.Item;
import be.thomasmore.campusgear.repositories.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class ItemController {

    private final ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/itemlist")
    public String itemList(Model model) {
        Iterable<Item> items = itemRepository.findAll();
        model.addAttribute("items", items);
        return "itemlist";
    }

    @GetMapping({"/itemdetails", "/itemdetails/{id}"})
    public String itemDetails(
            @PathVariable(required = false) Integer id,
            Model model) {
        if (id != null) {
            Optional<Item> itemFromDb = itemRepository.findById(id);
            if (itemFromDb.isPresent()) {
                Item item = itemFromDb.get();
                model.addAttribute("item", item);

                long count = itemRepository.count();
                int prevId = (id == 1) ? (int) count : id - 1;
                int nextId = (id == count) ? 1 : id + 1;
                model.addAttribute("prevId", prevId);
                model.addAttribute("nextId", nextId);
            }
        }
        return "itemdetails";
    }
}