package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	 void intert(Seller obj);
	 void update(Seller obj);
	 void deletById(Integer id);
	 Seller findById(Integer id);
	 List<Seller> findByDepartment(Department id);
	 List<Seller> findAll();
}
