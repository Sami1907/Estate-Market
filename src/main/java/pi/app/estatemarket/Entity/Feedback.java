package pi.app.estatemarket.Entity;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int feedbackId;
    private String feedbackMessage;
    @Temporal(TemporalType.DATE)
    private Date  feedbackDate;
}
