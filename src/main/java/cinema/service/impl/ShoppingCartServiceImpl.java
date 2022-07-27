package cinema.service.impl;

import cinema.dao.ShoppingCartDao;
import cinema.dao.TicketDao;
<<<<<<< HEAD
=======
import cinema.lib.Inject;
import cinema.lib.Service;
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
import cinema.model.MovieSession;
import cinema.model.ShoppingCart;
import cinema.model.Ticket;
import cinema.model.User;
import cinema.service.ShoppingCartService;
<<<<<<< HEAD
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    private final ShoppingCartDao shoppingCartDao;
    private final TicketDao ticketDao;

    public ShoppingCartServiceImpl(ShoppingCartDao shoppingCartDao, TicketDao ticketDao) {
        this.shoppingCartDao = shoppingCartDao;
        this.ticketDao = ticketDao;
    }

    @Override
    public void addSession(MovieSession movieSession, User user) {
        Ticket ticket = new Ticket();
        ticket.setMovieSession(movieSession);
        ticket.setUser(user);
        ShoppingCart shoppingCart = shoppingCartDao.getByUser(user);
        ticketDao.add(ticket);
        shoppingCart.getTickets().add(ticket);
=======
import java.util.ArrayList;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Inject
    private ShoppingCartDao shoppingCartDao;
    @Inject
    private TicketDao ticketDao;

    @Override
    public void addSession(MovieSession movieSession, User user) {
        Ticket newTicket = new Ticket();
        newTicket.setUser(user);
        newTicket.setMovieSession(movieSession);

        ShoppingCart shoppingCart = shoppingCartDao.getByUser(user);
        shoppingCart.getTickets().add(ticketDao.add(newTicket));
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
        shoppingCartDao.update(shoppingCart);
    }

    @Override
    public ShoppingCart getByUser(User user) {
        return shoppingCartDao.getByUser(user);
    }

    @Override
    public void registerNewShoppingCart(User user) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setUser(user);
        shoppingCartDao.add(shoppingCart);
    }

    @Override
<<<<<<< HEAD
    public void clear(ShoppingCart shoppingCart) {
        shoppingCart.setTickets(null);
        shoppingCartDao.update(shoppingCart);
=======
    public void clearShoppingCart(ShoppingCart cart) {
        cart.setTickets(new ArrayList<>());
        shoppingCartDao.update(cart);
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
    }
}
