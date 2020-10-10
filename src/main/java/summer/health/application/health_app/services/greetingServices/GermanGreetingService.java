package summer.health.application.health_app.services.greetingServices;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("GER")
@Service("i18nService")
public class GermanGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Guten tag Clarice";
    }
}
