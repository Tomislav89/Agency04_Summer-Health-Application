package summer.health.application.health_app.services.springdatajpa;

import org.springframework.stereotype.Service;
import summer.health.application.health_app.model.PatientMedicalRecord;
import summer.health.application.health_app.repositories.PatientMedicalRecordRepository;
import summer.health.application.health_app.services.PatientMedicalRecordService;

import java.util.HashSet;
import java.util.Set;

@Service
public class PatientMedicalRecordSDJpaService implements PatientMedicalRecordService {

    private final PatientMedicalRecordRepository patientMedicalRecordRepository;

    public PatientMedicalRecordSDJpaService(PatientMedicalRecordRepository patientMedicalRecordRepository) {
        this.patientMedicalRecordRepository = patientMedicalRecordRepository;
    }

    @Override
    public Set<PatientMedicalRecord> findAll() {
        Set<PatientMedicalRecord> patientMedicalRecords = new HashSet<>();
        patientMedicalRecordRepository.findAll().forEach(patientMedicalRecords::add);
        return patientMedicalRecords;
    }

    @Override
    public PatientMedicalRecord findById(Long aLong) {
        return  patientMedicalRecordRepository.findById(aLong).orElse(null);
    }

    @Override
    public PatientMedicalRecord save(PatientMedicalRecord object) {
        return patientMedicalRecordRepository.save(object);
    }

    @Override
    public void delete(PatientMedicalRecord object) {
        patientMedicalRecordRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        patientMedicalRecordRepository.deleteById(aLong);
    }
}


