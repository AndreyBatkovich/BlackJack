/**
 * Created by Нонна on 29.06.17.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class CardGenerator {
    public static int cardGen() {
        int cN = (int) (Math.random() * 13);
        int cS = (int) (Math.random() * 4);
        String[] cardNameList = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "ACE"};
        String[] cardSuiteList = {"DIAMOND", "HEARTS", "CLUBS", "SPADE"};
        int[] cardValueList = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
        ArrayList<Cards> cardA = new ArrayList<Cards>() {
            {
                add(new Cards(cardNameList[cN], cardSuiteList[cS], cardValueList[cN]));
            }
        };
        for (Cards cRd: cardA) {
            System.out.println(cRd.toString());
        }
        int cardValue1 = cardValueList[cN];
        return cardValue1;
    }

}
