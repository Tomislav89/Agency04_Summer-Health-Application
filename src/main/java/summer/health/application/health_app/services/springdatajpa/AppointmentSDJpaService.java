package summer.health.application.health_app.services.springdatajpa;

import org.springframework.stereotype.Service;
import summer.health.application.health_app.model.Appointment;
import summer.health.application.health_app.repositories.AppointmentRepository;
import summer.health.application.health_app.services.AppointmentService;

import java.util.HashSet;
import java.util.Set;

@Service
public class AppointmentSDJpaService implements AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentSDJpaService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public Set<Appointment> findAll() {
        Set<Appointment> appointments= new HashSet<>();
        appointmentRepository.findAll().forEach(appointments::add);
        return appointments;
    }

    @Override
    public Appointment findById(Long aLong) {
        return appointmentRepository.findById(aLong).orElse(null);
    }

    @Override
    public Appointment save(Appointment object) {
        return appointmentRepository.save(object);
    }

    @Override
    public void delete(Appointment object) {
        appointmentRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        appointmentRepository.deleteById(aLong);
    }
}
