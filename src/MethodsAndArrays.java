import java.util.Arrays;

public class MethodsAndArrays {
    public static void main(String[] args) {

    /*
     Part 1: Halo Character Methods

    Note: This part is only required if you did not complete the bonus from the last assignment.

    Implement a user playing Halo and visiting their character history page.
    When the user goes to the page, a menu opens, their character is displayed, and multiple scores are displayed.

    Create a method called displayCharacter that takes a username and returns the username along with the text
    " is being displayed."

    Create another method called getCharacterHighScores that returns the string "Highest kills: 10000"

    Create another method called openCharacterHistory that invokes the other two methods and prints their values.

    Invoke openCharacterHistory.



    Part 2: Arrays

    Create a method that takes an array of your favorite movies as an argument and then prints each value of the array.
    Invoke the method.
     */

        System.out.println(displayCharacter("Bereket Bekele"));
        System.out.println(getCharacterHighScores("Highest kills: 10000"));
        openCharacterHistory();
        //String [] movies = {"Real Steel", "The Take"};
        myFavouriteMovies();


    }

    public static String displayCharacter(String username){

        return username + " " + "is being displayed.";
    }

    public static String getCharacterHighScores(String score) {

        return "Highest kills: 10000";
    }

    public static void openCharacterHistory(){
        
        System.out.println(displayCharacter("Bereket"));
        System.out.println(getCharacterHighScores("Highest kills: 10000"));
    }

    public static void myFavouriteMovies() {
        String [] movie = {"Real Steel", "The Take", "Ever After"};
        System.out.println(Arrays.asList(movie));
    }

}
