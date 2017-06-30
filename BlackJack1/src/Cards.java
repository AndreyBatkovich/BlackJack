
/**
 * Created by Нонна on 29.06.17.
*/

public class Cards {
    private String cardName;
    private String cardSuite;
    private int cardValue;


    public Cards (String cardName, String cardSuite, int cardValue) {
        this.cardName = cardName;
        this.cardValue = cardValue;
        this.cardSuite = cardSuite;
    }

    public Cards(int i) {
    }

    public String getCardSuite() {
        return cardSuite;
    }

    public String getCardName() {
        return cardName;
    }
    public int getCardValue() {
        return cardValue;
    }

   public  String toString(){
   return "CARD NAME  " + cardName + "   " + cardSuite;
   }
}
