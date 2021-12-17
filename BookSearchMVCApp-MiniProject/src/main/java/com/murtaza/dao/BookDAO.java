package com.murtaza.dao;

import java.util.List;

import com.murtaza.bo.BookDetailsBO;

public interface BookDAO {

	public List<BookDetailsBO> getBooksByCategory(String category)throws Exception;
}
