package cinema.service;

<<<<<<< HEAD
import java.time.LocalDate;
import java.util.List;
import cinema.model.MovieSession;
=======
import cinema.model.MovieSession;
import java.time.LocalDate;
import java.util.List;
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568

public interface MovieSessionService {
    List<MovieSession> findAvailableSessions(Long movieId, LocalDate date);

<<<<<<< HEAD
    MovieSession add(MovieSession session);

    MovieSession get(Long id);

    MovieSession update(MovieSession movieSession);

    void delete(Long id);
=======
    MovieSession get(Long id);

    MovieSession add(MovieSession session);
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
}
