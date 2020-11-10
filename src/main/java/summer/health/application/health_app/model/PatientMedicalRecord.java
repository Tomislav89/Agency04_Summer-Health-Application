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
@Table(name = "patient_medical_record")

@Entity
public class PatientMedicalRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patientMedicalRecord", fetch = FetchType.LAZY)
    private Set<Patient> patients = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patientMedicalRecord", fetch = FetchType.LAZY)
    private Set<Symptom> symptoms = new HashSet<>();

    @Column(name = "diagnosis")
    private String diagnosis;
    @Column(name = "treatment")
    private String treatment;
}
