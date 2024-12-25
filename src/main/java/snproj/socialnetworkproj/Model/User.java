package snproj.socialnetworkproj.Model;

import jakarta.persistence.*;
import org.hibernate.id.factory.internal.AutoGenerationTypeStrategy;

import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "role", nullable = false)
    private Enum role;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at")
    private Date createdAt;

    //many to many? subs / contacts / likes

    //gets-sets

}
