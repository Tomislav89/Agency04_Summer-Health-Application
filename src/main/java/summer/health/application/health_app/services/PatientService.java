package summer.health.application.health_app.services;
import org.springframework.stereotype.Service;
import summer.health.application.health_app.model.Patient;
import java.util.Set;

@Service
public interface PatientService extends CrudService<Patient, Long> {
    Patient findByLastName(String lastName);
    Set PatientsOlderThenEnlistedAfter();
    Set PatientsWithCaughingAndFever();


}
