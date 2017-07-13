
/**
 * Created by Нонна on 29.06.17.
*/

public class Card {
    private String cardName;
    private String cardSuite;
    private int cardValue;


    public Card(String cardName, String cardSuite, int cardValue) {
        this.cardName = cardName;
        this.cardValue = cardValue;
        this.cardSuite = cardSuite;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (!cardName.equals(card.cardName)) return false;
        return cardSuite.equals(card.cardSuite);

    }

    @Override
    public int hashCode() {
        int result = cardName.hashCode();
        result = 31 * result + cardSuite.hashCode();
        return result;
    }
}
