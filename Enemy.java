import java.util.Random;
public class Enemy {
    double ATK = 0;
    double DEF = 0;
    double HP = 0;
    int xp  = 0;
    int gold = 0;
    Player one;
    String name = "";
    Random rand = new Random();

    public Enemy() {
        //name = getName();
     //   ATK = getATK();
       // DEF = getDEF();
       // HP = getHP();
    }

    public Enemy(Player p) {
        one = p;
        getName();
        getATK();
        getDEF();
        getHP();
        getReward();
    }

    private void getName() {
        name = "";
        int find = rand.nextInt(10)+1;
        switch (find) {
            case 1:
                name = "Older Bully";
                break;
            case 2:
                name = "Stray Cat";
                break;
            case 3:
                name = "Robot Wolf";
                break;
            case 4:
                name = "Witch's Apprentice";
                break;
            case 5:
                name = "Blind Bowman";
                break;
            case 6:
                name = "Johann the Hermit";
                break;
            case 7:
                name = "Fisherman";
                break;
            case 8:
                name = "Drunken Hunter";
                break;
            case 9:
                name = "Giant Snake";
                break;
            case 10:
                name = "Barbarian Spearman";
                break;
        }
    }

    private void getATK() {
        ATK = (double) ((one.LV*3)*2);
    }

    private void getDEF() {
        DEF = (double) ((one.LV*3)-1);
    }

    private void getHP() {
        HP = (double) (one.LV*10);

    }

    public int takeDMG() {
        int dmg = (int) (one.ATK-DEF);
        HP-=dmg;
        return dmg;
    }

    public int doDMG() {
        int dmg = (int) (ATK-one.DEF);
        if(dmg<0)
            dmg = 0;
        one.currentHP-=dmg;
        return dmg;
    }

    public boolean checkDead() {
        if(HP<=0)
            return true;
        else
            return false;
    }

    private void getReward() {
        xp = (int) HP*10;
        gold = xp/2;
    }



}
