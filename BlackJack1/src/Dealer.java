import java.util.ArrayList;

/**
 * Created by Займед on 11.07.2017.
 */
public class Dealer extends Player {



    @Override
    public ArrayList<Card> playerCards() {
        System.out.println("NOW WE'll SEE, WHAT IS DEALER's CARDS! LOOK:  ");
        dealersLogic(super.playerCards());
        System.out.println("SO, the dealers hit summ IS: " + getPlayerCardScore(playerCards()));
        return super.playerCards();
    }

    public int dealersLogic(ArrayList<Card> dealerCards) {
        int dealerCardScore = getPlayerCardScore(playerCards());
        String dealerVoice = "Now... dealer desided to...mmm...maybe...i will try to...mmm...even take one more card...";
        int random1 = (int) (Math.random() * 2);
        int random2 = (int) (Math.random() * 3);
        int random3 = (int) (Math.random() * 4);
        if (dealerCardScore < 12) {
            System.out.println(dealerVoice);
            dealerCards.add(CardGenerator.cardGen());
        } else if (dealerCardScore < 15 && random1 == 1 ) {
            System.out.println(dealerVoice);
            dealerCards.add(CardGenerator.cardGen());
        } else if (dealerCardScore < 16 && random2 == 1) {
            System.out.println(dealerVoice);
            dealerCards.add(CardGenerator.cardGen());
        } else if (dealerCardScore < 18 && random3 == 1) {
            System.out.println(dealerVoice);
            dealerCards.add(CardGenerator.cardGen());
        } else {
            System.out.println("No thanks, i'm enough!");
        }
        return dealerCardScore;
    }
}
