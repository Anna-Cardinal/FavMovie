public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String moviename = "Secondhand Lions";
        int releaseyear = 2003;
        String genre = "Slice of Life";
        double rating = 6.7;
        boolean series = false;
        char directorsfirstinitial = 'M';
        System.out.println("My favorite movie is " + moviename + ".");
        System.out.println("Movie Name: " + moviename);
        System.out.println("Year Released: " + releaseyear);
        System.out.println("Genre: " + genre);
        System.out.println("IMDd Rating: " + rating);
        System.out.println("Part of a Series: " + series);
        System.out.println("Director's Last Name Initial: " + directorsfirstinitial);
// an array is a list to store multiple values
        //same data so only strings no numbers
        String[] movieNames = {"Seven Pounds", "Interstellar", "Inception"};
        String[] moviegenre = {"True Crime", "Supernatrul", "Anime"};
        System.out.println("First Genre: " + moviegenre[0]);
        System.out.println("Second Genre: " + moviegenre[1]);
        System.out.println("Theird Genre: " + moviegenre[2]);

       // int: The year the movie was released.
//        String: The genre of the movie (e.g., Action, Drama, Comedy).
//        double: The IMDb rating (out of 10).
//        boolean: Whether the movie is part of a series or not.
//        char: The first letter of the movie’s director's last name.
    }
}