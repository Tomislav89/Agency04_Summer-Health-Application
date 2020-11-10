package summer.health.application.health_app.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class PatientMedicalRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patientMedicalRecord", fetch = FetchType.LAZY)
    private Set<Patient> patients = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patientMedicalRecord", fetch = FetchType.LAZY)
    private Set<Symptom> symptoms = new HashSet<>();

   // private Patient patient;
    private String diagnosis;
    private String treatment;


    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}
