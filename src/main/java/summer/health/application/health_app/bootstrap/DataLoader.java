package summer.health.application.health_app.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import summer.health.application.health_app.model.*;
import summer.health.application.health_app.repositories.DoctorRepository;
import summer.health.application.health_app.repositories.PatientRepository;
import summer.health.application.health_app.repositories.SymptomRepository;

import java.util.Date;

@Component
public class DataLoader implements CommandLineRunner {

    /*
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;
    private final SymptomRepository symptomRepository;



    public DataLoader(DoctorRepository doctorRepository, PatientRepository patientRepository, SymptomRepository symptomRepository) {
        this.doctorRepository = doctorRepository;
        this.patientRepository = patientRepository;
        this.symptomRepository = symptomRepository;

    }

     */

    @Override
    public void run(String... args) throws Exception {


        /*Doctor doctor_1 = new Doctor("Hannibal", "Lecter", DoctorExpertise.PEDIATRICIAN);
        Doctor doctor_2 = new Doctor("Tomislav", "Zivkovic", DoctorExpertise.PLASTIC_SURGEON);
        Doctor doctor_3 = new Doctor("Petra", "Peric", DoctorExpertise.GENERAL_DOCTOR);
        Doctor doctor_4 = new Doctor("Maja", "Majic", DoctorExpertise.SPORTS_MEDICINE_SPECIALIST);

        doctorRepository.save(doctor_1);
        doctorRepository.save(doctor_2);
        doctorRepository.save(doctor_3);
        doctorRepository.save(doctor_4);

        Patient patient_1 = new Patient("Ivan" , "Ivic", "ivan@gmal.com", 23, "0998118181", Gender.MALE, new Date(02-01-2020), Status.DIAGNOSED);
        Patient patient_2 = new Patient("Tina" , "Tinic", "tina@gmal.com", 19, "0988585858", Gender.FEMALE, new Date(22-01-2019), Status.UNDER_TREATMENT);
        Patient patient_3 = new Patient("Ana" , "Anic", "ana@gmal.com", 25, "0985888554", Gender.FEMALE, new Date(14-04-2020), Status.UNDER_DIAGNOSIS);
        Patient patient_4 = new Patient("Mario" , "Maric", "mArio@gmal.com", 51, "0985858585", Gender.MALE, new Date(02-06-2017), Status.CURED);

        patientRepository.save(patient_1);
        patientRepository.save(patient_2);
        patientRepository.save(patient_3);
        patientRepository.save(patient_4);

        Symptom symptom_1 = new Symptom("Caughing");
        Symptom symptom_2 = new Symptom("Fever");
        Symptom symptom_3 = new Symptom("Bleeding");
        Symptom symptom_4 = new Symptom("Dizzy");

        symptomRepository.save(symptom_1);
        symptomRepository.save(symptom_2);
        symptomRepository.save(symptom_3);
        symptomRepository.save(symptom_4);*/


    }
}
