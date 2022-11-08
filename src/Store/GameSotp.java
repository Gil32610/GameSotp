package Store;

import Person.*;
import LinkedList.*;
import Game.*;
import java.util.Scanner;
import Game.AgeRating;

public class GameSotp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String fullname, email, nationality, cpf, username;
        Integer age;
        Game g;
        User user;
        AgeRating aRating;
        int op, i;

        do {
            options();
            op = Integer.parseInt(s.nextLine());
            switch (op) {
                case 1:
                    System.out.println("Informe o nome completo");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }

        } while (op != 0);

    }

    public static void options() {
        System.out.println("1- criar nova conta\n" + "2- ver catálogo\n" + " ");
    }
}
