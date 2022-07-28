/**
 * Model package stores your POJO's
 */

package com.example.ecr.model;

import lombok.*;
import org.springframework.stereotype.Component;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Comes from lombok, a 3rd party library, which is used to reduce boiler plate codes
//Generates @Getter, @Setter, @ToString(), and @EqualsAndHashCode()
@Data
//Generate constructor with all parameters
@AllArgsConstructor
//Generate constructor with no parameters(default constructor)
@NoArgsConstructor
@Component
//You want this data to persist, so you must mark it as such
@Entity
@Table(name ="pms")
public class Product {

    //Instance Variables
    //This specifies productId as the primary key, you must have a primary key
    @Id
    private int productId;
    //If you want to give a specific name for the column, the deault(product_name) is fine so I'll comment this out
    //@Column(name ="pname)
    private String productName;
    private int qoh;
    private int price;

    public String displayMessage() {
        return "This is a message from the Product class";
    }
}
