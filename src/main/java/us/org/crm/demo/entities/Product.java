package us.org.crm.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Product {
    @Id @GeneratedValue
    private  Long id;
    private  String name;
    private  String module;
    private  String description;
    private  String designation;
    private  String type;
    private  double price;

    public Long getIdProduct() {
        return id;
    }
}
