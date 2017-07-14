import POJO.Dealer;
import POJO.Gambler;
import POJO.Player;

/**
 * Created by Нонна on 30.06.17.
 */
public class Lancher {
    public static void main( String[] args) {

       Player gambler = new Gambler();
       gambler.Player();
        Player dealer = new Dealer();
        dealer.Player();
    }
}
