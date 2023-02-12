package pi.app.estatemarket.Entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name="usersA")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int idUser;
@Column(name="XX")
    int montantContrat;

}
