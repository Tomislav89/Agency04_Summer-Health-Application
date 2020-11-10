package summer.health.application.health_app.services.springdatajpa;

import org.springframework.stereotype.Service;
import summer.health.application.health_app.model.Patient;
import summer.health.application.health_app.repositories.PatientRepository;
import summer.health.application.health_app.services.PatientService;

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
