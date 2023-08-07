import java.util.Scanner;
public class Wilderness {
    Player one;
    Scanner in = new Scanner(System.in);

    public Wilderness() {

    }

    public Wilderness(Player p) {
        one = p;
        prompt();
    }

    private void prompt() {
        System.out.println(one.name + " walks into the Wilderness, where dangers lie around every corner.\n\nWhat will you do?\n\n1. Look for something to kill\n2. " +
                "Healer's Hut\n3. Return Whence ye Came\n");
        if(one.canDK())
            System.out.println("4. Slay the Dragon!\n");
        System.out.println();
        System.out.print("--> ");
        String resp = in.nextLine();
        int ans  = Integer.parseInt(resp);

        switch (ans) {
            case 1:
                hunt();
                break;
            case 2:
                heal();
                break;
            case 3:
                Zones zone = new Zones(one, one.currentPlace);
                break;
            case 4:
                //dragonFight();
                break;
        }
    }

    private void hunt() {
        Enemy opponent = new Enemy(one);
        System.out.println("You come across <" + opponent.name + ">! What will you do?\n1. Fight\n2. Run\n\n");
        System.out.print("--> ");
        String resp = in.nextLine();
        int ans = Integer.parseInt(resp);
        if(ans==1)
            fight(opponent);
        if(ans==2) {
            Zones back = new Zones(one, one.currentPlace);
        }
    }

    private void fight(Enemy opponent) {
        System.out.println("You have chosen to do battle with " + opponent.name + "!\n\nYou have the first move! What do you want to do?\n" +
                "1. Attack\n2. X\n3. Y\n4. Z\n\n");
        System.out.print("--> ");
        String resp = in.nextLine();
        int ans = Integer.parseInt(resp);
        switch(ans) {
            case 1:
                System.out.println("You swing your " + one.weaponName + " at " + opponent.name + "!\nYou have dealt " + opponent.takeDMG() + " damage!\n" +
                        opponent.name + " now has " + opponent.HP + "!");
                if(opponent.checkDead()) {
                    System.out.println("You have vanquished " + opponent.name + "! You have been rewarded with: " + opponent.xp + " XP and " + opponent.gold + " gold coins!");
                    one.BAL+=opponent.gold;
                    one.addXP(opponent.xp);
                    prompt();
                    break;
                }
                System.out.println(opponent.name + " strikes back, dealing " + opponent.doDMG() + "!\nYou now have " + one.currentHP + "!\n");
                if(one.checkDead()) {
                    one.death();
                    Zones zone = new Zones(one);
                }
                fight(opponent);
                break;
        }
    }

    private void heal() {
        one.BAL-=30;
        one.currentHP = one.HP;
        System.out.println("You have been succesfully healed! The Life Magician has taken 30 gold pieces as payment! \nYour current balance is: " + one.BAL);

    }
}

