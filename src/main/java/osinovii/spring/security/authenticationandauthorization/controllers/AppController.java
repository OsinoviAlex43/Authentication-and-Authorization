package osinovii.spring.security.authenticationandauthorization.controllers;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import osinovii.spring.security.authenticationandauthorization.models.Application;
import osinovii.spring.security.authenticationandauthorization.services.AppService;

import java.util.List;

@RestController
@RequestMapping("api/v1/apps")
@RequiredArgsConstructor
public class AppController {
    private final AppService appService;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the unprotected page";
    }

    @GetMapping("/all-apps")
    public List<Application> getAllApps() {
        return appService.allApps();
    }

    @GetMapping("/{id}")
    public Application getApp(@PathVariable int id) {
        return appService.appById(id);
    }

}
