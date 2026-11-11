package ie.atu.sample.controller;

import ie.atu.sample.model.Booking;
import ie.atu.sample.service.BookingService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Bookings")
public class SampleController {

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    private final BookingService bookingService;
    public SampleController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public ResponseEntity<Booking> createBooking(@Valid @RequestBody Booking booking) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bookingService.addBooking(booking));
    }

    @GetMapping
    public ResponseEntity<List<Booking>> getAllBookings() {
        return ResponseEntity.ok(bookingService.getAllBookings());
    }

    @GetMapping
    public ResponseEntity<Booking> getBookingById(@Valid @PathVariable long id) {
        return ResponseEntity.ok(bookingService.getBookingById(id));
    }
}