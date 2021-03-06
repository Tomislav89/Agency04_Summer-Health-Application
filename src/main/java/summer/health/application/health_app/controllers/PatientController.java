package summer.health.application.health_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import summer.health.application.health_app.model.Patient;
import summer.health.application.health_app.services.PatientService;

@RequestMapping("/api")
@Controller
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }


   /* @RequestMapping({"patient"})
    public String listPatients(Model model){
        model.addAttribute("patients", patientService.findAll());
        return "patients/index";
    }


    @PostMapping("newpatient")
    Patient newPatient(@RequestBody Patient newPatient) {
        return patientService.save(newPatient);
    }


    @DeleteMapping("/patients/{id}")
    void deletePatient(@PathVariable Long id) {
        patientService.deleteById(id);
    }


    @PutMapping("/employees/{id}")
    Patient replaceEmployee(@RequestBody Patient newPatient, @PathVariable Long id) {

        return patientService.findById(id)
                .map(patient -> {
                    patient.setFirstName(newPatient.getFirstName());
                    patient.setLastName(newPatient.getLastName());
                    return patientService.save(patient);
                })
                .orElseGet(() -> {
                    newPatient.setId(id);
                    return patientService.save(newPatient);
                });
    }*/

}
