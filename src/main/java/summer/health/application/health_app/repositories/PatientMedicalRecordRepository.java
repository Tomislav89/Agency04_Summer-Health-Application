package summer.health.application.health_app.repositories;

import org.springframework.data.repository.CrudRepository;
import summer.health.application.health_app.model.PatientMedicalRecord;

public interface PatientMedicalRecordRepository extends CrudRepository<PatientMedicalRecord, Long> {

}
