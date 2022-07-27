package cinema.model;

import javax.persistence.Entity;
<<<<<<< HEAD
=======
import javax.persistence.FetchType;
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
<<<<<<< HEAD
    @ManyToOne
    @JoinColumn(name = "movie_session_id")
    private MovieSession movieSession;
    @ManyToOne
    @JoinColumn(name = "user_id")
=======
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_session_id")
    private MovieSession movieSession;
    @ManyToOne(fetch = FetchType.LAZY)
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

<<<<<<< HEAD
    public MovieSession getMovieSession() {
        return movieSession;
    }

    public void setMovieSession(MovieSession movieSession) {
        this.movieSession = movieSession;
    }

=======
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

<<<<<<< HEAD
    @Override
    public String toString() {
        return "Ticket{"
                + "id=" + id
                + ", movieSession=" + movieSession
                + ", user=" + user + '}';
    }
=======
    public MovieSession getMovieSession() {
        return movieSession;
    }

    public void setMovieSession(MovieSession movieSession) {
        this.movieSession = movieSession;
    }

    @Override
    public String toString() {
        return "Ticket{"
            + "id=" + id
            + ", movieSession=" + movieSession
            + ", user=" + user
            + '}';
    }

>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
}
