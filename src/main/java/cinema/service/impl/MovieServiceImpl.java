package cinema.service.impl;

<<<<<<< HEAD
import java.util.List;
import cinema.dao.MovieDao;
import cinema.model.Movie;
import cinema.service.MovieService;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieDao movieDao;

    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }
=======
import cinema.dao.MovieDao;
import cinema.lib.Inject;
import cinema.lib.Service;
import cinema.model.Movie;
import cinema.service.MovieService;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
<<<<<<< HEAD
        return movieDao.get(id).orElseThrow(
                () -> new RuntimeException("Can't get movie by id " + id));
=======
        return movieDao.get(id).get();
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
    }

    @Override
    public List<Movie> getAll() {
        return movieDao.getAll();
    }
}
