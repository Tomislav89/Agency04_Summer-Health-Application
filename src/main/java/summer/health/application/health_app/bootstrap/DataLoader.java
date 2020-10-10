package summer.health.application.health_app.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import summer.health.application.health_app.model.Doctor;
import summer.health.application.health_app.model.Patient;
import summer.health.application.health_app.services.DoctorService;
import summer.health.application.health_app.services.PatientService;

import javax.annotation.PostConstruct;


@Component
public class DataLoader implements CommandLineRunner {

    private final PatientService patientService;
    private final DoctorService doctorService;

    public DataLoader(PatientService patientService, DoctorService doctorService) {
        this.patientService = patientService;
        this.doctorService = doctorService;
    }

    @PostConstruct
    private void postConstruct() {
        Patient patient = new Patient("Tomislav", "Živković", "Male", 31);
        System.out.println(patient.toString());
        patientService.save(patient);
        System.out.println(patientService.count());

        Doctor doctor = new Doctor("Hannibal", "Lecter", "Psychiatrist");
        System.out.println(doctor.toString());
        doctorService.save(doctor);
        System.out.println(doctorService.count());
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
