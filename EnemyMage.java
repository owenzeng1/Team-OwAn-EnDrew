public class EnemyMage extends Hylian{
    //Total stats: 30, Growths: 21
    //Role: Mage, Weapons: Tomes only
    public EnemyMage(){
        FireEmblem levelChecker = new FireEmblem();
        Weapon[] inventory = new Weapon[3];
        inventory[0] = new Wind();
        name = "Enemy Mage";
        allegiance = "Hylians";
        symbol = " M ";
        level = levelChecker.checkLevel();
        experience = 0;
        maxHP = 11 + (level * 4);
        HP = 11 + (level * 4);
        ATK = 0;
        DEF = 2 + (level * 2);
        MAG = 6 + (level * 4);
        RES = 5 + (level * 4);
        SKL = 2 + (level * 3);
        SPD = 4 + (level * 3);
        LUK = 0 + level;
        maxMove = 4;
        drop = 40;
    }
    
    public void levelUp(String message){
        System.out.println("You shouldn't be seeing this");
        //levelUp programmed in the constructor
    }
}