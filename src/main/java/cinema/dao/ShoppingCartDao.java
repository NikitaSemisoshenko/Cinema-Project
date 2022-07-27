package cinema.dao;

import cinema.model.ShoppingCart;
import cinema.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    ShoppingCart getByUser(User user);

<<<<<<< HEAD
    ShoppingCart update(ShoppingCart shoppingCart);
=======
    void update(ShoppingCart shoppingCart);
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
}
