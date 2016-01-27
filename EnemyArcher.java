public class EnemyArcher extends Hylian{
    //Total stats: 29, Growths: 22
    //Role: Mage, Weapons: Tomes only
    public EnemyArcher(){
        FireEmblem levelChecker = new FireEmblem();
        inventory[0] = new BronzeBow();
        name = "Enemy Archer";
        allegiance = "Hylians";
        symbol = " A ";
        level = levelChecker.checkLevel();
        experience = 0;
        maxHP = 10 + (level * 3);
        HP = 10 + (level * 3); 
        ATK = 3 + (level * 3);
        DEF = 1 + (level * 2);
        MAG = 1 + level;
        RES = 2 + (level * 2);
        SKL = 5 + (level * 4);
        SPD = 3 + (level * 3);
        LUK = 2 + (level * 3);
        maxMove = 4;
        drop = 30;
        arrayholder = 7;
    }
    
    public void levelUp(String message){
        System.out.println("You shouldn't be seeing this");
        //levelUp programmed in the constructor
    }
}