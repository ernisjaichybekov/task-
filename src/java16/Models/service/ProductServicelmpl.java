package java16.Models.service;

import java16.Models.dao.ProductDao;

public class ProductServicelmpl implements ProductService {
       private final ProductDao productDao;

    public ProductServicelmpl(ProductDao productDao) {
        this.productDao = productDao;
    }


    @Override
    public String addProduct(Product product) {
        return "";
    }

    @Override
    public Product[] findAllP() {
        return new Product[0];
    }

    @Override
    public void delete(int index) {

    }

    @Override
    public void update(int index, Product product) {

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
