package be.thomasmore.campusgear.repositories;

import be.thomasmore.campusgear.model.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Integer> {
    List<Item> findByCampusId(Integer campusId);
}