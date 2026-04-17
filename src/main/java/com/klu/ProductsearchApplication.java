package com.klu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsearchApplication.class, args);
	}

}

/*
{
    "name": "Smartphone",
    "category": "Electronics",
    "price": 699.99
}
http://localhost:9090/products/add
http://localhost:9090/products/all
http://localhost:9090/products/category/Electronics
*/

