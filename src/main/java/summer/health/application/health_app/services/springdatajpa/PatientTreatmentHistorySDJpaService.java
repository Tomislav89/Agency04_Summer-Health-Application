package summer.health.application.health_app.services.springdatajpa;

import org.springframework.stereotype.Service;
import summer.health.application.health_app.model.PatientTreatmentHistory;
import summer.health.application.health_app.repositories.PatientTreatmentHistoryRepository;
import summer.health.application.health_app.services.PatientTreatmentHisotryService;

import java.util.HashSet;
import java.util.Set;

@Service
public class PatientTreatmentHistorySDJpaService implements PatientTreatmentHisotryService {

    private final PatientTreatmentHistoryRepository patientTreatmentHistoryRepository;

    public PatientTreatmentHistorySDJpaService(PatientTreatmentHistoryRepository patientTreatmentHistoryRepository) {
        this.patientTreatmentHistoryRepository = patientTreatmentHistoryRepository;
    }

    @Override
    public Set<PatientTreatmentHistory> findAll() {
        Set<PatientTreatmentHistory> patientTreatmentHistories = new HashSet<>();
        patientTreatmentHistoryRepository.findAll().forEach(patientTreatmentHistories::add);
        return patientTreatmentHistories;
    }

    @Override
    public PatientTreatmentHistory findById(Long aLong) {
        return patientTreatmentHistoryRepository.findById(aLong).orElse(null);
    }

    @Override
    public PatientTreatmentHistory save(PatientTreatmentHistory object) {
        return patientTreatmentHistoryRepository.save(object);
    }

    @Override
    public void delete(PatientTreatmentHistory object) {
        patientTreatmentHistoryRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        patientTreatmentHistoryRepository.deleteById(aLong);
    }
}
