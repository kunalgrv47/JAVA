package exercise11;

import java.util.ArrayList;

public class Library {
	
	private ArrayList<Book> books;
	
	public Library() {
		books = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void removeBook(Book book) {
		books.remove(book);
		System.out.println("Successfully removed the book '"+book.getTitle()+"'");
		System.out.println();
	}
	
	public void showAvailableBooks(){
		System.out.println("========AVAILABLE BOOKS IN LIBRARY=========");
		System.out.println("SL.No.	TITLE & AUTHOR");
		for(int i=0; i<books.size(); i++) {
			System.out.println(i+".  	"+books.get(i).getTitle()+" by "+books.get(i).getAuthor());
		}
		System.out.println();
	}
	
	
}
