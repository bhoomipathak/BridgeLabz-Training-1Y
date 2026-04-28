package com.gla.jbbc;
import java.util.*;

class Movie {
    int id;
    String name;
    int seats;

    Movie(int id, String name, int seats) {
        this.id = id;
        this.name = name;
        this.seats = seats;
    }
}

public class MovieBookingSystem {

    static ArrayList<Movie> movies = new ArrayList<>();

    public static void main(String[] args) {

        // CREATE (Add movies)
        movies.add(new Movie(1, "Avengers", 5));
        movies.add(new Movie(2, "Batman", 0));
        movies.add(new Movie(3, "Inception", 10));

        // READ (movies with seats > 0)
        System.out.println("Available Movies:");
        for (Movie m : movies) {
            if (m.seats > 0) {
                System.out.println(m.id + " | " + m.name + " | Seats: " + m.seats);
            }
        }

        // UPDATE (Book ticket → reduce seats)
        int bookId = 1;
        int tickets = 2;

        for (Movie m : movies) {
            if (m.id == bookId) {
                if (m.seats >= tickets) {
                    m.seats -= tickets;
                    System.out.println("Booked " + tickets + " ticket(s) for " + m.name);
                    System.out.println("Remaining Seats: " + m.seats);
                } else {
                    System.out.println("Not enough seats available!");
                }
            }
        }

        // DELETE (Remove movie not running)
        int deleteId = 2;
        movies.removeIf(m -> m.id == deleteId);

        // Final List
        System.out.println("\nFinal Movie List:");
        for (Movie m : movies) {
            System.out.println(m.id + " | " + m.name + " | Seats: " + m.seats);
        }
    }
}

