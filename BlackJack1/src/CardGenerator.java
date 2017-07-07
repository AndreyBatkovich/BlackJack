import java.util.ArrayList;

/**
 * Created by Нонна on 29.06.17.
 */

public class CardGenerator {
    private static ArrayList<Card> takedCards = new ArrayList<>();

    public static Card cardGen() {
        int cN = (int) (Math.random() * 13);
        int cS = (int) (Math.random() * 4);
        String[] cardNameList = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "ACE"};
        String[] cardSuiteList = {"DIAMOND", "HEARTS", "CLUBS", "SPADE"};
        int[] cardValueList = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
        Card cardA = new Card(cardNameList[cN], cardSuiteList[cS], cardValueList[cN]);
        if ( takedCards.contains(cardA)) {
            cardA = cardGen();
        } else {
            takedCards.add(cardA);
            System.out.println(cardA);
        }
        return cardA;
    }
}
