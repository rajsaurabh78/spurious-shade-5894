package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.exception.AdministratorException;
import com.masai.exception.Product;
import com.masai.modal.Buyer;
import com.masai.modal.Seller;
import com.masai.utlity.DBUtil;

public class AdminDaoImpl implements AdminDao {

	@Override
	public List<Buyer> ViewBuyers() throws AdministratorException {
		List<Buyer> list=new ArrayList<>();

        try(Connection conn=DBUtil.provideConnection()) {
            PreparedStatement ps=conn.prepareStatement("select * from buyer");
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Buyer buyer=new Buyer();
                buyer.setBid(rs.getInt("bid"));
               buyer.setName(rs.getString("name"));
                buyer.setEmail(rs.getString("email"));
                buyer.setLocation(rs.getString("location"));
                list.add(buyer);
            }
            if(list.size()==0){
                throw new  AdministratorException("No data in Buyers List");
            }
        }catch (SQLException e){
            e.printStackTrace();
            throw new  AdministratorException(e.getMessage());
        }
        return list;
	}

	@Override
	public List<Seller> ViewSellers() throws AdministratorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Buyer> DailySellingReport(String date) throws AdministratorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> DailyDisputeReport(String date) throws AdministratorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String SolveDispute(int categoryId, int productId) throws AdministratorException {
		// TODO Auto-generated method stub
		return null;
	}

}
