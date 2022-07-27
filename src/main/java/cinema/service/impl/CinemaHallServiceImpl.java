package cinema.service.impl;

<<<<<<< HEAD
import java.util.List;
import cinema.dao.CinemaHallDao;
import cinema.model.CinemaHall;
import cinema.service.CinemaHallService;
import org.springframework.stereotype.Service;

@Service
public class CinemaHallServiceImpl implements CinemaHallService {
    private final CinemaHallDao cinemaHallDao;

    public CinemaHallServiceImpl(CinemaHallDao cinemaHallDao) {
        this.cinemaHallDao = cinemaHallDao;
    }
=======
import cinema.dao.CinemaHallDao;
import cinema.lib.Inject;
import cinema.lib.Service;
import cinema.model.CinemaHall;
import cinema.service.CinemaHallService;
import java.util.List;

@Service
public class CinemaHallServiceImpl implements CinemaHallService {
    @Inject
    private CinemaHallDao cinemaHallDao;
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568

    @Override
    public CinemaHall add(CinemaHall cinemaHall) {
        return cinemaHallDao.add(cinemaHall);
    }

    @Override
    public CinemaHall get(Long id) {
<<<<<<< HEAD
        return cinemaHallDao.get(id).orElseThrow(
                () -> new RuntimeException("Can't get cinema hall by id " + id));
=======
        return cinemaHallDao.get(id).get();
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
    }

    @Override
    public List<CinemaHall> getAll() {
        return cinemaHallDao.getAll();
    }
}
