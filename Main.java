import classes.Movie;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Movie> movies = new ArrayList<>();

    public static void main(String[] args) {

        movies.add(  Movie.make("joaozin da quebrada", "Drama", 1999));
        movies.add(  Movie.make("Mamonnas Assassinas", "Documentario", 2019));
        movies.add(  Movie.make("Fulano na europa", "Drama", 2021));
        movies.add(  Movie.make("A casa de lama", "Terror", 1891));
        movies.add(  Movie.make("Leandro com Kid", "Romance", 2024));
        movies.add(  Movie.make("O bestalhado", "Comedia", 2022));
        movies.add(  Movie.make("O carinha ali", "Drama", 1999));
        movies.add(  Movie.make("A cabana da praia", "Terror", 2023));
        movies.add(  Movie.make("O carinha doido", "Comedia", 2024));

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Welcome to Bora Bill movies! filmes");
            System.out.println("1. Movie Registration");
            System.out.println("2. Movie Query");
            System.out.println("0. Exit");
            System.out.println("Enter the desired option: ");
            int opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    movieRegistration();
                    break;
                case 2:
                    movieQuery();
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

    //METOD MOVIE REGISTRATION!
    public static void movieRegistration(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Movie Registration");
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
    }

    //METOD MOVIE QUERY
    public static void movieQuery(){

        System.out.println("Movie Query!");
        for (int i = 0; i < movies.size(); i++) {
            movies.get(i).print();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("To continue click enter");
        String click = scanner.nextLine();
    }
}
