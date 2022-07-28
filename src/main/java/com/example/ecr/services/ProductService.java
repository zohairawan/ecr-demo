package com.example.ecr.services;

import com.example.ecr.model.Product;

import java.util.List;

public interface ProductService {

    //Does product exist
    public boolean isProductExist(int productId);
    //Does product exist
    public boolean isProductExist(String productName);
    //1.Add Product
    public boolean addProduct(Product product);
    //2.Delete Product
    public boolean deleteProduct(int productId);
    //3.Find Product by Id
    public Product getProduct(int productId);
    //4.Find product by Name
    public List<Product> getProduct(String productName);
    //5.Find all Products
    public List<Product> getProducts();
    //6.Update Stock
    public boolean updateStock(int productId, int addQoh);
    //7.Update Price
    public int updatePrice(int productId, int discountPercent);
    //8.Update Product
    public boolean updateProduct(Product product);

    public List<Product> filterProductByPrice(int minPrice, int maxPrice);
    public List<Product> getProductByPrice(int price);
    public List<Product> getProductByQoh(int qoh);
    public List<Product> getProductByGreaterQoh(int greaterQoh);
}
