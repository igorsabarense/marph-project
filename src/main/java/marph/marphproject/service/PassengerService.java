package marph.marphproject.service;

import marph.marphproject.entity.Passenger;
import marph.marphproject.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    public Iterable<Passenger> getPassenger(){
        Iterable<Passenger> passenger = passengerRepository.findAll();
        return passenger;
    }

    @Transactional
    public void savePassenger(Passenger passenger){
        passengerRepository.save(passenger);
    }

    @Transactional
    public void deletePassenger(Passenger passenger){
        passengerRepository.delete(passenger);
    }

    public void updatePassenger(Passenger passenger) { passengerRepository.save(passenger);}

}
