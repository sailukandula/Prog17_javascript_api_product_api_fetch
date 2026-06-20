package Prog17_javascript_api_product_api_fetch.controller;

import Prog17_javascript_api_product_api_fetch.entity.Product;
import Prog17_javascript_api_product_api_fetch.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/product")
@CrossOrigin
public class ProductController {

    @Autowired
    IProductService productService;

    @GetMapping("/list")
    public ResponseEntity<List<Product>> getProducts(){
        return ResponseEntity.ok(productService.getProducts());
    }

    @GetMapping("/getProductById/{pId}")
    public ResponseEntity<Product> getProductById(@PathVariable Integer pId){
        return ResponseEntity.ok(productService.getProductById(pId));
    }

    @PostMapping("/addProduct")
    public ResponseEntity<String> addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return ResponseEntity.ok("Product Added Successfully");
    }

    @PostMapping("/productAdd")
    public ResponseEntity<Product> productAdd(@RequestBody Product product){
        Product productSaved =productService.productAdd(product);
        return ResponseEntity.ok(productSaved);
    }

    @DeleteMapping("/deleteProductById/{pId}")
    public ResponseEntity<String> deleteProduct(@PathVariable Integer pId){
        productService.deleteProductById(pId);
        return ResponseEntity.ok("Product Deleted Successfully");
    }

    @PostMapping("/updateProduct")
    public ResponseEntity<String> updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
        return ResponseEntity.ok("Product updated Successfully");
    }
}
