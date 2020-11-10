package summer.health.application.health_app.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Table(name = "symptom")

@Entity
public class Symptom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_medical_record_id")
    PatientMedicalRecord patientMedicalRecord;

    @Column(name = "description")
    private String description;
}
