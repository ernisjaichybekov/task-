package java16.Models.dao;

import java16.Models.service.Product;
import java16.Models.service.User;

public interface ProductDao {

    void addProduct(Product product);

    Product [] findallP ();

    void deleta(int index);

    void update(int index,Product product);

    void favoriteP(Product[] favorite,int index);

    Product [] allfavoride (User user);

    void getFavoriteById(Product[] products,int ind);

    void categoryAndSize();
}
