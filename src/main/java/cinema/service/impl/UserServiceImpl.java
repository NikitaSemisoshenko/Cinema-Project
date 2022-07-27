package cinema.service.impl;

<<<<<<< HEAD
import java.util.Optional;
import cinema.dao.UserDao;
import cinema.model.User;
import cinema.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final PasswordEncoder encoder;
    private final UserDao userDao;

    public UserServiceImpl(PasswordEncoder encoder, UserDao userDao) {
        this.encoder = encoder;
        this.userDao = userDao;
    }

    @Override
    public User add(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
=======
import cinema.dao.UserDao;
import cinema.lib.Inject;
import cinema.lib.Service;
import cinema.model.User;
import cinema.service.UserService;
import cinema.util.HashUtil;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Inject
    private UserDao userDao;

    @Override
    public User add(User user) {
        user.setSalt(HashUtil.getSalt());
        user.setPassword(HashUtil.hashPassword(user.getPassword(), user.getSalt()));
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
        return userDao.add(user);
    }

    @Override
<<<<<<< HEAD
    public User get(Long id) {
        return userDao.get(id).orElseThrow(
                () -> new RuntimeException("User with id " + id + " not found"));
    }

    @Override
=======
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
    public Optional<User> findByEmail(String email) {
        return userDao.findByEmail(email);
    }
}
