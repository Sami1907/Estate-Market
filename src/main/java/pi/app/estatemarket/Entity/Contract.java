package pi.app.estatemarket.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity

public class Contract implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int contractId;
    @Temporal(TemporalType.DATE)
    private Date contractStartDate;
    @Temporal(TemporalType.DATE)
    private Date contractEndDate;
    private String contractType;
}
