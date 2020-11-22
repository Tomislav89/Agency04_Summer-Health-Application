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
@Table(name = "doctor")

@Entity
public class Doctor extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "doctor_expertise_id")
    private DoctorExpertise doctorExpertise;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor", fetch = FetchType.LAZY)
    private Set<Appointment> appointments = new HashSet<>();

    @Builder
    public Doctor(String firstName, String lastName, Long id, DoctorExpertise doctorExpertise, Set<Appointment> appointments) {
        super(firstName, lastName);
        this.id = id;
        this.doctorExpertise = doctorExpertise;
        this.appointments = appointments;
    }


}
