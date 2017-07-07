import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Нонна on 30.06.17.
 */
public class Lancher {
    public static void main(String[] args) {
        System.out.println("NOW WE'll SEE, WHAT IS PLAYER CARDS GOT! ");
        ArrayList<Card> playerCards = new ArrayList<>();
        playerCards.add(CardGenerator.cardGen());
        playerCards.add(CardGenerator.cardGen());

        int playerCardScore = getPlayerCardScore(playerCards);
        System.out.println("Player card summ:  " + playerCardScore);

        scanDraftCards(playerCards);

        System.out.println("\n");
        System.out.println("NOW WE'll SEE, WHAT IS DEALER's CARDS! LOOK:  ");
        ArrayList<Card> dealersCards = new ArrayList<>();
        dealersCards.add(CardGenerator.cardGen());
        dealersCards.add(CardGenerator.cardGen());

        int dealerCardScore = getPlayerCardScore(dealersCards);
        System.out.println("dealer card summ:  " + dealerCardScore);

    }

    private static int getPlayerCardScore(ArrayList<Card> cards) {
        int totalScore = 0;
        for (Card card : cards) {
            totalScore += card.getCardValue();
        }
        return totalScore;
    }

    private static void scanDraftCards(ArrayList<Card> playerCardd) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Do you want one more card?(Y/N)");
        String userResponse = scanner.nextLine();
        if (userResponse.equalsIgnoreCase("y")) {
            playerCardd.add(CardGenerator.cardGen());
            System.out.println("Now, your score is:  " + getPlayerCardScore(playerCardd));
            scanDraftCards(playerCardd);
        } else if (userResponse.equalsIgnoreCase("n")) {
            return;
        } else {
            System.out.println("Y or N expected. Please enter answer!");
            scanDraftCards(playerCardd);
        }
    }

}
