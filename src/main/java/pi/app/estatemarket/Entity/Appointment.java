package pi.app.estatemarket.Entity;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity

public class Appointment implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int appointmentId;
    @Temporal(TemporalType.DATE)
    private Date appointmentDate;
    private Boolean appointmentStatus;
}
