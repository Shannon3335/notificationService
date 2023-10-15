package ie.atu.notificationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @PostMapping
    public String notifyUser(@RequestBody UserDetails userDetails){
        return "Added user "+ userDetails.getName();
    }
}
