package cinema.service;

import cinema.model.MovieSession;
import cinema.model.ShoppingCart;
import cinema.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

<<<<<<< HEAD
    void clear(ShoppingCart shoppingCart);
=======
    void clearShoppingCart(ShoppingCart cart);
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
}
