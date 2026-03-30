package be.thomasmore.campusgear.controllers.admin;

import be.thomasmore.campusgear.model.Campus;
import be.thomasmore.campusgear.model.Item;
import be.thomasmore.campusgear.repositories.CampusRepository;
import be.thomasmore.campusgear.repositories.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class ItemAdminController {

    private static final Logger logger =
            LoggerFactory.getLogger(ItemAdminController.class);

    private final ItemRepository itemRepository;
    private final CampusRepository campusRepository;

    public ItemAdminController(ItemRepository itemRepository,
                               CampusRepository campusRepository) {
        this.itemRepository = itemRepository;
        this.campusRepository = campusRepository;
    }

    @ModelAttribute("item")
    public Item findItem(@PathVariable(required = false) Integer id) {
        if (id != null) {
            Optional<Item> itemFromDb = itemRepository.findById(id);
            return itemFromDb.orElse(null);
        }
        return null;
    }

    // GET edit pagina
    @GetMapping("/itemedit/{id}")
    public String itemEdit(@PathVariable Integer id, Model model) {
        logger.info(String.format("itemEdit - id=%d", id));
        Iterable<Campus> campussen = campusRepository.findAll();
        model.addAttribute("campussen", campussen);
        return "admin/itemedit";
    }

    // POST edit pagina
    @PostMapping("/itemedit/{id}")
    public String itemEditPost(@PathVariable Integer id, Item item) {
        logger.info(String.format("itemEditPost - id=%d", id));
        itemRepository.save(item);
        return "redirect:/itemdetails/" + id;
    }

    // GET nieuwe item pagina
    @GetMapping("/itemnew")
    public String itemNew(Model model) {
        logger.info("itemNew");
        Iterable<Campus> campussen = campusRepository.findAll();
        model.addAttribute("campussen", campussen);
        model.addAttribute("item", new Item());
        return "admin/itemnew";
    }

    // POST nieuwe item
    @PostMapping("/itemnew")
    public String itemNewPost(Item item) {
        logger.info("itemNewPost");
        if (item.getCampus() == null) {
            return "redirect:/admin/itemnew";
        }
        Item savedItem = itemRepository.save(item);
        return "redirect:/itemdetails/" + savedItem.getId();
    }

    // DELETE item
    @GetMapping("/itemdelete/{id}")
    public String itemDelete(@PathVariable Integer id) {
        logger.info(String.format("itemDelete - id=%d", id));
        itemRepository.deleteById(id);
        return "redirect:/itemlist";
    }
}