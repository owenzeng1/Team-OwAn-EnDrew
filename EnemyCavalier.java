public class EnemyCavalier extends Hylian{
    //Total stats: 33, Growths: 22
    //Role: Myrmidon, Weapons: Sword only
    public EnemyCavalier(){
        FireEmblem levelChecker = new FireEmblem();
        inventory[0] = new BronzeLance();
        name = "Enemy Cavalier";
        allegiance = "Hylians";
        symbol = " C ";
        level = levelChecker.checkLevel();
        experience = 0;
        maxHP = 14 + (level * 5);
        HP = 14 + (level * 5);
        ATK = 4 + (level * 3);
        DEF = 3 + (level * 3);
        MAG = 0 + level;
        RES = 1 + (level * 2);
        SKL = 3 + (level * 2); 
        SPD = 4 + (level * 4);
        LUK = 4 + (level * 2);
        maxMove = 4;
        drop = 50;
        arrayholder = 8;
    }
    
    public void levelUp(String message){
        System.out.println("You shouldn't be seeing this");
        //levelUp programmed in the constructor
        
    }
}