package summer.health.application.health_app.model;

import javax.persistence.*;

@Entity
public class Symptom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    PatientMedicalRecord patientMedicalRecord;

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
