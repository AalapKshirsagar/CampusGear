package be.thomasmore.campusgear.repositories;

import be.thomasmore.campusgear.model.Campus;
import org.springframework.data.repository.CrudRepository;

public interface CampusRepository extends CrudRepository<Campus, Integer> {
}