package Prog17_javascript_api_product_api_fetch.controller;

import Prog17_javascript_api_product_api_fetch.entity.Product;
import Prog17_javascript_api_product_api_fetch.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    IProductService productService;

    @GetMapping("/lists")
    public ResponseEntity<List<Product>> getProducts(){
        return ResponseEntity.ok(productService.getProducts());
    }
}
