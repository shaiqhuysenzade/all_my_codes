package forWeb.day03.entities;

import lombok.*;

import javax.jws.soap.SOAPBinding;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    private int id;

    private String login;

    private String password;

    private Role role;

    public User(String login, String password, int role_Id, String role_Password) {
        this.login = login;
        this.password = password;
        this.role = new User.Role(role_Id, role_Password);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    @EqualsAndHashCode
    public static class Role {
        private int id;
        private String name;
    }
}
