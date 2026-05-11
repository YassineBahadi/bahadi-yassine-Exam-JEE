package ma.yassine.bahadi.examjee.security.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author pc
 **/
@Getter
@Setter
public class LoginRequest {
    private String username;
    private String password;
}
