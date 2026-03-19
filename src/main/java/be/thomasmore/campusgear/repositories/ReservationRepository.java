package be.thomasmore.campusgear.repositories;

import be.thomasmore.campusgear.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Integer> {
    boolean existsByItemIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(
            Integer itemId,
            java.time.LocalDate endDate,
            java.time.LocalDate startDate
    );
}