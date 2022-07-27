package cinema.model;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD
=======
import javax.persistence.FetchType;
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    @JoinTable(name = "orders_tickets",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "ticket_id"))
    private List<Ticket> tickets;
<<<<<<< HEAD
    @Column(name = "order_time")
    private LocalDateTime orderTime;
    @ManyToOne
    @JoinColumn(name = "user_id")
=======
    @Column(name = "order_date")
    private LocalDateTime orderDate;
    @ManyToOne(fetch = FetchType.LAZY)
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

<<<<<<< HEAD
    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
=======
    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{"
                + "id=" + id
                + ", tickets=" + tickets
<<<<<<< HEAD
                + ", orderTime=" + orderTime
                + ", user=" + user + '}';
=======
                + ", orderDate=" + orderDate
                + ", user=" + user
                + '}';
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
    }
}
