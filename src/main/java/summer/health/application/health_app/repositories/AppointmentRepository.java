package summer.health.application.health_app.repositories;

import org.springframework.data.repository.CrudRepository;
import summer.health.application.health_app.model.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment, Long>{
}
