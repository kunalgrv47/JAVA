package exercise15;

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
	
	private ArrayList<Song> songs;
	
	public MusicLibrary() {
		songs = new ArrayList<>();
	}
	
	public void addSong(Song song) {
		songs.add(song);
	}
	
	public void removeSong(Song song) {
		songs.remove(song);
	}
	
	public void playRandomSong() {
		if(songs.isEmpty()) {
			System.out.println("No songs in the Library to play");
			return;
		}
		Random randomSong = new Random();
		int index = randomSong.nextInt(songs.size());
		System.out.println("Now Playing: "+songs.get(index).getName()+" by "+ songs.get(index).getArtist());
	}
	
	public void showAllSongs() {
		System.out.println("Sl.No	TITLE			ARTIST");
		for(int i=0; i<songs.size(); i++) {
			System.out.println(i+1 +"	"+songs.get(i).getName()+"		"+songs.get(i).getArtist());
		}
		System.out.println();
	}

}
