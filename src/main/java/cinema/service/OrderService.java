package cinema.service;

<<<<<<< HEAD
import java.util.List;
import cinema.model.Order;
import cinema.model.ShoppingCart;
import cinema.model.User;
=======
import cinema.model.Order;
import cinema.model.ShoppingCart;
import cinema.model.User;
import java.util.List;
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
