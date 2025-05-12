package osinovii.spring.security.authenticationandauthorization.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import osinovii.spring.security.authenticationandauthorization.models.Application;
import osinovii.spring.security.authenticationandauthorization.models.MyUser;
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
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public List<Application> getAllApps() {
        return appService.allApps();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Application getApp(@PathVariable int id) {
        return appService.appById(id);
    }

    @PostMapping("/new-user")
    public String addNewUser(@RequestBody MyUser user) {
     appService.addUser(user);
     return "User added";
    }

}
