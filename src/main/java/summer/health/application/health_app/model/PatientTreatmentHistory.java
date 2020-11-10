package summer.health.application.health_app.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Table(name = "patient_treatment_history")

@Entity
public class PatientTreatmentHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patientTreatmentHistory", fetch = FetchType.LAZY)
    private Set<Patient> patientTreatmentHistories = new HashSet<>();

    @Column(name = "treatment_remark")
    private String treatmentRemark;
    @Column(name = "old_status")
    private Status oldStatus;
    @Column(name = "new_status")
    private Status newStatus;
}
