package be.thomasmore.campusgear.controllers;

import be.thomasmore.campusgear.model.Item;
import be.thomasmore.campusgear.model.Campus;
import be.thomasmore.campusgear.model.Reservation;
import be.thomasmore.campusgear.repositories.CampusRepository;
import be.thomasmore.campusgear.repositories.ItemRepository;
import be.thomasmore.campusgear.repositories.ReservationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Controller
public class ItemController {

    private static final Logger logger =
            LoggerFactory.getLogger(ItemController.class);

    private final ItemRepository itemRepository;
    private final CampusRepository campusRepository;
    private final ReservationRepository reservationRepository;

    public ItemController(ItemRepository itemRepository,
                          CampusRepository campusRepository,
                          ReservationRepository reservationRepository) {
        this.itemRepository = itemRepository;
        this.campusRepository = campusRepository;
        this.reservationRepository = reservationRepository;
    }

    @GetMapping("/itemlist")
    public String itemList(
            @RequestParam(required = false) Integer campusId,
            @RequestParam(required = false) String category,
            @RequestParam(required = false)
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam(required = false)
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate,
            Model model) {

        logger.info(String.format(
                "itemList - campusId=%s, category=%s, startDate=%s, endDate=%s",
                campusId, category, startDate, endDate));

        // Haal gefilterde items op
        List<Item> items = itemRepository.findByFilter(campusId, category);

        // Filter op beschikbaarheid als datums zijn ingevuld
        if (startDate != null && endDate != null) {
            items = items.stream()
                    .filter(item -> !reservationRepository
                            .existsByItemIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(
                                    item.getId(), endDate, startDate))
                    .toList();
        }

        // Alle campussen voor dropdown
        Iterable<Campus> campussen = campusRepository.findAll();

        // Alle categorieën
        List<String> categories = List.of(
                "Gereedschap", "Boeken", "Elektronica",
                "Muziek", "Huishouden", "Sport"
        );

        model.addAttribute("items", items);
        model.addAttribute("campussen", campussen);
        model.addAttribute("categories", categories);
        model.addAttribute("totalCount", itemRepository.count());

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

                // Zoek actieve reservatie voor dit item
                Optional<Reservation> reservatie = reservationRepository
                        .findFirstByItemIdAndEndDateGreaterThanEqual(
                                id, LocalDate.now());
                if (reservatie.isPresent()) {
                    model.addAttribute("beschikbaarVanaf",
                            reservatie.get().getEndDate().plusDays(1));
                }

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