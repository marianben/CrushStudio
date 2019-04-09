package crushstudio.crush_studio.entity;

import crushstudio.crush_studio.config.anototion.CrushAnotation;
import lombok.Data;
import javax.persistence.*;


@Data
@Entity
@Table(name = "user_authentification")
public class UserAuthentification extends  BaseEntity {

    @Column(name = " user_password")
    @CrushAnotation
    private String password;

    @Column(name = "user_login", unique = true)
    @CrushAnotation
    private String login;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
