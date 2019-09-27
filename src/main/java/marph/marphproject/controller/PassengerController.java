package marph.marphproject.controller;

import marph.marphproject.entity.Passenger;
import marph.marphproject.repository.PassengerRepository;
import marph.marphproject.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passenger")
public class PassengerController {

    @Autowired
    PassengerService passengerService;



    @GetMapping(produces = "application/json")
    public @ResponseBody Iterable<Passenger> getPassenger(){
        return passengerService.getPassenger();
    }


    @PostMapping
    public String savePassenger(@RequestBody Passenger passenger){
        passengerService.savePassenger(passenger);
        return passenger.getName();

    }

    @DeleteMapping
    public void deletePassenger(@RequestBody Passenger passenger){
        passengerService.deletePassenger(passenger);
    }

    @PatchMapping
    public void updatePassenger(@RequestBody Passenger passenger){
        passengerService.savePassenger(passenger);
    }
}
