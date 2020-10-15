package summer.health.application.health_app.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import summer.health.application.health_app.model.Doctor;
import summer.health.application.health_app.model.Patient;
import summer.health.application.health_app.services.DoctorService;
import summer.health.application.health_app.services.PatientService;

import javax.annotation.PostConstruct;

// We can use @Component across the application to mark the beans as Spring's managed components.
// Spring only pick up and registers beans with @Component  and doesn't look for @Service and @Repository in general.
//@Service and @Repository are special cases of @Component. They are technically the same but we use them for the different purposes.

@Component
public class DataLoader implements CommandLineRunner {

    private final PatientService patientService;
    private final DoctorService doctorService;

    public DataLoader(PatientService patientService, DoctorService doctorService) {
        this.patientService = patientService;
        this.doctorService = doctorService;
    }

    //Spring calls methods annotated with @PostConstruct only once,
    // just after the initialization of bean properties. Keep in mind that these methods will run even if there is nothing to initialize
    //The method annotated with @PostConstruct can have any access level but it can't be static.

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
