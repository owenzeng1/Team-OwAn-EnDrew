public class EnemyMyrmidon extends Hylian{
    //Total stats: 31, Growths: 22
    //Role: Myrmidon, Weapons: Sword only
    public EnemyMyrmidon(){
        FireEmblem levelChecker = new FireEmblem();
        inventory[0] = new BronzeSword();
        name = "Enemy Myrmidon";
        allegiance = "Hylians";
        symbol = " S ";
        level = levelChecker.checkLevel();
        experience = 0;
        maxHP = 11 + (level * 4);
        HP = 11 + (level * 4);
        ATK = 4 + (level * 2);
        DEF = 1 + (level * 2);
        MAG = 0 + level;
        RES = 1 + (level * 2);
        SKL = 5 + (level * 4);
        SPD = 5 + (level * 4);
        LUK = 4 + (level * 3);
        maxMove = 4;
        drop = 40;
        arrayholder = 12;
    }
    
    public void levelUp(String message){
        System.out.println("You shouldn't be seeing this");
        //levelUp programmed in the constructor
        
    }
}