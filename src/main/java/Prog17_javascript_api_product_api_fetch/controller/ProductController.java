package Prog17_javascript_api_product_api_fetch.controller;

import Prog17_javascript_api_product_api_fetch.entity.Product;
import Prog17_javascript_api_product_api_fetch.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/product")
@CrossOrigin()
public class ProductController {

    @Autowired
    IProductService productService;

    @GetMapping("/list")
    public ResponseEntity<List<Product>> getProducts(){
        return ResponseEntity.ok(productService.getProducts());
    }

    @GetMapping("/getProduct")
    public ResponseEntity<Product> getProductById(Integer pId){
        return ResponseEntity.ok(productService.getProductById(pId));
    }

    @PostMapping("addProduct")
    public ResponseEntity<String> addProduct(@RequestBody Product product){
        System.out.println(product);
        productService.addProduct(product);
        return ResponseEntity.ok("Product Added Successfully");
    }

    @DeleteMapping("deleteProductById")
    public ResponseEntity<String> deleteProduct(Integer pId){
        productService.deleteProductById(pId);
        return ResponseEntity.ok("Product Deleted Successfully");

    }
}
