package summer.health.application.health_app.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import summer.health.application.health_app.model.Clinic;
import summer.health.application.health_app.model.Disease;
import summer.health.application.health_app.services.doctorJokesService.DoctorJokesServiceImplementation;

import java.util.ArrayList;
import java.util.List;

// Configuration classes can contain bean definition methods annotated with @Bean
//@Bean methods may also be declared within classes that are not annotated with @Configuration. For example,
// bean methods may be declared in a @Component class or even in a plain old class. In such cases, a @Bean method will get processed in a so-called 'lite' mode.

@Configuration
@PropertySources({
        @PropertySource("classpath:application.properties"),
        @PropertySource("classpath:sha.properties"),
        @PropertySource("classpath:diseases.properties"),

})

public class PropertyConfig {

    // -Use the Value annotation on a method at parameter level to autowire arguments with property values
    @Value("${clinic.url.linkedin}") String linkedIn;
    @Value("${clinic.url.twitter}")String twitter;
    @Value("${picture.url}") String picture;

    @Value("#{${listOfDiseases}}") List<String>listOfDiseases = new ArrayList();

    // - Use the Value annotation to autowire at least two constructor arguments of a Bean with properties
    String clinicName, clinicUrl;
    public PropertyConfig(@Value("${clinic.name}") String clinicName,
                          @Value("${clinic.web.url}") String clinicUrl) {
        this.clinicName = clinicName;
        this.clinicUrl = clinicUrl;
    }

    //In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC
    //container are called beans. A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container.

    @Bean
    public Clinic clinic(){
        Clinic clinic = new Clinic();
        clinic.setClinicName(clinicName);
        clinic.setClinicUrl(clinicUrl);
        clinic.setLinkedIn(linkedIn);
        clinic.setTwitter(twitter);
        clinic.setPicture(picture);
        return clinic;
    }

    // Use Java annotations to register a Spring Bean to the context called 'diseases'
    @Bean
    public Disease diseases(){
        Disease disease = new Disease();
        disease.getListOfDiseases().add(listOfDiseases);
        return disease;
    }

    @Bean
    public List getDoctorsJokes(){
        DoctorJokesServiceImplementation doctorJokesServiceImplementation = new DoctorJokesServiceImplementation();
        return doctorJokesServiceImplementation.sayJoke();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
