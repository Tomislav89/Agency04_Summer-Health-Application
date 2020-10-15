package summer.health.application.health_app.services;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import summer.health.application.health_app.model.Patient;


//We mark beans with @Service to indicate that it's holding the business logic. So there's not any other specialty except using it in the service layer.

@Service
public interface PatientService extends CrudRepository<Patient, Long> {

}
