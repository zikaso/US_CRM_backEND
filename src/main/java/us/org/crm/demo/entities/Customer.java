package us.org.crm.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Customer implements Serializable {
  @Id  @GeneratedValue
 private  Long id;
 private  String name;
 private  boolean dealer;
 private  String email;
 private  String phone;
 private  String fax;
 private  String address;
 private  String city;
 private  String logo;


 public Long getIdCustomer() {
        return id;
    }
}
