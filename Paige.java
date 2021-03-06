public class Paige extends Shepherds{
    //Total stats: 52, Growths: 19.5
    //Role: Knight, Weapons: Axes only
    public Paige(){
        inventory[0] = new BronzeAxe();
        inventory[1] = new NoWeapon();
        inventory[2] = new NoWeapon();
        name = "Paige";
        allegiance = "Shepherds";
        symbol = " K ";
        color = "";
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
        drop = 0;
        arrayholder = 4;
    }
    
    public void levelUp(String message){
        if (level < 5){
        System.out.println(message);
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
        else {
            experience = 99;
        }
    }
}