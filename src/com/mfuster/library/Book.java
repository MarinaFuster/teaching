package com.mfuster.library;

public class Book implements Comparable <Book> {
	
	private String title;
	private String author;
	private int year;
	
	public Book(String title,String author,int year){
		this.title=title;
		this.author=author;
		this.year=year;
		
		}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getYear() {
		return year;
	}
	
	public int compareTo(Book book) {	
		//this.title.compareTo(book.title);	
		return this.title.compareTo(book.title);
	}

}
