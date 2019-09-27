package marph.marphproject.repository;
import marph.marphproject.entity.Passenger;
import marph.marphproject.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface PassengerRepository extends CrudRepository<Passenger, Long> {
}
