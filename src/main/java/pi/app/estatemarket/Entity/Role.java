package pi.app.estatemarket.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity(name = "consumer_role")
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idRole;
    private String roleName;
    @OneToMany(mappedBy = "part")
    private Set<User> listUsers;


}
