package be.thomasmore.campusgear.repositories;

import be.thomasmore.campusgear.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}