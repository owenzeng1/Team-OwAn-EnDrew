public class EnemyLord extends Hylian{
    //Total stats: 36, Growths: 22
    //Role: Lord, Weapons: Sword
    public EnemyLord(){
        FireEmblem levelChecker = new FireEmblem();
        Weapon[] inventory = new Weapon[3];
        inventory[0] = new BronzeSword();
        name = "Enemy Lord";
        allegiance = "Hylians";
        symbol = " L ";
        level = levelChecker.checkLevel();
        experience = 0;
        maxHP = 15 + (level * 5);
        HP = 15 + (level * 5);
        ATK = 4 + (level * 4);
        DEF = 3 + (level * 2);
        MAG = 4 + (level * 2);
        RES = 4 + (level * 2);
        SKL = 2 + (level * 3);
        SPD = 3 + (level * 2);
        LUK = 1 + (level * 2);
        maxMove = 4;
        drop = 60;
    }
    
    public void levelUp(String message){
        System.out.println("You shouldn't be seeing this");
        //levelUp will br programmed into the constructor
    }
    public static void main (String [] args) {
        EnemyLord a = new EnemyLord();
        System.out.println (a);
    }
}