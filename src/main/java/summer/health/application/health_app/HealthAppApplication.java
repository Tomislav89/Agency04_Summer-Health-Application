package summer.health.application.health_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import summer.health.application.health_app.controllers.I18nController;
import summer.health.application.health_app.model.Clinic;
import summer.health.application.health_app.model.Disease;
import summer.health.application.health_app.model.Therapy;

import javax.swing.text.StyledEditorKit;

@SpringBootApplication
@ImportResource("classpath:therapies.xml")
public class HealthAppApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(HealthAppApplication.class, args);
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        Clinic clinic = (Clinic) ctx.getBean(Clinic.class);
        System.out.println(clinic.getClinicName() + "\n" + "URL: " + clinic.getClinicUrl() +"\n" +
                "LinkedIn: " + clinic.getLinkedIn() + "\nTwitter: " + clinic.getTwitter() +"\nPicutre URL: " + clinic.getPicture());

        Disease disease = (Disease) ctx.getBean(Disease.class);
        disease.listPrintout();

        Therapy therapy = (Therapy) ctx.getBean(Therapy.class);
        System.out.println(therapy.getListTherapy().toString());

    }
}
