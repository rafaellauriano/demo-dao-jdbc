package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Livros");
		
		Seller seller = new Seller(2, "Rafael", "rafa@gmail", new Date(), 4000.0, obj);
		
		System.out.println(seller);

	}

}