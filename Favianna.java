public class Favianna extends Shepherds{
    //Total stats: 49, Growths: 20.25
    //Role: Cavalier, Weapons: Lance only
    public Favianna(){
        Weapon[] inventory = new Weapon[3];
        inventory[0] = new BronzeLance();
        name = "Favianna";
        allegiance = "Shepherds";
        symbol = " C ";
        color = "";
        level = 0;
        experience = 0;
        maxHP = 20;
        HP = 20;
        ATK = 6;
        DEF = 5;
        MAG = 1;
        RES = 2;
        SKL = 4;
        SPD = 7;
        LUK = 4;
        maxMove = 5;
        drop = 0;
    }
    
    public void levelUp(String message){
        if (level < 5){
        System.out.println(message);
        level += 1;
        experience -= 100;
        maxHP = 20 + level * 5;
        HP = 20 + level * 5;
        ATK = 6 + level * 3;
        DEF = (int)(5 + level * 2.5);
        MAG = 1 + level;
        RES = (int) (2 + level * .75);
        SKL = 4 + level * 3;
        SPD = 7 + level * 3;
        LUK = 4 + level * 2;
        }
        else {
            experience = 99;
        }
    }
}