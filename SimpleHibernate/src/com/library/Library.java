package com.library;

import java.util.List;
import java.util.Set;

public class Library {
	
	private int LibId;
	private String LibName;
	private Set<Books> Books;
	
	
	public int getLibId() {
		return LibId;
	}
	public void setLibId(int libId) {
		LibId = libId;
	}

	public Library() {
		super();
	}
	public String getLibName() {
		return LibName;
	}
	public void setLibName(String libName) {
		LibName = libName;
	}
	public Set<Books> getBooks() {
		return Books;
	}
	public void setBooks(Set<Books> books) {
		Books = books;
	}
	
	



}
