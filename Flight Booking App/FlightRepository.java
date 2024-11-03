package com.example.FlightBookingApp.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.FlightBookingApp.Database.FlightList;
import com.example.FlightBookingApp.Entity.Flight;

@Component
public class FlightRepository {

    @Autowired
    FlightList flightList;

    public List<Flight> getAllList(){
        return flightList.getAllFlights();
    }

}
