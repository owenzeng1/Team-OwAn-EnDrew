public class EnemyKnight extends Hylian{
    //Total stats: 35, Growths: 23
    //Role: Knight, Weapons: Axes only
    public EnemyKnight(){
        FireEmblem levelChecker = new FireEmblem();
        inventory[0] = new BronzeAxe();
        name = "Enemy Knight";
        allegiance = "Hylians";
        symbol = " K ";
        level = levelChecker.checkLevel();
        experience = 0;
        maxHP = 16 + (level * 6);
        HP = 16 + (level * 6);
        ATK = 4 + (level * 3);
        DEF = 6 + (level * 5);
        MAG = 0;
        RES = 0 + level;
        SKL = 4 + (level * 4);
        SPD = 1 + level;
        LUK = 4 + (level * 3);
        maxMove = 3;
        drop = 50;
        arrayholder = 9;
    }
    
    public void levelUp(String message){
        System.out.println("You shouldn't be seeing this");
        //levelUp programmed in the constructor
    }
}