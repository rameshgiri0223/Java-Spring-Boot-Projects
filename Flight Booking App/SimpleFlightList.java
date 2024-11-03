package com.example.FlightBookingApp.Database;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.FlightBookingApp.Entity.Flight;

@Component
public class SimpleFlightList implements FlightList {

    List<Flight> listOfFlight = new ArrayList<Flight>();

    public SimpleFlightList(){
        listOfFlight.add(new Flight("FL001", "KOLKATA", "BANGLORE"));
        listOfFlight.add(new Flight("FL002", "KOLKATA", "BANGLORE"));
        listOfFlight.add(new Flight("FL003", "KOLKATA", "DELHI"));
        listOfFlight.add(new Flight("FL004", "BBSR", "BANGLORE"));
        listOfFlight.add(new Flight("FL005", "BBSR", "KOLKATA"));
        listOfFlight.add(new Flight("FL006", "KOLKATA", "BBSR"));
        listOfFlight.add(new Flight("FL007", "BBSR", "DUBAI"));
        listOfFlight.add(new Flight("FL008", "DELHI", "BANGLORE"));
        listOfFlight.add(new Flight("FL009", "KOLKATA", "PUNE"));
        listOfFlight.add(new Flight("FL010", "BBSR", "MUMBAI"));
    }


    @Override
    public List<Flight> getAllFlights() {
        return this.listOfFlight;

        // throw new UnsupportedOperationException("Unimplemented method 'getAllFlights'");
    }

}
