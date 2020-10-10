package summer.health.application.health_app.services;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import summer.health.application.health_app.model.Doctor;

@Service
public interface DoctorService extends CrudRepository<Doctor, Long> {
}
