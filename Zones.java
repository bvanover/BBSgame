import java.util.Scanner;
public class Zones {
    String home = "";
    Scanner in = new Scanner(System.in);
    Player one;
    public Zones() {

    }

    public Zones(Player p) {
        one = p;
       // home = one.locale;
        String homeland = one.locale;
        if(homeland.equals("Kurokuro"))
            kurokuroMsg();
        if(homeland.equals("Hikarika"))
            hikarikaMsg();
        if(homeland.equals("Yendar"))
            yendarMsg();
        if(homeland.equals("Sho"))
            shoMsg();
        if(homeland.equals("Gudheimi"))
            gudheimiMsg();
        if(homeland.equals("Aphrosia"))
            aphrosiaMsg();
        if(homeland.equals("Valharre"))
            valharreMsg();
    }

    public Zones(Player p, String c) {
        one = p;
        switch (c) {
            case "Kurokuro" -> kurokuroMsg();
            case "Hikarika" -> hikarikaMsg();
            case "Yendar" -> yendarMsg();
            case "Sho" -> shoMsg();
            case "Valharre" -> valharreMsg();
            case "Gudheimi" -> gudheimiMsg();
            case "Aphrosia" -> aphrosiaMsg();
        }
    }

    private void kurokuroMsg() {
        System.out.println("You enter the dark, dank town of Kurokuro.\n\nIn front of you are gray stone huts topped " +
                "with a deep, red roof. There is smoke coming from the chimneys of each of these huts, but your intuition " +
                "tells you it is not people cooking, but brewing potions and elixirs. \nYou walk deeper into town and begin " +
                "to see etchings and paintings of alchemical signs on the sides of buildings. You know this must be where the " +
                "masters of the Dark Arts reside.");
        one.currentPlace  = "Kurokuro";
        kurokuroActivities();
    }

    private void kurokuroActivities() {
        boolean checkHome = one.locale.equals("Kurokuro");
        System.out.println("What would you like to do?\n\n1. Wilderness\n2. Hanzo's Potion Emporium\n3. Travel\n4. Dwellings\n5. Weapon Shop\n6. Armor Shop\n");
        System.out.print("\n--> ");
        String resp = in.nextLine();
        int activity = Integer.parseInt(resp);
        switch(activity) {
            case 1:
                Wilderness wild = new Wilderness(one);
                break;
            case 2:
                //potionShop();
                break;
            case 3:
                travel("Kurokuro");
                break;
            case 4:
                if(!checkHome) {
                    System.out.println("You do not live here!");
                    kurokuroActivities();
                    break;
                }
                else
                    //enterHome();
                break;
            case 5:
                if(!checkHome) {
                    System.out.println("You do not live here!");
                    kurokuroActivities();
                    break;
                }
                else
                    shopWeapon();
                break;
            case 6:
                if (!checkHome) {
                    System.out.println("You do not live here!");
                    kurokuroActivities();
                    break;
                }
                else
                    //shopArmor();
                    break;
        }
    }

    private void hikarikaMsg() {
        System.out.println("You enter the vibrant town of Hikarika. \n\nBoth sides of the street are lined with small, " +
                "inviting homes made from slats of wood. There are plants growing along most of the homes, but they are not " +
                "unkempt.\nAs you stroll along the streets, something flashes before your eyes and you hear the sound of a door " +
                "slamming shut behind you. When you turn to look, there is a man opening the door with a bouquet of roses. " +
                "Impressed by his speed, you are sure this is the legendary Lightspeed.");
        one.currentPlace  = "Hikarika";
        hikarikaActivities();
    }

    private void hikarikaActivities() {
        boolean checkHome = one.locale.equals("Hikarika");
        System.out.println("What would you like to do?\n\n1. Wilderness\n2. Mako's Magic Shoppe\n3. Travel\n4. Dwellings\n5. Weapon Shop\n6. Armor Shop\n");
        System.out.print("\n--> ");
        String resp = in.nextLine();
        int activity = Integer.parseInt(resp);
        switch(activity) {
            case 1:
                Wilderness wild = new Wilderness(one);
                break;
            case 2:
                //potionShop();
                break;
            case 3:
                travel("Hikarika");
                break;
            case 4:
                if(!checkHome) {
                    System.out.println("You do not live here!");
                    hikarikaActivities();
                    break;
                }
                else
                    //enterHome();
                    break;
            case 5:
                if(!checkHome) {
                    System.out.println("You do not live here!");
                    hikarikaActivities();
                    break;
                }
                else
                    shopWeapon();
                    break;
            case 6:
                if (!checkHome) {
                    System.out.println("You do not live here!");
                    hikarikaActivities();
                    break;
                }
                else
                    //shopArmor();
                    break;
        }
    }


    private void yendarMsg() {
        System.out.println("You sneak in to the desolate town of Yendar.\n\nOnce lavish skyscrapers stand before you, " +
                "far out of their prime. On the street level, beggars sleep with the stray dogs and cats between " +
                "the decaying buildings.\nYou feel a small nudge at your side and look down to find a child " +
                "attempting to steal your wallet! Without a doubt, this is the home of the Thieves.");
        one.currentPlace  = "Yendar";
        yendarActivities();
    }

    private void yendarActivities() {
        boolean checkHome = one.locale.equals("Yendar");
        System.out.println("What would you like to do?\n\n1. Wilderness\n2. Mikhail's Items\n3. Travel\n4. Dwellings\n5. Weapon Shop\n6. Armor Shop\n");
        System.out.print("\n--> ");
        String resp = in.nextLine();
        int activity = Integer.parseInt(resp);
        switch(activity) {
            case 1:
                Wilderness wild = new Wilderness(one);
                break;
            case 2:
                //potionShop();
                break;
            case 3:
                travel("Yendar");
                break;
            case 4:
                if(!checkHome) {
                    System.out.println("You do not live here!");
                    yendarActivities();
                    break;
                }
                else
                    //enterHome();
                    break;
            case 5:
                if(!checkHome) {
                    System.out.println("You do not live here!");
                    yendarActivities();
                    break;
                }
                else
                    shopWeapon();
                    break;
            case 6:
                if (!checkHome) {
                    System.out.println("You do not live here!");
                    yendarActivities();
                    break;
                }
                else
                    //shopArmor();
                    break;
        }
    }

    private void shoMsg() {
        System.out.println("You come in to the advanced town of Sho.\n\nYou see buildings with glowing " +
                "signs, electronically locked doors with small keypads, and sleek metal siding.\nAs you " +
                "make your way down the street, you see what appears to be a dog coming to your side. When you lean down " +
                "to pet the dog, however, you realize it is made of metal. Some men in lab coats come to carry away " +
                "the dog and apologize. The Scientists are always working on their mysterious projects.");
        one.currentPlace  = "Sho";
        shoActivities();
    }

    private void shoActivities() {
        boolean checkHome = one.locale.equals("Sho");
        System.out.println("What would you like to do?\n\n1. Wilderness\n2. Scientific Beasts\n3. Travel\n4. Dwellings\n5. Weapon Shop\n6. Armor Shop\n");
        System.out.print("\n--> ");
        String resp = in.nextLine();
        int activity = Integer.parseInt(resp);
        switch(activity) {
            case 1:
                Wilderness wild = new Wilderness(one);
                break;
            case 2:
                //potionShop();
                break;
            case 3:
                travel("Sho");
                break;
            case 4:
                if(!checkHome) {
                    System.out.println("You do not live here!");
                    shoActivities();
                    break;
                }
                else
                    //enterHome();
                    break;
            case 5:
                if(!checkHome) {
                    System.out.println("You do not live here!");
                    System.out.println(one.locale);
                    shoActivities();
                    break;
                }
                else
                    shopWeapon();
                    break;
            case 6:
                if (!checkHome) {
                    System.out.println("You do not live here!");
                    shoActivities();
                    break;
                }
                else
                    //shopArmor();
                    break;
        }
    }

    private void gudheimiMsg() {
        System.out.println("You wander in to the tranquil town of Gudheimi.\n\nAll around you, monks are sitting " +
                "under trees, allowing themselves to be taken into nature's embrace. You smell honey and cherry " +
                "blossoms wafting through the air and taking you on a journey of bliss.\nSuddenly, a bell rings " +
                "and all of the monks stand towards the Central Tower and pray. A tradition for those of " +
                "The Great Faith.");
        one.currentPlace  = "Gudheimi";
        gudheimiActivities();
    }

    private void gudheimiActivities() {
        boolean checkHome = one.locale.equals("Gudheimi");
        System.out.println("What would you like to do?\n\n1. Wilderness\n2. Mystical Beasts\n3. Travel\n4. Dwellings\n5. Weapon Shop\n6. Armor Shop\n");
        System.out.print("\n--> ");
        String resp = in.nextLine();
        int activity = Integer.parseInt(resp);
        switch(activity) {
            case 1:
                Wilderness wild = new Wilderness(one);
                break;
            case 2:
                //potionShop();
                break;
            case 3:
                travel("Gudheimi");
                break;
            case 4:
                if(!checkHome) {
                    System.out.println("You do not live here!");
                    gudheimiActivities();
                    break;
                }
                else
                    //enterHome();
                    break;
            case 5:
                if(!checkHome) {
                    System.out.println("You do not live here!");
                    gudheimiActivities();
                    break;
                }
                else
                    shopWeapon();
                    break;
            case 6:
                if (!checkHome) {
                    System.out.println("You do not live here!");
                    gudheimiActivities();
                    break;
                }
                else
                    //shopArmor();
                    break;
        }
    }

    private void aphrosiaMsg() {
        System.out.println("You waltz into the beautiful city of Aphrosia.\n\nYou are greeted by a half dozen " +
                "maidens, all wearing extravagant clothing and pristine makeup. You look around and see a host " +
                "of shops and arenas for the city's games and carnivals.\nAfter getting caught in the grandeur of " +
                "the city, you look up to find yourself in front of <Beatrice's>, completely unaware of " +
                "how you got there. You feel like you may have been hypnotized, but are not sure by whom.");
        one.currentPlace  = "Aphrosia";
        aphrosiaActivities();
    }

    private void aphrosiaActivities() {
        boolean checkHome = one.locale.equals("Aphrosia");
        System.out.println("What would you like to do?\n\n1. Wilderness\n2. Love Shack\n3. Travel\n4. Dwellings\n5. Weapon Shop\n6. Armor Shop\n");
        System.out.print("\n--> ");
        String resp = in.nextLine();
        int activity = Integer.parseInt(resp);
        switch(activity) {
            case 1:
                Wilderness wild = new Wilderness(one);
                break;
            case 2:
                //potionShop();
                break;
            case 3:
                travel("Aphrosia");
                break;
            case 4:
                if(!checkHome) {
                    System.out.println("You do not live here!");
                    aphrosiaActivities();
                    break;
                }
                else
                    //enterHome();
                    break;
            case 5:
                if(!checkHome) {
                    System.out.println("You do not live here!");
                    aphrosiaActivities();
                    break;
                }
                else
                    shopWeapon();
                    break;
            case 6:
                if (!checkHome) {
                    System.out.println("You do not live here!");
                    aphrosiaActivities();
                    break;
                }
                else
                    //shopArmor();
                    break;
        }
    }

    private void valharreMsg() {
        System.out.println("You find yourself entering the gates of Valharre.\n\nSurrounding you are dojos and " +
                "dive bars with their signs on crooked and the windows busted out. You begin to think it is in a " +
                "state of disrepair, and then you remember the town's reputation. Walking around the cobblestone street, " +
                "you see blood and teeth covering the ground.\nIn front of you, two men begin to brawl in the town square. " +
                "Before you notice, the entire town seems eager on betting on the outcome of the fight. You expect nothing less " +
                "from the land of Warriors.");
        one.currentPlace  = "Valharre";
        valharreActivities();
    }

    private void valharreActivities() {
        boolean checkHome = one.locale.equals("Valharre");
        System.out.println("What would you like to do?\n\n1. Wilderness\n2. Combat Training\n3. Travel\n4. Dwellings\n5. Weapon Shop\n6. Armor Shop\n");
        System.out.print("\n--> ");
        String resp = in.nextLine();
        int activity = Integer.parseInt(resp);
        switch(activity) {
            case 1:
                Wilderness wild = new Wilderness(one);
                break;
            case 2:
                //potionShop();
                break;
            case 3:
                travel("Valharre");
                break;
            case 4:
                if(!checkHome) {
                    System.out.println("You do not live here!");
                    valharreActivities();
                    break;
                }
                else
                    //enterHome();
                    break;
            case 5:
                if(!checkHome) {
                    System.out.println("You do not live here!");
                    valharreActivities();
                    break;
                }
                else
                    shopWeapon();
                    break;
            case 6:
                if (!checkHome) {
                    System.out.println("You do not live here!");
                    valharreActivities();
                    break;
                }
                else
                    //shopArmor();
                    break;
        }
    }



    private void travel(String s) {
        System.out.println("Where would you like to travel to?\n\n1. Valharre\n2. Aphrosia\n3. Gudheimi\n4. Sho\n5. Yendar\n6. Hikarika\n7. Kurokuro\n8. Return Whence ye Came\n\n");
        System.out.print("--> ");
        String resp = in.nextLine();
        int travelTo = Integer.parseInt(resp);
        switch(travelTo) {
            case 1:
                System.out.println("Your current SP is " + (one.currentSP-1));
                valharreMsg();
                one.currentSP--;
                break;
            case 2:
                System.out.println("Your current SP is " + (one.currentSP-1));
                aphrosiaMsg();
                one.currentSP--;
                break;
            case 3:
                System.out.println("Your current SP is " + (one.currentSP-1));
                gudheimiMsg();
                one.currentSP--;
                break;
            case 4:
                System.out.println("Your current SP is " + (one.currentSP-1));
                shoMsg();
                one.currentSP--;
                break;
            case 5:
                System.out.println("Your current SP is " + (one.currentSP-1));
                yendarMsg();
                one.currentSP--;
                break;
            case 6:
                System.out.println("Your current SP is " + (one.currentSP-1));
                hikarikaMsg();
                one.currentSP--;
                break;
            case 7:
                System.out.println("Your current SP is " + (one.currentSP-1));
                kurokuroMsg();
                one.currentSP--;
                break;
            case 8:
                switch (s) {
                    case "Kurokuro" -> kurokuroMsg();
                    case "Hikarika" -> hikarikaMsg();
                    case "Yendar" -> yendarMsg();
                    case "Sho" -> shoMsg();
                    case "Valharre" -> valharreMsg();
                    case "Gudheimi" -> gudheimiMsg();
                    case "Aphrosia" -> aphrosiaMsg();
                }
                break;
        }
    }

    private void shopWeapon() {
        System.out.println("You walk in to the weapon shop.\nOtis stares at you grumply before saying: 'Aye, whaddaya want?'\nWhat do you wish to buy?\n\n1. Rusty Knife\n2. " +
                "Dull Sword\n3. Poorly Fashioned Axe\n4. Old Revolver\n5. Shuriken\n6. Throwing Knives\n7. Bo Staff\n8. Twin Daggers\n9. Heavy Axe\n10. Greatsword\n\n");
        System.out.print("--> ");
        String resp = in.nextLine();
        int ans = Integer.parseInt(resp);
        switch (ans) {
            case 1:
                one.weaponName = "Rusty Knife";
                one.weaponATK = 2;
                if(one.BAL>=200) {
                    one.BAL-=200;
                    System.out.println("Congratulations! You are the proud new owner of a Rusty Knife! 200 gold coins have been subtracted from your balance. Your current balance is: " + one.BAL + "\n\n");
                }
                else {
                    System.out.println("You do not have the money for this! You only have " + one.BAL + "! Get out of my shop!\n\n");
                    Zones back = new Zones(one, one.currentPlace);
                }
                break;
            case 2:
                one.weaponName = "Dull Sword";
                one.weaponATK = 3;
                if(one.BAL>=200) {
                    one.BAL-=200;
                    System.out.println("Congratulations! You are the proud new owner of a Rusty Knife! 200 gold coins have been subtracted from your balance. Your current balance is: " + one.BAL + "\n\n");
                }
                else {
                    System.out.println("You do not have the money for this! You only have " + one.BAL + "! Get out of my shop!\n\n");
                    Zones back = new Zones(one, one.currentPlace);
                }
                break;
            case 3:
                one.weaponName = "Poorly Fashioned Axe";
                one.weaponATK = 4;
                if(one.BAL>=200) {
                    one.BAL-=200;
                    System.out.println("Congratulations! You are the proud new owner of a Rusty Knife! 200 gold coins have been subtracted from your balance. Your current balance is: " + one.BAL + "\n\n");
                }
                else {
                    System.out.println("You do not have the money for this! You only have " + one.BAL + "! Get out of my shop!\n\n");
                    Zones back = new Zones(one, one.currentPlace);
                }
                break;
            case 4:
                one.weaponName = "Old Revolver";
                one.weaponATK = 5;
                if(one.BAL>=200) {
                    one.BAL-=200;
                    System.out.println("Congratulations! You are the proud new owner of a Rusty Knife! 200 gold coins have been subtracted from your balance. Your current balance is: " + one.BAL + "\n\n");
                }
                else {
                    System.out.println("You do not have the money for this! You only have " + one.BAL + "! Get out of my shop!\n\n");
                    Zones back = new Zones(one, one.currentPlace);
                }
                break;
            case 5:
                one.weaponName = "Shuriken";
                one.weaponATK = 6;
                if(one.BAL>=200) {
                    one.BAL-=200;
                    System.out.println("Congratulations! You are the proud new owner of a Rusty Knife! 200 gold coins have been subtracted from your balance. Your current balance is: " + one.BAL + "\n\n");
                }
                else {
                    System.out.println("You do not have the money for this! You only have " + one.BAL + "! Get out of my shop!\n\n");
                    Zones back = new Zones(one, one.currentPlace);
                }
                break;
            case 6:
                one.weaponName = "Throwing Knives";
                one.weaponATK = 7;
                if(one.BAL>=200) {
                    one.BAL-=200;
                    System.out.println("Congratulations! You are the proud new owner of a Rusty Knife! 200 gold coins have been subtracted from your balance. Your current balance is: " + one.BAL + "\n\n");
                }
                else {
                    System.out.println("You do not have the money for this! You only have " + one.BAL + "! Get out of my shop!\n\n");
                    Zones back = new Zones(one, one.currentPlace);
                }
                break;
            case 7:
                one.weaponName = "Bo Staff";
                one.weaponATK = 8;
                if(one.BAL>=200) {
                    one.BAL-=200;
                    System.out.println("Congratulations! You are the proud new owner of a Rusty Knife! 200 gold coins have been subtracted from your balance. Your current balance is: " + one.BAL + "\n\n");
                }
                else {
                    System.out.println("You do not have the money for this! You only have " + one.BAL + "! Get out of my shop!\n\n");
                    Zones back = new Zones(one, one.currentPlace);
                }
                break;
            case 8:
                one.weaponName = "Twin Daggers";
                one.weaponATK = 9;
                if(one.BAL>=200) {
                    one.BAL-=200;
                    System.out.println("Congratulations! You are the proud new owner of a Rusty Knife! 200 gold coins have been subtracted from your balance. Your current balance is: " + one.BAL + "\n\n");
                }
                else {
                    System.out.println("You do not have the money for this! You only have " + one.BAL + "! Get out of my shop!\n\n");
                    Zones back = new Zones(one, one.currentPlace);
                }
                break;
            case 9:
                one.weaponName = "Heavy Axe";
                one.weaponATK = 10;
                if(one.BAL>=200) {
                    one.BAL-=200;
                    System.out.println("Congratulations! You are the proud new owner of a Rusty Knife! 200 gold coins have been subtracted from your balance. Your current balance is: " + one.BAL + "\n\n");
                }
                else {
                    System.out.println("You do not have the money for this! You only have " + one.BAL + "! Get out of my shop!\n\n");
                    Zones back = new Zones(one, one.currentPlace);
                }
                break;
            case 10:
                one.weaponName = "Greatsword";
                one.weaponATK = 11;
                one.swapWeapon();
                if(one.BAL>=200) {
                    one.BAL-=200;
                    System.out.println("Congratulations! You are the proud new owner of a Rusty Knife! 200 gold coins have been subtracted from your balance. Your current balance is: " + one.BAL + "\n\n");
                    Zones back = new Zones(one, one.currentPlace);
                }
                else {
                    System.out.println("You do not have the money for this! You only have " + one.BAL + "! Get out of my shop!\n\n");
                    Zones back = new Zones(one, one.currentPlace);
                }
                break;
        }

    }



}
