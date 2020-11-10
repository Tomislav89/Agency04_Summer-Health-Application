package summer.health.application.health_app.repositories;

import org.springframework.data.repository.CrudRepository;
import summer.health.application.health_app.model.PatientTreatmentHistory;

public interface PatientTreatmentHistoryRepository extends CrudRepository<PatientTreatmentHistory, Long> {
}
