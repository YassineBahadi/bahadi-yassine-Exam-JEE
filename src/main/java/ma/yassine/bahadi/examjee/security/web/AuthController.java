package ma.yassine.bahadi.examjee.security.web;

import lombok.AllArgsConstructor;
import ma.yassine.bahadi.examjee.security.dto.LoginRequest;
import ma.yassine.bahadi.examjee.security.services.AuthService;
import org.springframework.web.bind.annotation.*;

/**
 * @author pc
 **/
@RestController
@RequestMapping("/auth")
@AllArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        return authService.login(request.getUsername());
    }
}
