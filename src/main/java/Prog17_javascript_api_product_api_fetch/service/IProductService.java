package Prog17_javascript_api_product_api_fetch.service;

import Prog17_javascript_api_product_api_fetch.entity.Product;

import java.util.List;

public interface IProductService {
    public List<Product> getProducts();
    public Product getProductById(Integer pId);
    public void addProduct(Product product);
    public void deleteProductById(Integer pId);
    public void updateProduct(Product product);
}
