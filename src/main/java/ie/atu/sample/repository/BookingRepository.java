package ie.atu.sample.repository;

import ie.atu.sample.model.Booking;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookingRepository extends CrudRepository<Booking, Long> {
    List<Booking>findByAttendeeCount(long attendeeCount);
    List<Booking>findByOrganiserName(String organiserName);
    List<Booking>findById(long id);
}
