/**
 * This class is where you can create your objects you'll be using
 */

package com.example.ecr.config;

import com.example.ecr.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//This annotation is required if you want to explicitly create beans yourself
@Configuration
public class AppConfig {

    /**
     * @Bean
     * Product getProductObject() {
     *     return new Product();
     * }
     * No need for this because we used @Component in the Product class
     */

    /**
     * AnotherProduct getAnotherProductObject() {
     *     return new AnotherProduct();
     * }
     * I didn't want to create another class to clutter up my code
     * but if I had another class that served a purpose I could
     * use this method to create an object of that class
     * All my object creation would be centralized in this AppConfig class
     */
}
