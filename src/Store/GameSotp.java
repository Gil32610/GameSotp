package Store;

import Person.*;
import LinkedList.*;
import Game.*;
import java.util.Scanner;
import Game.AgeRating;

public class GameSotp {
    public static void main(String[] args) {

        AgeRating idade;
        System.out.println(idade.getDescription());
        Scanner s = new Scanner(System.in);
        int op, i;

        do {
            options();
            op = Integer.parseInt(s.nextLine());
            switch(op){
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

    public static void aRating() {
        System.out.println("1- classificação livre\n" + "2- Não recomendado para menores de 10 anos\n"
                + "3 - Não recomendado para menores de 12 anos\n" + "4 - Não recomendado para menores de 14 anos\n"
                + "5 - Não recomendado para menores de 16 anos\n" + "6 - Não recomendado para menores de 18 anos");
    }
    public static AgeRating rating(int i){
       
        switch (i) {
            case 1:
                return AgeRating.L;
            case 2:
                return AgeRating.M10;
            case 3:
                return AgeRating.M12;

            case 4:
                return AgeRating.M14;
            case 5:
                return AgeRating.M16;
            case 6:
                return AgeRating.M18;
            default:
                return null;

        }
    }
    

}
