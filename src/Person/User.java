package Person;
import LinkedList.*;
import Game.*;
public class User  extends Person{
    private String email;
    private String username;
    private Integer age;
    private SinglyLinkedList<Game> gameList;
    

    public User(String cpf, String fullname, String nationality, String email, String username, Integer age){
        super(cpf, fullname, nationality);
        this.email = email;
        this.username = username;
        this.age = age;
        this.gameList = new SinglyLinkedList<>();

    }

    



    
}
