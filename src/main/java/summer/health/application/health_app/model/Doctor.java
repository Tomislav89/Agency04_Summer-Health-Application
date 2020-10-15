package summer.health.application.health_app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Doctor {

    private String name;
    private String lastName;
    private String speciality;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Doctor(String name, String lastName, String speciality) {
        this.name = name;
        this.lastName = lastName;
        this.speciality = speciality;
    }

    public Doctor() {

    }

    public Long getId() {
        return id;
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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(name, doctor.name) &&
                Objects.equals(lastName, doctor.lastName) &&
                Objects.equals(speciality, doctor.speciality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, speciality);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
