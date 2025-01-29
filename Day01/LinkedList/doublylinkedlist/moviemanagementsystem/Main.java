package doublylinkedlist.moviemanagementsystem;

public class Main {
    public static void main(String[] args) {
        MovieList movies = new MovieList();
        movies.addAtStart("Interstellar", "Nolan",2011,9.8);
        movies.addAtEnd("Fast and Furious","Chris",2025,8.65);
        movies.addAtIndex("chat-ing","Subodh",2018,7.54,1);
        movies.displayBackward();
        movies.displayForward();
        movies.deleteMovie("Interstellar");
        movies.search("Subodh",10.0);
    }
}
