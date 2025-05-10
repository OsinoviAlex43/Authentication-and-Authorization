package osinovii.spring.security.authenticationandauthorization.services;

import com.github.javafaker.Faker;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import osinovii.spring.security.authenticationandauthorization.models.Application;

import java.util.List;
import java.util.stream.IntStream;
@Service
public class AppService {
    private List<Application> apps;

    //ALL this logic truly should be in repository layer
    @PostConstruct
    public void loadAppInDatabase() {
        Faker faker = new Faker();
        apps = IntStream.range(1, 100).mapToObj(i -> Application.builder().id(i)
                .name(faker.app().name())
                .author(faker.app().author())
                .version(faker.app().version())
                .build())
                .toList();
    }

    public List<Application> allApps() {
        return apps;
    }

    public Application appById(int id) {
        return apps.stream().filter(app -> app.getId() == id).findFirst().orElse(null);
    }

}
