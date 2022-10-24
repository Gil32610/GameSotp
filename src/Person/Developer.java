package Person;

import java.util.Scanner;
import LinkedList.*;
import Studio.Publisher;
import Game.*;

public class Developer extends Person  {

    private String username;
    private String password;

    public Developer(String fullname, String nationality, String username, String password) {

        super(fullname, nationality);
        this.username = username;
        this.password = password;
    }

    public void sendGamePublisher(Publisher p){

        Scanner s = new Scanner(System.in);

        String title = s.nextLine();
        AgeRating rating = new AgeRating();




        Game game = new Game(title, AgeRating rating, String genre, Integer releaseDate, double price);
        p.addLast(game);

    }
}
