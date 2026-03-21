package be.thomasmore.campusgear.repositories;

import be.thomasmore.campusgear.model.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface ReservationRepository extends CrudRepository<Reservation, Integer> {

    boolean existsByItemIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(
            Integer itemId,
            LocalDate endDate,
            LocalDate startDate
    );

    Optional<Reservation> findFirstByItemIdAndEndDateGreaterThanEqual(
            Integer itemId,
            LocalDate today
    );
}