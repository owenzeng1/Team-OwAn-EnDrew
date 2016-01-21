public class Lucien extends Character{
    //Total stats: 49, Growths: 19.25
    //Role: Myrmidon, Weapons: Sword only
    public Lucien(){
        Weapon[] inventory = new Weapon[3];
        inventory[0] = new BronzeSword();
        name = "Lucien";
        level = 0;
        experience = 0;
        maxHP = 17;
        HP = 17;
        ATK = 5;
        DEF = 3;
        MAG = 0;
        RES = 2;
        SKL = 8;
        SPD = 8;
        LUK = 6;
        maxMove = 4;
    }
    
    public void levelUp(String message){
        level += 1;
        experience -= 100;
        maxHP = (int)(17 + level * 3.5);
        HP = (int)(17 + level * 3.5);
        ATK = (int)(5 + level * 2.5);
        DEF = 3 + level * 2;
        MAG = (int)(0 + level * .25);
        RES = (int)(2 + level * .5);
        SKL = 8 + level * 4;
        SPD = 8 + level * 4;
        LUK = (int)(6 + level * 2.5);
    }
}