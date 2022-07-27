package cinema.dao.impl;

<<<<<<< HEAD
import java.time.LocalDate;
import java.util.List;
import cinema.dao.AbstractDao;
import cinema.dao.MovieSessionDao;
import cinema.exception.DataProcessingException;
import cinema.model.MovieSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class MovieSessionDaoImpl extends AbstractDao<MovieSession> implements MovieSessionDao {
    public MovieSessionDaoImpl(SessionFactory factory) {
        super(factory, MovieSession.class);
=======
import cinema.dao.MovieSessionDao;
import cinema.exception.DataProcessingException;
import cinema.lib.Dao;
import cinema.model.MovieSession;
import cinema.util.HibernateUtil;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

@Dao
public class MovieSessionDaoImpl implements MovieSessionDao {
    private static final LocalTime END_OF_DAY = LocalTime.of(23, 59, 59);

    @Override
    public MovieSession add(MovieSession movieSession) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(movieSession);
            transaction.commit();
            return movieSession;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't insert a movie session: " + movieSession, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
    }

    @Override
    public List<MovieSession> findAvailableSessions(Long movieId, LocalDate date) {
<<<<<<< HEAD
        try (Session session = factory.openSession()) {
            Query<MovieSession> getAvailableSessions = session.createQuery(
                    "FROM MovieSession m WHERE m.movie.id = :id "
                            + "AND DATE_FORMAT(showTime, '%Y-%m-%d') = :date", MovieSession.class);
            getAvailableSessions.setParameter("id", movieId);
            getAvailableSessions.setParameter("date", date.toString());
            return getAvailableSessions.getResultList();
        } catch (Exception e) {
            throw new DataProcessingException("Session for movie with id "
                    + movieId + " and show date " + date + " not found", e);
=======
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<MovieSession> criteriaQuery =
                    criteriaBuilder.createQuery(MovieSession.class);
            Root<MovieSession> root = criteriaQuery.from(MovieSession.class);
            Predicate moviePredicate = criteriaBuilder.equal(root.get("movie"), movieId);
            Predicate datePredicate = criteriaBuilder.between(root.get("showTime"),
                    date.atStartOfDay(), date.atTime(END_OF_DAY));
            Predicate allConditions = criteriaBuilder.and(moviePredicate, datePredicate);
            criteriaQuery.select(root).where(allConditions);
            root.fetch("movie");
            root.fetch("cinemaHall");
            return session.createQuery(criteriaQuery).getResultList();
        } catch (Exception e) {
            throw new DataProcessingException("Can't get available sessions for movie with id: "
                    + movieId + " for date: " + date, e);
        }
    }

    @Override
    public Optional<MovieSession> get(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<MovieSession> query = session.createQuery("FROM MovieSession ms "
                    + "JOIN FETCH ms.movie m "
                    + "JOIN FETCH ms.cinemaHall ch "
                    + "WHERE ms.id = :id", MovieSession.class);
            query.setParameter("id", id);
            return query.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Can't get a movie session by id: " + id, e);
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
        }
    }
}
