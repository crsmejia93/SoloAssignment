package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String artist, title;
        ArrayList<Song> songs = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i< 10;i++){
            System.out.println("Please enter the name of an artist and the song of that artist.");
            System.out.print("Artist name: ");
            artist = input.nextLine();
            System.out.print("Song Title: ");
            title = input.nextLine();
            songs.add(new Song(artist, title));
        }

        //print all the songs in the array list
        for(Song song: songs){
            System.out.println(song.display());
        }

        //look for blue and print if found
        String titleToFind = "Purple Rain";
        for (Song song: songs){
            if (song.getTitle().equalsIgnoreCase(titleToFind)){
                System.out.printf("I found %s \r\n",song.display());
            }
        }
    }
}
