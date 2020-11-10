package summer.health.application.health_app.services;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import summer.health.application.health_app.model.Patient;

@Service
public interface PatientService extends CrudService<Patient, Long> {
    Patient findByLastName(String lastName);

}
