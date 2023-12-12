package ie.atu.week11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

public class UserController {

    private RegistrationServiceClient registrationServiceClient;
    private final AcknowledgeService acknowledgeService;

    @Autowired
    public UserController(AcknowledgeService acknowledgeService, RegistrationServiceClient registrationServiceClient){
        this.acknowledgeService = acknowledgeService;
        this.registrationServiceClient = registrationServiceClient;
    }

    @PostMapping("/confirm-and-register")
    public String confirmAndRegister(@RequestBody UserDetails userDetails){
        String confirm = registrationServiceClient.someDetails(userDetails);
        String response = confirm + "" + acknowledgeService.ackMessage(userDetails);
        return response;
    }
}
