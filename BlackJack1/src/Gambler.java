import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * Created by Займед on 12.07.2017.
 */
public class Gambler extends Player {

    @Override
    public ArrayList<Card> playerCards() {
        System.out.println("NOW WE'll SEE GAMBLER's CARDS! ");
        ArrayList<Card> playerCardScore = new ArrayList<>();
        playerCardScore.addAll(playerCardScore);
    scanDraftCards(playerCardScore);
    return playerCardScore;
    }

    public void scanDraftCards(ArrayList<Card> playerCardds) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want one more card?(Y/N)");
        String userResponse = scanner.nextLine();
        if (userResponse.equalsIgnoreCase("y")) {
            playerCardds.add(CardGenerator.cardGen());
        System.out.println("Now, your score is:  " + getPlayerCardScore(playerCards()));

        } else if (userResponse.equalsIgnoreCase("n")) {

        } else {
            System.out.println("Y or N expected. Please enter answer!");

        }
       //return ;
    }
}

