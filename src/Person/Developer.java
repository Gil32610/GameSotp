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
        String title,genre; 
        AgeRating rating;
        Integer releaseDate;
        double price;
        Scanner s = new Scanner(System.in);
        
        
        


    }
}
