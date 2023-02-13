package pi.app.estatemarket.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity

public class Agency implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int agencyId;
    private  String agencyNname;
    private  String agencyType;
    private String address;
    private String description;
    private String email;
    private int phone;

}
