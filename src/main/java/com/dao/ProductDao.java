package com.dao;
import com.model.Product;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	
	public List<Product>addProduct()
	{
		
		ArrayList<Product> obj= new ArrayList();
Product p= new Product("Baby", 101, "Hello !Um Beautiful Baby toyProduct description Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.</p> ",1, 500.00,"baby");
		Product p1= new Product("PokMon", 102, "Hello !Um  PokMon here.....You Wana Take Me ?????  ",1, 500.00,"pkman");
		Product p2= new Product("CarWithBaby", 103, "Hello !Um Beautiful CarWithBabyToy ", 1,500.00,"gl2");
		Product p3= new Product("Teddy", 103, "Hello !Um Beautiful Teddy ", 1,500.00,"gl8");
		obj.add(p);
		obj.add(p1);
		obj.add(p2);
		obj.add(p3);
		return obj;
		
	}
	

}
