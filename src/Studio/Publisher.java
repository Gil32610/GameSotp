package Studio;

import LinkedList.*;
import Game.*;
import Person.*;

public class Publisher {

    private SinglyLinkedList<Game> releasedGames;
    private Developer aDeveloper;

    public SinglyLinkedList<Game> getReleasedGames() {

        return releasedGames;
    }
    public void setReleasedGames(SinglyLinkedList<Game> releasedGames) {

        this.releasedGames = releasedGames;
    }
    public Developer getaDeveloper() {

        return aDeveloper;
    }
    public void setaDeveloper(Developer aDeveloper) {
        
        this.aDeveloper = aDeveloper;
    }
}

