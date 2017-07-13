import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Займед on 12.07.2017.
 */
public class Player {

    public ArrayList<Card> playerCards() {
        ArrayList<Card> playerCardsList = new ArrayList<>();
        playerCardsList.add(CardGenerator.cardGen());
        playerCardsList.add(CardGenerator.cardGen());

        System.out.println("TOTAL Cards summ:  " + getPlayerCardScore(playerCardsList));
        return playerCardsList;
    }

    public int getPlayerCardScore(ArrayList<Card> cards) {
        int totalScore = 0;
        for (Card card : cards) {
            totalScore += card.getCardValue();
        }
        return totalScore;
    }

}
