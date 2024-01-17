package com.library;

public class Books {
	
	
	private int book_Id;
	private String book_Name;
	private String book_Author;
	private Library Lib;
	
	
	

	public Library getLib() {
		return Lib;
	}
	public Books() {
		super();
	}
	public void setLib(Library lib) {
		Lib = lib;
	}
	public int getBook_Id() {
		return book_Id;
	}
	public void setBook_Id(int book_Id) {
		this.book_Id = book_Id;
	}
	public String getBook_Name() {
		return book_Name;
	}
	public void setBook_Name(String book_Name) {
		this.book_Name = book_Name;
	}
	public String getBook_Author() {
		return book_Author;
	}
	public void setBook_Author(String book_Author) {
		this.book_Author = book_Author;
	}
	
	

	

	
}
