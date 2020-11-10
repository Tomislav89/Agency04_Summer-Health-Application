package summer.health.application.health_app.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class PatientTreatmentHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patientTreatmentHistory", fetch = FetchType.LAZY)
    private Set<Patient> patientTreatmentHistories = new HashSet<>();

  //  private Patient patient;
  //  private Doctor doctor;

    private String treatmentRemark;
    private Status oldStatus;
    private Status newStatus;


    public String getTreatmentRemark() {
        return treatmentRemark;
    }

    public void setTreatmentRemark(String treatmentRemark) {
        this.treatmentRemark = treatmentRemark;
    }

    public Status getOldStatus() {
        return oldStatus;
    }

    public void setOldStatus(Status oldStatus) {
        this.oldStatus = oldStatus;
    }

    public Status getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(Status newStatus) {
        this.newStatus = newStatus;
    }
}
