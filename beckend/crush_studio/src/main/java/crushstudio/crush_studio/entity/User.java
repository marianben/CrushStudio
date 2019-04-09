package crushstudio.crush_studio.entity;

import crushstudio.crush_studio.config.anototion.CrushAnotation;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "user")
public class User extends BaseEntity {
    @CrushAnotation
    @Column(name = "fullname")
    private String fullname;

    @CrushAnotation
    @Column(name = "age")
    private int age;

    @CrushAnotation
    @Column(name = "nick")
    private String nickname;

    @CrushAnotation
    @Column(name = "phone_number")
    private String numberPhone;

    @CrushAnotation
    @Column(name = "email")
    private String email;

    @CrushAnotation
    @Column(name = "main_city")
    private String mainCity;

    @Column(name = " day_when_you_create")
    private LocalDate localDate;

    //There must be information about you, hobby or who you are
    @CrushAnotation
    @Column(name = "info", columnDefinition = "TEXT")
    private String specialInfoForYou;


    @OneToOne(mappedBy = "user")
    @JoinColumn(name = "id")
    private UserAuthentification authentification;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private HoHeIs hoHeIs;
}
