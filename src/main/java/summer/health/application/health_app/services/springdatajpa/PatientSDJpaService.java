package summer.health.application.health_app.services.springdatajpa;

import org.springframework.stereotype.Service;
import summer.health.application.health_app.model.Patient;
import summer.health.application.health_app.repositories.PatientRepository;
import summer.health.application.health_app.services.PatientService;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Service
public class PatientSDJpaService implements PatientService {

    private final PatientRepository patientRepository;

    public PatientSDJpaService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient findByLastName(String lastName) {
        return patientRepository.findByLastName(lastName);
    }

    //Patients older than 21 enlisted after 1.1.2020.
    @Override
    public Set PatientsOlderThenEnlistedAfter() {
        Set<Patient> patients = new HashSet<>();
        patientRepository.findAll().forEach(patients::add);
        Set<Patient>olderThanEnlistedSince = new HashSet<>();
        if(patients != null)
        {
            patients.forEach((patient) ->
            {
                if(patient.getAge() > 21 && patient.getEnlistmentDate().after(new Date(01-01-2020))){
                    olderThanEnlistedSince.add(patient);
                }else {
                    System.out.println("No patients older than 21 enlisted after 1.1.2020.");
                }
            });
        }

        return olderThanEnlistedSince;
    }

    //Patients with symptoms such as caughing and fever
    @Override
    public Set PatientsWithCaughingAndFever() {
        Set<Patient> patients = new HashSet<>();
        patientRepository.findAll().forEach(patients::add);
        Set<Patient>coughingAndFever = new HashSet<>();
        if(patients != null)
        {
            patients.forEach((patient) ->
            {
                if(patient.getPatientMedicalRecord().getSymptoms().equals("Coughing") || patient.getPatientMedicalRecord().getSymptoms().equals("Fever")){
                    coughingAndFever.add(patient);
                }else {
                    System.out.println("No older patients with symptoms such as caughing and fever");
                }
            });
        }

        return coughingAndFever;
    }


    @Override
    public Set<Patient> findAll() {
        Set<Patient> patients = new HashSet<>();
        patientRepository.findAll().forEach(patients::add);
        return patients;
    }

    @Override
    public Patient findById(Long aLong) {
        return patientRepository.findById(aLong).orElse(null);
    }

    @Override
    public Patient save(Patient object) {
        return patientRepository.save(object);
    }

    @Override
    public void delete(Patient object) {
        patientRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        patientRepository.deleteById(aLong);
    }
}
