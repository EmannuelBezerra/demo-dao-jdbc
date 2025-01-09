package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== TEST 1: Test findById: ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("\n=== TEST 2: Test findByDepartmentId: ====");
		Department dep = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for(Seller s : list) {
			System.out.println(s);
		}
		System.out.println("\n=== TEST 3: Test findALL: ====");
	    list = sellerDao.findAll();
		for(Seller s : list) {
			System.out.println(s);
		}
		System.out.println("\n=== TEST 4: Test SellerInsert: ====");
		Seller newSeller = new Seller(null,"Greg","Greg@gmail.com",new Date(), 4000.0,dep);
		sellerDao.intert(newSeller);
		System.out.println("Inserted! New seller id: "+newSeller.getId());
		System.out.println("\n=== TEST 5: Test SellerUpdate: ====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("UPDATE COMPLETED");

	}

}
