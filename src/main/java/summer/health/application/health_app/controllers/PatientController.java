package summer.health.application.health_app.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import summer.health.application.health_app.services.PatientService;

@RequestMapping("/api")
@Controller
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @RequestMapping({"patient"})
    public String listPatients(Model model){
        model.addAttribute("patients", patientService.findAll());
        return "patients/index";
    }
}
