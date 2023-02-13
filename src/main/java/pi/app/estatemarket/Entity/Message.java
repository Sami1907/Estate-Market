package pi.app.estatemarket.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "chat_message")
public class Message implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int messageId;

    private String contenuMessage;
}
