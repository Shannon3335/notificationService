package ie.atu.notificationservice;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDetails {
    private String name;
    private String email;
}
