package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import modelservices.ProductService;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		
		System.out.println("Soma dos produtos que come?am com a letra T = " + String.format("%.2f", sum));	
	}
}
