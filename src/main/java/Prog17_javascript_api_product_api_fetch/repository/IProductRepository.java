package Prog17_javascript_api_product_api_fetch.repository;

import Prog17_javascript_api_product_api_fetch.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product,Integer> {
}
