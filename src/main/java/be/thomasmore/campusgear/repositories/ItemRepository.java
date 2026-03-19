package be.thomasmore.campusgear.repositories;

import be.thomasmore.campusgear.model.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Integer> {

    List<Item> findByCampusId(Integer campusId);

    @Query("SELECT i FROM Item i WHERE " +
            "(:campusId IS NULL OR i.campus.id = :campusId) AND " +
            "(:category IS NULL OR i.category = :category)")
    List<Item> findByFilter(
            @Param("campusId") Integer campusId,
            @Param("category") String category
    );
}