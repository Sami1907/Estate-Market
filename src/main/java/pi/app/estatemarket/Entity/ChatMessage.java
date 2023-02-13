package pi.app.estatemarket.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ChatMessage implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int messageId;

    private String contenuMessage;
}
