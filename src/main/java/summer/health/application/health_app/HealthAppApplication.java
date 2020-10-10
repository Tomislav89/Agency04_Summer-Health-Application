package summer.health.application.health_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import summer.health.application.health_app.controllers.I18nController;

@SpringBootApplication
public class HealthAppApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(HealthAppApplication.class, args);

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());
    }

}
