package ma.yassine.bahadi.examjee.dtos;

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

    private String name;

    private String email;
}
