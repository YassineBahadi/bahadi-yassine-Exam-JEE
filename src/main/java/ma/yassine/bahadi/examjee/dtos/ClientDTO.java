package ma.yassine.bahadi.examjee.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author pc
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ClientDTO {
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;
    @Email(message = "Invalid email")
    private String email;
}
