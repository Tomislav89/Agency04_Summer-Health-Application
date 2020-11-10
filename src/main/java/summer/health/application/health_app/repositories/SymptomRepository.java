package summer.health.application.health_app.repositories;

import org.springframework.data.repository.CrudRepository;
import summer.health.application.health_app.model.Symptom;

public interface SymptomRepository extends CrudRepository<Symptom,Long> {
}
