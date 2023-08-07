// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Player one = new Player();
        //System.out.println(one.name + one.locale);
        spawn(one);
    }
    private static void spawn(Player one) {
        System.out.println("You awaken outside of " + one.locale + " dazed and rather confused. It is clear that the weapons, armor, " +
                "and money you were carrying are all gone, likely robbed from a <Bandit>. As a fresh student to the Executioner trade, " +
                "this is to be expected, but it still has you feeling bummed. You search around where you have woken to find exactly " +
                "100 gold coins. It may be chump change, but should be enough to get you started.");
        Zones homeland = new Zones(one);
       // System.out.println(one.SP);
    }
}

