package summer.health.application.health_app.services.springdatajpa;

import org.springframework.stereotype.Service;
import summer.health.application.health_app.model.Doctor;
import summer.health.application.health_app.repositories.DoctorRepository;
import summer.health.application.health_app.services.DoctorService;
import java.util.HashSet;
import java.util.Set;

@Service
public class DoctorSDJpaService implements DoctorService {

private final DoctorRepository doctorRepository;

    public DoctorSDJpaService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public Doctor findByLastName(String lastName) {
        return doctorRepository.findByLastName(lastName);
    }

    @Override
    public Set<Doctor> findAll() {
        Set<Doctor> doctors = new HashSet<>();
        doctorRepository.findAll().forEach(doctors::add);
        return doctors;
    }

    @Override
    public Doctor findById(Long aLong) {
        return doctorRepository.findById(aLong).orElse(null);
    }

    @Override
    public Doctor save(Doctor object) {
        return doctorRepository.save(object);
    }

    @Override
    public void delete(Doctor object) {
        doctorRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        doctorRepository.deleteById(aLong);
    }

}
