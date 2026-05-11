package ma.yassine.bahadi.examjee.security.services;

import lombok.AllArgsConstructor;
import ma.yassine.bahadi.examjee.security.jwt.JwtUtil;
import org.springframework.stereotype.Service;

/**
 * @author pc
 **/
@Service
@AllArgsConstructor
public class AuthService {
    private final JwtUtil jwtUtil;

    public String login(String username) {

        return jwtUtil.generateToken(username);
    }
}
