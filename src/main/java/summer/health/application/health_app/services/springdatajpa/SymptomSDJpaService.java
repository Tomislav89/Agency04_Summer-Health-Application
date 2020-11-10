package summer.health.application.health_app.services.springdatajpa;

import org.springframework.stereotype.Service;
import summer.health.application.health_app.model.Symptom;
import summer.health.application.health_app.repositories.SymptomRepository;
import summer.health.application.health_app.services.SymptomService;

import java.util.HashSet;
import java.util.Set;

@Service
public class SymptomSDJpaService implements SymptomService {

    private final SymptomRepository symptomRepository;

    public SymptomSDJpaService(SymptomRepository symptomRepository) {
        this.symptomRepository = symptomRepository;
    }

    @Override
    public Set<Symptom> findAll() {
        Set<Symptom> symptoms = new HashSet<>();
        symptomRepository.findAll().forEach(symptoms::add);
        return symptoms;
    }

    @Override
    public Symptom findById(Long aLong) {
        return symptomRepository.findById(aLong).orElse(null);
    }

    @Override
    public Symptom save(Symptom object) {
        return symptomRepository.save(object);
    }

    @Override
    public void delete(Symptom object) {
        symptomRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        symptomRepository.deleteById(aLong);
    }
}
