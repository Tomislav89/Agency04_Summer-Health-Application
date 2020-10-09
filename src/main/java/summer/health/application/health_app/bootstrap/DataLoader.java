package summer.health.application.health_app.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import summer.health.application.health_app.model.Patient;
import summer.health.application.health_app.services.PatientService;


@Component
public class DataLoader implements CommandLineRunner {

    private final PatientService patientService;

    public DataLoader(PatientService patientService) {
        this.patientService = patientService;
    }

    @Override
    public void run(String... args) throws Exception {

        Patient patient = new Patient("Tomislav", "Živković", "Male", 31);
        System.out.println(patient.toString());
        patientService.save(patient);
        System.out.println(patientService.count());

    }
}
