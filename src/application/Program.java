package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		/*
		System.out.println("\n=== Teste número 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println();
		*/
		
		/*
		System.out.println("\n=== Teste número 2: seller findByDepartment ===");
		Department department = new Department(1, null);
		List <Seller> list = sellerDao.findByIdDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		*/
		
		/*
		System.out.println();
		System.out.println("\n=== Teste 3: seller findAll===");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		*/
		
		/*
		System.out.println();
		System.out.println("\n=== Teste 4: seller insert ===");
		Seller newSeller = new Seller(null, "Janete", "janete@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserido! Novo id = " + newSeller.getId());
		*/
		
		/*
		System.out.println();
		System.out.println("\n=== Teste 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Gisele Lauriano");
		sellerDao.upDate(seller);
		System.out.println("Atualização completa");
		*/
		
		
		System.out.println();
		System.out.println("\n=== Teste 6: seller delete ===");
		System.out.print("Digite o id para deletar: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deletado com sucesso!!");
		
		sc.close();

	}

}
