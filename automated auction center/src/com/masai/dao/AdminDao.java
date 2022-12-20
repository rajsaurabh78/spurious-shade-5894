package com.masai.dao;

import java.util.List;

import com.masai.exception.AdministratorException;
import com.masai.exception.Product;
import com.masai.modal.Buyer;
import com.masai.modal.Seller;

public interface AdminDao {
	
	 public List<Buyer> ViewBuyers() throws AdministratorException;

	  public List<Seller> ViewSellers() throws AdministratorException;

	 public List<Buyer>DailySellingReport(String date) throws AdministratorException;

	 public List<Product> DailyDisputeReport(String date) throws AdministratorException;

	  public String SolveDispute(int categoryId,int productId) throws AdministratorException;
	
	
	
	
	
	
	
	
	

}
