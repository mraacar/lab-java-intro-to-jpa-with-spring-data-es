package com.example.demo;

import com.example.demo.model.Customer;
import com.example.demo.model.CustomerStatus;
import com.example.demo.model.Flight;
import com.example.demo.model.FlightBooking;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.FlightBookingRepository;
import com.example.demo.repository.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner run(CustomerRepository customerRepo,
                          FlightRepository flightRepo,
                          FlightBookingRepository bookingRepo) {
        return args -> {
            Customer c1 = customerRepo.save(new Customer("Alice", CustomerStatus.GOLD, 120000));
            Customer c2 = customerRepo.save(new Customer("CHINO", CustomerStatus.SILVER, 90000));
            Customer c3 = customerRepo.save(new Customer("AMERICANO", CustomerStatus.NONE, 10000));

            Flight f1 = flightRepo.save(new Flight("AB123", "Boeing 747", 300, 400));
            Flight f2 = flightRepo.save(new Flight("CD456", "Airbus A333", 180, 300));
            Flight f3 = flightRepo.save(new Flight("EF789", "Boeing 777", 350, 500));

            bookingRepo.save(new FlightBooking(c1.getId(), f1.getId()));
            bookingRepo.save(new FlightBooking(c2.getId(), f2.getId()));
            bookingRepo.save(new FlightBooking(c3.getId(), f3.getId()));
        };
    }
}
