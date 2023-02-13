package pi.app.estatemarket.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity(name="Consumer")

public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    private String lastname;
    private String firstname;
    private String email;
    private String phone;
    private String address;
    private int age;
    private String userPassword;
    @Enumerated(EnumType.STRING)
    private GenderType genderType;
    @ManyToOne
    private Role part;

}
