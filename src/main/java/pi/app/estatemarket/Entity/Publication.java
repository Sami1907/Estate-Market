package pi.app.estatemarket.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity

public class Publication  implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int publicationId;
    @Temporal(TemporalType.DATE)
    private Date publicationDate;
    private String description;
    private  int likes;
}
