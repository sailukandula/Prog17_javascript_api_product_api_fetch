package Prog17_javascript_api_product_api_fetch.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tblproduct")
public class Product {
    @Id
    @Column(name = "id")
    private int id;
    private String name;
    private Double price;
    private String type;
}
