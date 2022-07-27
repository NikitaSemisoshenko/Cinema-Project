package cinema.service;

<<<<<<< HEAD
import java.util.Optional;
import cinema.model.User;
=======
import cinema.model.User;
import java.util.Optional;
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568

public interface UserService {
    User add(User user);

<<<<<<< HEAD
    User get(Long id);

=======
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
    Optional<User> findByEmail(String email);
}
