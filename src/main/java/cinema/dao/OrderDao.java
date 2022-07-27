package cinema.dao;

import cinema.model.Order;
import cinema.model.User;
import java.util.List;

public interface OrderDao {
    Order save(Order order);

    List<Order> getByUser(User user);
}
