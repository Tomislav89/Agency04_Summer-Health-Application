package summer.health.application.health_app.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import summer.health.application.health_app.services.DoctorService;

@RequestMapping("/api")
@Controller
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @RequestMapping({"doctor"})
    public String listDoctors(Model model){
        model.addAttribute("doctors", doctorService.findAll());
        return "doctors/index";
    }


}
