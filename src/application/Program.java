package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1,"Books");
		DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Seller seller  = new Seller(21,"Bob","bob@gmail.com",LocalDate.parse("14/02/2005",form),3000.0,obj);
		System.out.println(seller);

	}

}
