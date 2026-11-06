package ie.atu.sample.service;

import ie.atu.sample.model.Booking;
import ie.atu.sample.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;

        public Booking addBooking(Booking )

    }
    public List<Booking> getAllBookings() {
        return (List<Booking>) bookingRepository.findAll();
    }
    public Booking getBookingById(long id) {
        return (Booking) bookingRepository.findById(id);
    }
    public List<Booking> findByAttendeeCount(long attendeeCount) {
        return bookingRepository.findByAttendeeCount(attendeeCount);
    }
    public List<Booking> findByOrganiserName(String organiserName) {
        return bookingRepository.findByOrganiserName(organiserName);
    }
}
