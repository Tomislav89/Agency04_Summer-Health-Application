package summer.health.application.health_app.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Table(name = "patient")

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patient", fetch = FetchType.LAZY)
    private Set<Appointment> appointments = new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patientTreatmentHistory_id")
    PatientTreatmentHistory patientTreatmentHistory;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patientMedicalRecord_id")
    PatientMedicalRecord patientMedicalRecord;

    @Column(name = "first_Name")
    private String firstName;
    @Column(name = "last_Name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "age")
    private Integer age;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "gender")
    private Gender gender;
    @Column(name = "enlistment_date")
    private Date enlistmentDate;
    @Column(name = "status")
    private Status status;
}
