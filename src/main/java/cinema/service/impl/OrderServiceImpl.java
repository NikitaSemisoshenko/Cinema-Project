package cinema.service.impl;

<<<<<<< HEAD
import java.time.LocalDateTime;
import java.util.List;
import cinema.dao.OrderDao;
import cinema.model.Order;
import cinema.model.ShoppingCart;
import cinema.model.User;
import cinema.service.OrderService;
import cinema.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderDao orderDao;
    private final ShoppingCartService shoppingCartService;

    public OrderServiceImpl(OrderDao orderDao, ShoppingCartService shoppingCartService) {
        this.orderDao = orderDao;
        this.shoppingCartService = shoppingCartService;
    }
=======
import cinema.dao.OrderDao;
import cinema.lib.Inject;
import cinema.lib.Service;
import cinema.model.Order;
import cinema.model.ShoppingCart;
import cinema.model.Ticket;
import cinema.model.User;
import cinema.service.OrderService;
import cinema.service.ShoppingCartService;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Inject
    private OrderDao orderDao;
    @Inject
    private ShoppingCartService shoppingCartService;
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568

    @Override
    public Order completeOrder(ShoppingCart shoppingCart) {
        Order order = new Order();
<<<<<<< HEAD
        order.setOrderTime(LocalDateTime.now());
        order.setTickets(shoppingCart.getTickets());
        order.setUser(shoppingCart.getUser());
        orderDao.add(order);
        shoppingCartService.clear(shoppingCart);
        return order;
=======
        order.setOrderDate(LocalDateTime.now());
        order.setUser(shoppingCart.getUser());
        List<Ticket> tickets = new ArrayList<>(shoppingCart.getTickets());
        order.setTickets(tickets);
        shoppingCartService.clearShoppingCart(shoppingCart);
        return orderDao.save(order);
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
    }

    @Override
    public List<Order> getOrdersHistory(User user) {
<<<<<<< HEAD
        return orderDao.getOrdersHistory(user);
=======
        return orderDao.getByUser(user);
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
    }
}
