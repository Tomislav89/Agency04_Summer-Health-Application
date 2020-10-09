package summer.health.application.health_app.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import summer.health.application.health_app.services.PatientService;

@RequestMapping("/patients")
@Controller
public class PatientController {

    private final PatientService patientService;

    public PatientController(@Qualifier("patientService")PatientService patientService) {
        this.patientService = patientService;
    }

    @RequestMapping({"", "/", "/index", "index.html"})
    public String listPatients(Model model){
        model.addAttribute("patients", patientService.findAll());
        return "patients/index";
    }
}
