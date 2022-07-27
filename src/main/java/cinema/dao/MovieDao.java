package cinema.dao;

<<<<<<< HEAD
import java.util.List;
import java.util.Optional;
import cinema.model.Movie;
=======
import cinema.model.Movie;
import java.util.List;
import java.util.Optional;
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);

    List<Movie> getAll();
}
