package crushstudio.crush_studio.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "abmin")
public class Admin extends BaseEntity{
    @Column(name = "email", unique = true)
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private String phonenumber;

    @ManyToMany
    @JoinColumn(name= "user")
    private List<User> users;
}
