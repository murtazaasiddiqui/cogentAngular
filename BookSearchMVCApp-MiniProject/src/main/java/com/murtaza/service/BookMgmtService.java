package com.murtaza.service;

import java.util.List;

import com.murtaza.dto.BookDetailsDTO;

public interface BookMgmtService {
	
	public List<BookDetailsDTO> searchBooksByCategory(String category) throws Exception;

}
