package exercise5;

import java.util.ArrayList;

public class Book {
	
	private String title;
    private String author;
    private String ISBN;
    private static ArrayList<Book> bookCollection = new ArrayList<>();

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    
    public static void addBook(Book book) {
    	bookCollection.add(book);
    }
    
    public static void getBookCollection(){
    	if(bookCollection.isEmpty()) {
    		System.out.println("There is no books in the collection, Please add some");
    		System.out.println();
    	}else {
    		System.out.println("The available books are: ");
    		for(int i=0; i<bookCollection.size(); i++) {
    			Book book = bookCollection.get(i);
    			System.out.println(i+1+" : " + book.title + " by " + book.author + " and the ISBN No. is " + book.ISBN);
    		}
    		System.out.println();
    	}
    }
  
    public static void removeBook(Book book) {
    	bookCollection.remove(book);
    }

}
