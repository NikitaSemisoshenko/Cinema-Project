package cinema.service;

<<<<<<< HEAD
import java.util.List;
import cinema.model.Movie;
=======
import cinema.model.Movie;
import java.util.List;
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}
