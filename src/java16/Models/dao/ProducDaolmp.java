package java16.Models.dao;

import java16.Models.service.Product;
import java16.Models.service.User;

public class ProducDaolmp implements ProductDao{


    @Override
    public void addProduct(Product product) {

    }

    @Override
    public Product[] findallP() {
        return new Product[0];
    }

    @Override
    public void deleta(int index) {

    }

    @Override
    public void update(int index, Product product) {

    }

    @Override
    public void favoriteP(Product[] favorite, int index) {

    }

    @Override
    public Product[] allfavoride(User user) {
        return new Product[0];
    }

    @Override
    public void getFavoriteById(Product[] products, int ind) {

    }

    @Override
    public void categoryAndSize() {

    }
}
