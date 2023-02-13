package pi.app.estatemarket.Entity;

import lombok.*;
import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity

public class Announcement implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int announcmentId;
    @Enumerated(EnumType.STRING)
    private GoodType goodType;
    @Enumerated(EnumType.STRING)
    private LeaseType leaseType;
    private String area;
    private float price;
    private String description;
    private String address;
    private String image;
    @Temporal(TemporalType.DATE)
    private Date disponibility;
}
