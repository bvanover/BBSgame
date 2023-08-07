import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Player {
    String name = "";
    String race = "";
    String locale = "";
    String type = "";
    String title = "";
    String AFF = "";
    String currentPlace = "";
    String weaponName = "Fists";
    String armorName = "Shirt";
    int LV = 0;
    int STR = 0;
    int DEX = 0;
    int CHAR = 0;
    int INTEL = 0;
    int SPD = 0;
    int FTH = 0;
    int SP = 0;
    int HP = 0;
    int DK = 0;
    int BL = 0;
    int XP = 0;
    int BAL = 0;
    int currentHP = 0;
    int currentSP = 0;
    int weaponATK = 1;
    int armorDEF = 1;
    int DEF = 0;
    int ATK = 0;


    public Player() {
        initStats();
        name = getName();
        //race = getRace();
        locale = getLocale();
        //type = getType();
    }

    //provides stats for a Lv. 1 Student
    private void initStats() {
        LV = 1;
        STR = 1;
        DEX = 1;
        CHAR = 1;
        INTEL = 1;
        SPD = 1;
        FTH = 1;
        SP = 10;
        HP = 10;
        XP = 0;
        BAL = 100;
        currentHP = 10;
        currentSP = 10;
        ATK = STR+DEX+SPD+weaponATK;
        DEF = SPD+INTEL+FTH+armorDEF;
    }

    private String getName() {
        System.out.println("Tell me your name, adventurer.\n");
        System.out.print("--> ");
        Scanner in = new Scanner(System.in);

        String tempName = in.nextLine();

        System.out.println("Aha, " + tempName + " seems like a fine name! That is your name, correct?\n");
        System.out.print("--> ");

        String resp = in.nextLine();

        if (resp.equals("Y") | resp.equals("y") | resp.equals("yes"))
            return tempName;
        else {
            boolean exit = false;
            do {
                System.out.println("Tell me your name, adventurer.\n");
                System.out.print("--> ");

                tempName = in.nextLine();

                System.out.println("Aha, " + tempName + " seems like a fine name! That is your name, correct?\n");
                System.out.print("--> ");

                resp = in.nextLine();
                if (resp.equals("Y") | resp.equals("y") | resp.equals("yes"))
                    exit = true;
            } while (!exit);
            return tempName;
        }

    }

    private String getLocale() {
        boolean exit = false;
        String tempLocale = "";
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Where do you remember growing up?\n\nKurokuro (the town of Darkness)\nHikarika (the town of Light" +
                    "\nYendar (the town of Theives)\nSho (the town of Science)\nValharre (the town of Warriors)" +
                    "\nGudheimi (the town of Priests)\nAprhosia (the town of Lovers)\n");
            System.out.print("--> ");

            tempLocale = in.nextLine();

            System.out.println("So, you remember growing up in the fine lands of " + tempLocale + " do you?");
            System.out.print("--> ");
            String resp = in.nextLine();
            if(resp.equals("y") | resp.equals("Y") | resp.equals("yes") | resp.equals("YES"))
                exit = true;
        } while(!exit);
        currentPlace = tempLocale;
        localeStory(tempLocale);
        return tempLocale;
    }

    private void localeStory(String home) {
        if(home.equals("Kurokuro")) {
            System.out.println("Being born in Kurokuro, you grew up surrounded by masters of the Dark Arts. While you may or may not follow" +
                    " in their footsteps, the lessons they taught you allowed you to master control of your spiritual energy." +
                    "\nYou have been granted +5! to your Spirit stat.");
            currentSP+=5;
            SP+=5;
        }
        if(home.equals("Hikarika")) {
            System.out.println("Being born in Hikarika, you were raised by masters of Lightspeed, a mythical ability to move faster than those" +
                    " from all other villages. You are far from skilled in this talent, but you have experienced it enough to be" +
                    " far faster than your average executioner.\nYou have been granted +2! to your Speed stat.");
            SPD+=2;
        }
        if(home.equals("Yendar")) {
            System.out.println("On the streets of Yendar, everyone is raised a thief. Doing your best to follow in the footsteps of " +
                    "your town, you also inherited their perpensity for theft. Picking pockets and cracking locks has made your " +
                    "hands dexterous and nimble.\nYou have been granted +2! to your Dexterity stat.");
            DEX+=2;
        }
        if(home.equals("Sho")) {
            System.out.println("The city of Sho, where the scientists go to practice their craft, is where you were born. " +
                    "There, the education system was harsh and only accepted the brightest of minds in the town. " +
                    "After putting in countless hours of work and study, you proved yourself to have as keen of a mind " +
                    "as anyone else in the land.\nYou have been granted +2! to your Intelligence stat.");
            INTEL+=2;
        }
        if(home.equals("Valharre")) {
            System.out.println("In Valharre, only the strong survive. Warriors from all over the globe call Valharre " +
                    "their home, as have you. Due to the overwhelming strength of your childhood friends and those " +
                    "around you, you learned you needed to get tough or die at an early age.\nYou have been granted +2! to your Strength stat.");
            STR+=2;
        }
        if(home.equals("Gudheimi")) {
            System.out.println("You were raised by the priests and nuns in the great city of Gudheimi. Although " +
                    "perhaps not as strong or as studious as others, you devoted your time to learning The Great Faith, " +
                    "all of the tales of wonder, good, and evil entranced you from a young age, and you became devout.\n" +
                    "You have been granted +2! to your Faith stat.");
            FTH+=2;
        }
        if(home.equals("Aphrosia")) {
            System.out.println("In the broader world, Aphrosia is known as the city of love. While you were much too " +
                    "young to be learning love and lust, you mastered the art of earning one's trust and how to" +
                    " make people happy to do your bidding.\nYou have been granted +2! to your Charisma stat.");
            CHAR+=2;
        }
    }

    public boolean canDK() {
        if(XP==(1000*(DK+1)))
            return true;
        else
            return false;
    }

    public boolean canReborn() {
        if(DK>=50)
            return true;
        else
            return false;
    }

    public void addXP(int x) {
        XP+=x;
        if(XP%((DK+1)*1000)==0 && LV<10) {
            LV++;
            HP+=5;
            STR++;
            SPD++;
            INTEL++;
            CHAR++;
            SP+=2;
            DEX++;
            FTH++;
        }
    }

    public void killDragon() {
        //for when a player kills a Dragon. See: forest.java
        DK++;
        XP = 0;
        LV = 0;
        BAL = 0;
        currentHP = 10;
        currentSP = 10;
        //increaseStat();
    }

    public void setGood() {
        AFF = "Good";
    }

    public void setEvil() {
        AFF = "Evil";
    }

    public void setNeutral() {
        AFF = "Neutral";
    }

    public void setTitle() {
        if(DK<=1)
            title = "Student ";
        if(DK>=2 && DK<5)
            title = "Apprentice Executioner ";
        if(DK>=5 && DK<10)
            title = "Executioner ";
        if(DK>=10 && DK<15)
            title = "Sr. Executioner ";
        if(DK>=15 && DK<20)
            title = "A-Class ";
        if(DK>=20 && DK<30)
            title = "S-Class ";
        if(DK>=30 && DK<40)
            title = "SS-Class ";
        if(DK>=40 && DK<50)
            title = "SSS-Class ";
        if(DK>=50 && DK<100)
            title = "X-Class ";
        if(DK>=100 && BL==1 && AFF.equals("Good"))
            title = "Archangel ";
        if(DK>=100 && BL==1 && AFF.equals("Evil"))
            title = "Horseman ";
        if(DK>=100 && BL==1 && AFF.equals("Neutral"))
            title = "Chancellor ";
    }

    public void rebirth() {
        //race = getRace();
        DK = 0;
        LV = 0;
        STR = 1;
        DEX = 1;
        CHAR = 1;
        INTEL = 1;
        SPD = 1;
        FTH = 1;
        SP = 10;
        HP = 10;
        BL++;
        BAL = 0;
        currentHP = 10;
        currentSP = 10;
    }

    public boolean checkDead() {
        if(currentHP<=0)
            return true;
        else
            return false;
    }

    public void death() {
        System.out.println("\n\nYOU HAVE DIED =(\n\nYou will start over at the beginning of this DK. Good luck!");
        LV = 0;
        XP = 0;
        currentHP = HP;
        currentSP = SP;
        BAL = 100;
        weaponATK = 1;
        weaponName = "Fists";
        armorDEF = 1;
        armorName = "Shirt";

    }

    public void swapWeapon() {
        ATK = STR+DEX+SPD+weaponATK;
        DEF = SPD+FTH+INTEL+armorDEF;
    }
}
