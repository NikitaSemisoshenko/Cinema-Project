package cinema.service.impl;

<<<<<<< HEAD
import java.time.LocalDate;
import java.util.List;
import cinema.dao.MovieSessionDao;
import cinema.model.MovieSession;
import cinema.service.MovieSessionService;
import org.springframework.stereotype.Service;

@Service
public class MovieSessionServiceImpl implements MovieSessionService {
    private final MovieSessionDao movieSessionDao;

    public MovieSessionServiceImpl(MovieSessionDao movieSessionDao) {
        this.movieSessionDao = movieSessionDao;
    }

    @Override
    public List<MovieSession> findAvailableSessions(Long movieId, LocalDate date) {
        return movieSessionDao.findAvailableSessions(movieId, date);
    }

    @Override
    public MovieSession add(MovieSession session) {
        return movieSessionDao.add(session);
=======
import cinema.dao.MovieSessionDao;
import cinema.lib.Inject;
import cinema.lib.Service;
import cinema.model.MovieSession;
import cinema.service.MovieSessionService;
import java.time.LocalDate;
import java.util.List;

@Service
public class MovieSessionServiceImpl implements MovieSessionService {
    @Inject
    private MovieSessionDao sessionDao;

    @Override
    public List<MovieSession> findAvailableSessions(Long movieId, LocalDate date) {
        return sessionDao.findAvailableSessions(movieId, date);
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
    }

    @Override
    public MovieSession get(Long id) {
<<<<<<< HEAD
        return movieSessionDao.get(id).orElseThrow(
                () -> new RuntimeException("Session with id " + id + " not found"));
    }

    @Override
    public MovieSession update(MovieSession movieSession) {
        return movieSessionDao.update(movieSession);
    }

    @Override
    public void delete(Long id) {
        movieSessionDao.delete(id);
=======
        return sessionDao.get(id).get();
    }

    @Override
    public MovieSession add(MovieSession session) {
        return sessionDao.add(session);
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
    }
}
