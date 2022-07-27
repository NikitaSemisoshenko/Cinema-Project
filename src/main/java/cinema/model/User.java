package cinema.model;

<<<<<<< HEAD
import java.util.Set;
=======
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
=======
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String email;
    private String password;
<<<<<<< HEAD

    @ManyToMany
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;
=======
    private byte[] salt;
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

<<<<<<< HEAD
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
=======
    public byte[] getSalt() {
        return salt;
    }

    public void setSalt(byte[] salt) {
        this.salt = salt;
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
    }

    @Override
    public String toString() {
        return "User{"
<<<<<<< HEAD
                + "id=" + id
                + ", email='" + email + '\'' + '}';
=======
            + "id=" + id
            + ", email='" + email + '\''
            + '}';
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
    }
}
