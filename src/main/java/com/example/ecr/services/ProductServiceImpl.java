/**
 * Request ---> Controller ---> Service ---> DAO
 */

package com.example.ecr.services;

import com.example.ecr.dao.ProductDAO;
import com.example.ecr.model.Product;
import com.example.ecr.util.CheckVal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//This is just like @Component but since its a service class it's better to write like this
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductDAO productDAO;

    @Autowired
    CheckVal checkVal;

    @Override
    public boolean isProductExist(int productId) {
        return productDAO.existsById(productId);
    }

    @Override
    public boolean isProductExist(String productName) {
        return false;
    }

    @Override
    public boolean addProduct(Product product) {
        if(checkVal.isValuePositive(product.getQoh(),product.getPrice())) {
            productDAO.save(product);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean deleteProduct(int productId) {
        productDAO.deleteById(productId);
        return false;
    }

    @Override
    public Product getProduct(int productId) {
        Product pr = productDAO.getById(productId);
        return pr;
    }

    @Override
    public List<Product> getProduct(String productName) {

        return null;
    }

    @Override
    public List<Product> getProducts() {
        return productDAO.findAll();
    }

    @Override
    public boolean updateStock(int productId, int addQoh) {
        return false;
    }

    @Override
    public int updatePrice(int productId, int discountPercent) {
        return 0;
    }

    @Override
    public boolean updateProduct(Product product) {
        productDAO.save(product);
        return false;
    }

    @Override
    public List<Product> getProductByPrice(int price) {
        return null;
    }

    @Override
    public List<Product> getProductByQoh(int qoh) {
        return null;
    }

    @Override
    public List<Product> getProductByGreaterQoh(int greaterQoh) {
        return null;
    }

    @Override
    public List<Product> filterProductByPrice(int minPrice, int maxPrice) {
        return null;
    }
}
