package com.example.FlightBookingApp.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FlightBookingApp.Entity.Flight;
import com.example.FlightBookingApp.Repository.FlightRepository;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    public List<Flight> getAllFlightsFromSourceToDestination(String source, String destination){

        return flightRepository.getAllList().stream().filter(item -> item.getSource().equalsIgnoreCase(source) 
        && item.getDestination().equalsIgnoreCase(destination)).collect(Collectors.toList());
        
    }
}
