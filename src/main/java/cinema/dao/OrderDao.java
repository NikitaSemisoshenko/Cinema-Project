package cinema.dao;

<<<<<<< HEAD
import java.util.List;
import cinema.model.Order;
import cinema.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
=======
import cinema.model.Order;
import cinema.model.User;
import java.util.List;

public interface OrderDao {
    Order save(Order order);

    List<Order> getByUser(User user);
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
}
