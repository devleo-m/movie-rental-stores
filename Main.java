import classes.Movie;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Movie> movies = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Welcomido to Bora Bill movies! filmes");
            System.out.println("1. Movie Registration");
            System.out.println("0. Exit");
            System.out.println("Enter the desired option: ");
            int opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.print("Enter the title: ");
                    String title = scanner.next();
                    title += scanner.nextLine();
                    System.out.print("Enter the genre: ");
                    String genre = scanner.next();
                    genre += scanner.nextLine();
                    System.out.print("Enter the release year: ");
                    int releaseYear = scanner.nextInt();
                    Movie movie = Movie.make(title, genre, releaseYear);
                    movies.add(movie);
                    System.out.println("Movie successfully registered!");
                    movie.print();
                    break;
                case 0:
                    System.out.println("Good bye");
                    return;
                default:
                    System.out.println("Opcao invalid! Try again.");
                    break;
            }
        }while(true);

    }
}
