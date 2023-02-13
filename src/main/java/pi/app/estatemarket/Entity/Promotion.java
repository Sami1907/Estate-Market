package pi.app.estatemarket.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity

public class Promotion implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int promotionId;
    @Temporal(TemporalType.DATE)
    private Date promotionDate;
    private String promotionName;
    private int pourcentage;
    private String duration;
}
