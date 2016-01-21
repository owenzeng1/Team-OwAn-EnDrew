public class Paige extends Character{
    //Total stats: 52, Growths: 19.5
    //Role: Knight, Weapons: Axes only
    public Paige(){
        Weapon[] inventory = new Weapon[3];
        inventory[0] = new BronzeAxe();
        name = "Paige";
        level = 0;
        experience = 0;
        maxHP = 22;
        HP = 22;
        ATK = 6;
        DEF = 8;
        MAG = 0;
        RES = 0;
        SKL = 6;
        SPD = 3;
        LUK = 7;
        maxMove = 3;
    }
    
    public void levelUp(String message){
        level += 1;
        experience -= 100;
        maxHP = 22 + level * 5;
        HP = 22 + level * 5;
        ATK = 6 + level * 3;
        DEF = 8 + level * 4;
        MAG = (int)(0 + level * .5);
        RES = 0 + level;
        SKL = 6 + level * 2;
        SPD = (int)(3 + level * 1.5);
        LUK = (int)(7 + level * 2.5);
    }
}