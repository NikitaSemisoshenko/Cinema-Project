package cinema.dao;

<<<<<<< HEAD
import java.util.List;
import java.util.Optional;
import cinema.model.CinemaHall;
=======
import cinema.model.CinemaHall;
import java.util.List;
import java.util.Optional;
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568

public interface CinemaHallDao {
    CinemaHall add(CinemaHall cinemaHall);

    Optional<CinemaHall> get(Long id);

    List<CinemaHall> getAll();
}
