package Prog17_javascript_api_product_api_fetch.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="tblproduct")
public class Product {
    @Id
    @Column(name = "product_id")
    private int productid;
    private String name;
    private Double price;
    private String type;
}
