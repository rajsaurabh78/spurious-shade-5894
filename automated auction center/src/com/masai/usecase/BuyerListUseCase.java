 package com.masai.usecase;

import java.util.List;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exception.AdministratorException;
import com.masai.modal.Buyer;

public class BuyerListUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDao dao=new AdminDaoImpl();
		
		try {
			List<Buyer> buyer=dao.ViewBuyers();
			buyer.forEach(buy->{
				System.out.println("buyer id is: "+buy.getBid());
				System.out.println("buyer name is: "+buy.getName());
				System.out.println("buyer email is: "+buy.getEmail());
				System.out.println("buyer location is: "+buy.getLocation());
				System.out.println("===========================================================");
			});
		} catch (AdministratorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
