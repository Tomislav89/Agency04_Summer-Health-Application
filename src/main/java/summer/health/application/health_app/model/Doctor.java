package summer.health.application.health_app.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String lastName;
    private DoctorExpertise doctorExpertise;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor", fetch = FetchType.LAZY)
    private Set<Appointment> appointments = new HashSet<>();

    public Doctor(String name, String lastName, DoctorExpertise doctorExpertise) {
        this.name = name;
        this.lastName = lastName;
        this.doctorExpertise = doctorExpertise;
    }

    public Doctor() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DoctorExpertise getDoctorExpertise() {
        return doctorExpertise;
    }

    public void setDoctorExpertise(DoctorExpertise doctorExpertise) {
        this.doctorExpertise = doctorExpertise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(id, doctor.id) &&
                Objects.equals(name, doctor.name) &&
                Objects.equals(lastName, doctor.lastName) &&
                doctorExpertise == doctor.doctorExpertise;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, doctorExpertise);
    }
}
