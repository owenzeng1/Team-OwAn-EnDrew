public class William extends Character{
    //Total stats: 45, Growths: 15.5
    //Role: Archer, Weapons: Bows only
    public William(){
        Weapon[] inventory = new Weapon[3];
        inventory[0] = new BronzeBow();
        name = "William";
        level = 0;
        experience = 0;
        maxHP = 16;
        HP = 16;
        ATK = 5; 
        DEF = 3;
        MAG = 1;
        RES = 2;
        SKL = 8;
        SPD = 5;
        LUK = 3;
        maxMove = 4;
    }
    
    public void levelUp(String message){
        level += 1;
        experience -= 100;
        maxHP = 16 + level * 3;
        HP = 16 + level * 3;
        ATK = (int)(5 + level * 2.25);
        DEF = 3 + level * 2;
        MAG = (int)(1 + level * .5);
        RES = (int)(2 + level * .75);
        SKL = (int) (8 + level * 3.5);
        SPD = (int) (5 + level * 2.5);
        LUK = 3 + level;
    }
}