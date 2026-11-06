package ie.atu.sample.client;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        name = "Room-Service",
        url = "Http://localhost:8081"
)

public class BookingClient {
}
