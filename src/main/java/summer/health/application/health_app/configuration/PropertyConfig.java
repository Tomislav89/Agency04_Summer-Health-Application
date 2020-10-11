package summer.health.application.health_app.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import summer.health.application.health_app.model.Clinic;

@Configuration
@PropertySource("classpath:application.properties")

public class PropertyConfig {

    @Value("${clinic.name}")
    String clinicName;

    @Value("${clinic.web.url}")
    String clinicUrl;

    @Bean
    public Clinic clinic(){
        Clinic clinic = new Clinic();
        clinic.setClinicName(clinicName);
        clinic.setClinicUrl(clinicUrl);
        return clinic;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
