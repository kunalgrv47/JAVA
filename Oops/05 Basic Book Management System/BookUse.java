package exercise5;

public class BookUse {

	public static void main(String[] args) {
		
		//Creating books
		Book book1 = new Book("The Fundamental of C", "Dennis Ritchie and Brian Kernighan", "123450");
		Book book2 = new Book("Red Earth and Pouring Rain", "Vikram Chandra", "123451");
		Book book3 = new Book("Gitanjali", "Rabindranath Tagore", "123452");
		
		//Adding books to the collection
		Book.addBook(book1);
		Book.addBook(book2);
		Book.addBook(book3);
		
		
		//Check the available book in the collection
		System.out.println("BEFORE REMOVAL");
		Book.getBookCollection();
		
		//Removing books from the collection
		Book.removeBook(book1);
		Book.removeBook(book3);
		
		//Check the available book in the collection
		System.out.println("AFTER REMOVAL");
		Book.getBookCollection();
	}

}
