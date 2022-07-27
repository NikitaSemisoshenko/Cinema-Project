package cinema.dao;

<<<<<<< HEAD
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import cinema.model.MovieSession;

public interface MovieSessionDao {
    MovieSession add(MovieSession movieSession);

    Optional<MovieSession> get(Long id);

    List<MovieSession> findAvailableSessions(Long movieId, LocalDate date);

    MovieSession update(MovieSession movieSession);

    void delete(Long id);
=======
import cinema.model.MovieSession;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface MovieSessionDao {
    List<MovieSession> findAvailableSessions(Long movieId, LocalDate date);

    Optional<MovieSession> get(Long id);

    MovieSession add(MovieSession session);
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
}
