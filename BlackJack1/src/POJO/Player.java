package POJO;

import POJO.Card;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Займед on 12.07.2017.
 */
public abstract class Player {

    public ArrayList<Card> Player() {
        ArrayList<Card> playerCards = new ArrayList<>();
        playerCards.add(CardGenerator.cardGen());
        playerCards.add(CardGenerator.cardGen());
        return playerCards;
    }

}
