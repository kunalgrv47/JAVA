package exercise15;

public class Main {

	public static void main(String[] args) {
		
		//Creating Music Library
		MusicLibrary library = new MusicLibrary();
		
		//Creating songs
		Song song1 = new Song("Jhalak dikhlaja", "Himesh Reshamiya");
		Song song2 = new Song("Kesariya", "Arijit singh");
		Song song3 = new Song("Maan meri jaan", "King");
		Song song4 = new Song("Kal hona ho", "Sonu Nigam");
		
		//Adding songs into library
		library.addSong(song1);
		library.addSong(song2);
		library.addSong(song3);
		library.addSong(song4);
		
		//Printing all songs available in the Library
		System.out.println("======SHOWING ALL THE SONGS IN LIBRARY=======");
		library.showAllSongs();
		
		//PLAYING RANDOM SONGS
		System.out.println("======PLAYING RANDOM SONGS======");
		library.playRandomSong();
		library.playRandomSong();
		library.playRandomSong();
		library.playRandomSong();
		library.playRandomSong();
		library.playRandomSong();
		library.playRandomSong();
		library.playRandomSong();
		library.playRandomSong();
		
		

	}

}
