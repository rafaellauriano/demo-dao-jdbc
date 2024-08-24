package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		//para mostrar o departamento
		/*
		System.out.println("\n=== Teste 1: findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		*/
		
		/*
		System.out.println();
		System.out.println("\n=== Teste 2: findAll ===");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		*/
		
		/*
		System.out.println("\n=== Teste 3: department insert ===");
		Department newDepartment = new Department(null, "Musica");
		departmentDao.insert(newDepartment);
		System.out.println("Inserido!! Novo departamento "+ newDepartment.getId());
		*/
		
		System.out.println();
		System.out.println("\n=== Teste 4: update ===");
		Department dep2 = departmentDao.findById(1);
		dep2.setName("Bateria");
		departmentDao.upDate(dep2);
		System.out.println("Atualizado");
		
		System.out.println("\n=== Teste 5: delete ===");
		System.out.print("Digite o id para deletar ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deletado com suceso!!");
		
		sc.close();
	}

}
