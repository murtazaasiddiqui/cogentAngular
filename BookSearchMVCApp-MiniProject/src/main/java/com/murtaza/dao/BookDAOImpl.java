package com.murtaza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.murtaza.bo.BookDetailsBO;

public class BookDAOImpl implements BookDAO{

	private static final String
	GET_BOOKS_BY_CATEGORY="SELECT BOOKID,BOOKNAME,CATEGORY,AUTHOR,PRICE,STATUS FROM BOOKS_INFO WHERE CATEGORY=?";
	
	@Override
	public List<BookDetailsBO> getBooksByCategory(String category) throws Exception {
		// TODO Auto-generated method stub
		List<BookDetailsBO> listBO=null;
		try(Connection con=getPooledConnection();
				PreparedStatement ps=con.prepareStatement(GET_BOOKS_BY_CATEGORY)){
			
			//SET VALUE TO QUERY PARAMS
			ps.setString(1, category);
			//execute the query
			try(ResultSet rs=ps.executeQuery()){
				//copy the records of rs to arraylist as BO class obj
				listBO=new ArrayList();
				while(rs.next()) {
					BookDetailsBO bo = new BookDetailsBO();
					bo.setBookId(rs.getInt(1));
					bo.setBookName(rs.getString(2));
					bo.setCategory(rs.getString(3));
					bo.setAuthor(rs.getString(4));
					bo.setPrice(rs.getFloat(5));
					bo.setStatus(rs.getString(6));
					listBO.add(bo);	
					
				}
				
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return listBO;
		
	}
	private Connection getPooledConnection() throws Exception{
		
		//create InitialContext obj
		InitialContext ic=new InitialContext();
		//get Datasource obj from jndiregistry
		DataSource ds=(DataSource)ic.lookup("java:/comp/env/DsJndi-mysql");
		//get pooled jdbc con obj
		Connection con=ds.getConnection();
		return con;
		
		
		
	}
	
	
	
	
	

}
