package day31_Tasks.movieTask;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Movie movie1 = new Movie("USA", "The Batman", "Action", "12.12.2021", "Nolan");
        movie1.addCast("Robert");
        String [] actors = {"Bale", "Joker"};
        movie1.addCasts(actors);

        System.out.println(movie1);

        System.out.println("--------------");
        String gene = "Adventure, Comedy, Thriller";
        String title = "Journey to SDET: Cydeo Batch 25";
        String[] casts = {"Asiya", "Adam", "Muhtar", "Akbar", "Gurhan", "Saim", "Murodil", "Nadir", "Guljannet"};

        Movie movie2 = new Movie("USA", title, gene,"10/25/2021", "Kuzzat Altay" );
        movie2.addCasts(casts);

        System.out.println(movie2);
    }
}
