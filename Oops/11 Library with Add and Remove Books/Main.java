package exercise11;

public class Main {

	public static void main(String[] args) {
		
		//CREATING LIBRARY
		Library library = new Library();
		
		//CREATING BOOKS
		Book book1 = new Book("The Guide", "R.K. Narayan");
		Book book2 = new Book("A Suitable Boy", "Vikram Seth");
		Book book3 = new Book("God of Small Things","Arundhati Roy");
		Book book4 = new Book("Red Earth and Pouring Rain","Vikram Chandra");
		
		//ADDING BOOKS TO THE LIBRARY
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);
		
		//PRINTING THE AVAILABLE BOOKS IN THE LIBRARY
		library.showAvailableBooks();
		
		//REMOVING BOOKS FROM LIBRARY
		library.removeBook(book3);  //removed book3
		
		//PRINTING THE AVAILABLE BOOKS AFTER REMOVING BOOKS
		library.showAvailableBooks();
		
	}

}
