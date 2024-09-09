package com.TMS;

import java.util.LinkedList;

public class MusicPlaylist {
	 private LinkedList<String> songs;

	    public MusicPlaylist() {
	        songs = new LinkedList<>();
	    }

	    public void addSong(String song) {
	        songs.add(song);
	    }

	    public void removeSong(String song) {
	        songs.remove(song);
	    }

	    public void moveSong(int currentIndex, int newIndex) {
	        if (currentIndex >= 0 && currentIndex < songs.size() && newIndex >= 0 && newIndex < songs.size()) {
	            String song = songs.remove(currentIndex);
	            songs.add(newIndex, song);
	        } else {
	            System.out.println("Invalid index.");
	        }
	    }

	    public void displayPlaylist() {
	        System.out.println("Playlist:");
	        for (String song : songs) {
	            System.out.println(song);
	        }
	    }

	    public static void main(String[] args) {
	        MusicPlaylist playlist = new MusicPlaylist();
	        playlist.addSong("Song 1");
	        playlist.addSong("Song 2");
	        playlist.displayPlaylist();
	        playlist.moveSong(0, 1);
	        playlist.displayPlaylist();
	        playlist.removeSong("Song 2");
	        playlist.displayPlaylist();
	    }
}
