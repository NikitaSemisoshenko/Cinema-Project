package cinema.dao;

<<<<<<< HEAD
import java.util.Optional;
import cinema.model.User;
=======
import cinema.model.User;
import java.util.Optional;
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568

public interface UserDao {
    User add(User user);

<<<<<<< HEAD
    Optional<User> get(Long id);

=======
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
    Optional<User> findByEmail(String email);
}
