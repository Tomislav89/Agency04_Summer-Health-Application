package summer.health.application.health_app.repositories;

import org.springframework.data.repository.CrudRepository;
import summer.health.application.health_app.model.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {
    Doctor findByLastName(String lastName);
}
