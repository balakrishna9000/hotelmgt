package com.dxctraining.dao;

import java.util.List;

import org.dxctraining.entites.Book;

import com.dxctraining.entities.BookItem;

public interface Dao {

	BookItem findById(String id);
	 public void add(BookItem book);
	BookItem displaybook(String id );
	List<BookItem> displayallbooks();
	public BookItem updateCost(String id,double newCost);
	void removebook(String id); 
}