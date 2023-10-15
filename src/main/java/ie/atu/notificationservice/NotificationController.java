package ie.atu.notificationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @PostMapping("/sendNotification")
    public String notifyUser(@RequestBody UserDetails userDetails){
        return "User "+ userDetails.getName()+"("+ userDetails.getEmail()+ ") has been successfully registered.";
    }
}
