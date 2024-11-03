package com.example.FlightBookingApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.FlightBookingApp.Entity.Flight;
import com.example.FlightBookingApp.Service.FlightService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class FlightController {

    @Autowired
    FlightService flightService;

    @RequestMapping
    public String searchFlight(){
        return "search";
    }

    @RequestMapping(value = "/flightsearchresult", method=RequestMethod.POST)
    // public String requestMethodName(@RequestParam String param) {
    //     return new String();
    // }
    
    public String getSearchFlightResults(@RequestParam("source") String source, @RequestParam("destination") String destination,Model model){

        List<Flight> listOfSearchFlight = flightService.getAllFlightsFromSourceToDestination(source, destination);
        model.addAttribute("listofsearchedflights", listOfSearchFlight);
        return "success";
    }
}
