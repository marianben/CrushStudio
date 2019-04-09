package crushstudio.crush_studio.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "his_role")
public enum HoHeIs {
    ADMIN, USER;

    @OneToMany
    @JoinTable(name="admin_user",
    joinColumns = @JoinColumn(name="admin_id"),
    inverseJoinColumns = @JoinColumn(name="user_id"))
    private List<Admin> admin_users;


}
