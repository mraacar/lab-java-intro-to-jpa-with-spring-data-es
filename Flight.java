package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String flightNumber;
    private String aircraft;
    private Integer totalSeats;
    private Integer distance;

    public Flight() {}

    public Flight(String flightNumber, String aircraft, Integer totalSeats, Integer distance) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.totalSeats = totalSeats;
        this.distance = distance;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }

    public String getAircraft() { return aircraft; }
    public void setAircraft(String aircraft) { this.aircraft = aircraft; }

    public Integer getTotalSeats() { return totalSeats; }
    public void setTotalSeats(Integer totalSeats) { this.totalSeats = totalSeats; }

    public Integer getDistance() { return distance; }
    public void setDistance(Integer distance) { this.distance = distance; }
}
