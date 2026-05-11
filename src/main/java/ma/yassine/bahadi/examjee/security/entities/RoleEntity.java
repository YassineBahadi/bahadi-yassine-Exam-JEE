package ma.yassine.bahadi.examjee.security.entities;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author pc
 **/
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String roleName;
}
