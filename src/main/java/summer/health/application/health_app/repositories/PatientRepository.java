package summer.health.application.health_app.repositories;

import org.springframework.data.repository.CrudRepository;
import summer.health.application.health_app.model.Patient;

public interface PatientRepository extends CrudRepository<Patient, Long> {
    Patient findByLastName(String lastName);
}
