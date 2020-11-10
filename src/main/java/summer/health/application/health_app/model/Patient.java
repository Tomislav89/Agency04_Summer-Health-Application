package summer.health.application.health_app.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patient", fetch = FetchType.LAZY)
    private Set<Appointment> appointments = new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER)
    PatientTreatmentHistory patientTreatmentHistory;

    @ManyToOne(fetch = FetchType.EAGER)
    PatientMedicalRecord patientMedicalRecord;

    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    private String phoneNumber;
    private Gender gender;
    private Date enlistmentDate;
    private Status status;

    public Patient(String firstName, String lastName, String email, Integer age, String phoneNumber, Gender gender, Date enlistmentDate, Status status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.enlistmentDate = enlistmentDate;
        this.status = status;
    }

    public Patient() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getEnlistmentDate() {
        return enlistmentDate;
    }

    public void setEnlistmentDate(Date enlistmentDate) {
        this.enlistmentDate = enlistmentDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(id, patient.id) &&
                Objects.equals(firstName, patient.firstName) &&
                Objects.equals(lastName, patient.lastName) &&
                Objects.equals(email, patient.email) &&
                Objects.equals(age, patient.age) &&
                Objects.equals(phoneNumber, patient.phoneNumber) &&
                Objects.equals(gender, patient.gender) &&
                Objects.equals(enlistmentDate, patient.enlistmentDate) &&
                Objects.equals(status, patient.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, age, phoneNumber, gender, enlistmentDate, status);
    }
}
