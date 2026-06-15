package Prog17_javascript_api_product_api_fetch.service;

import Prog17_javascript_api_product_api_fetch.entity.Product;
import Prog17_javascript_api_product_api_fetch.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService{
    @Autowired
    IProductRepository productRepository;
    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer pId) {
        return productRepository.findById(pId).orElse(null);
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProductById(Integer pId) {
        productRepository.deleteById(pId);
    }

    @Override
    public void updateProduct(Product product) {
        if (productRepository.existsById(product.getId())) {
            productRepository.save(product);
        }
    }
}
