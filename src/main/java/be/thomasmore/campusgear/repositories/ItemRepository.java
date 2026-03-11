package be.thomasmore.campusgear.repositories;

import be.thomasmore.campusgear.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {
}