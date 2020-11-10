package summer.health.application.health_app.services;

import summer.health.application.health_app.model.Doctor;

public interface DoctorService extends CrudService<Doctor, Long> {
    Doctor findByLastName(String lastName);
}
