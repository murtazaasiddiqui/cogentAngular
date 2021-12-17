package com.murtaza.service;

import java.util.ArrayList;
import java.util.List;

import com.murtaza.bo.BookDetailsBO;
import com.murtaza.dao.BookDAO;
import com.murtaza.dao.BookDAOImpl;
import com.murtaza.dto.BookDetailsDTO;

public class BookMgmtServiceImpl implements BookMgmtService {

	private BookDAO dao;
	
	public BookMgmtServiceImpl() {
		dao=new BookDAOImpl();
	}

	@Override
	public List<BookDetailsDTO> searchBooksByCategory(String category) throws Exception {
		// TODO Auto-generated method stub
		//use dao
		List<BookDetailsBO> listBO=dao.getBooksByCategory(category);
		//convert listBO to listDTO
		List<BookDetailsDTO>listDTO=new ArrayList();
		listBO.forEach(bo->{
			BookDetailsDTO dto=new BookDetailsDTO();
			dto.setBookId(bo.getBookId());
			dto.setBookName(bo.getBookName());
			dto.setCategory(bo.getCategory());
			dto.setAuthor(bo.getAuthor());
			dto.setPrice(bo.getPrice());
			dto.setStatus(bo.getStatus());
			dto.setSerialNo(listDTO.size()+1);
			listDTO.add(dto);
		});
		return listDTO;
	}
	
}
