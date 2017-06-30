import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Нонна on 30.06.17.
 */
public class Lancher {
    public static void main(String[] args) {
        System.out.println("NOW WE'll SEE, WHAT IS PLAYER CARDS GOT! ");
       ArrayList<Cards> playerCards = new ArrayList<Cards>() {
           {
               add(new Cards(CardGenerator.cardGen()));
               add(new Cards(CardGenerator.cardGen()));
           }
       };
       ArrayList<Cards> playerScore = new ArrayList<>();
       Iterator<Cards> iterPLSc = playerCards.iterator();
       if (iterPLSc.hasNext()) {
           for (Cards plSc = iterPLSc.next(); plSc != null; plSc=iterPLSc.next()) {
               System.out.println(plSc);
           }
               Cards etaKarta = iterPLSc.next();
               String ochkiEti = etaKarta.getCardName();
               System.out.println("NNIONIONOI   " + ochkiEti);
           }

       System.out.println("\n");




        System.out.println("NOW WE'll SEE, WHAT IS DEALER's CARDS! LOOK:  ");
        ArrayList<Integer> dealersCards = new ArrayList<>();
        dealersCards.add(CardGenerator.cardGen());
        dealersCards.add(CardGenerator.cardGen());




        }
}
