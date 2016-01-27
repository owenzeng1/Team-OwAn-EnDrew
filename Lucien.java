public class Lucien extends Shepherds{
    //Total stats: 49, Growths: 19.25
    //Role: Myrmidon, Weapons: Sword only
    public Lucien(){
        inventory[0] = new BronzeSword();
        inventory[1] = new NoWeapon();
        inventory[2] = new NoWeapon();
        name = "Lucien";
        allegiance = "Shepherds";
        symbol = " S ";
        color = "";
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
        drop = 0;
        arrayholder = 3;
    }
    
    public void levelUp(String message){
        if (level < 5){
        System.out.println(message);
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
        else {
            experience = 99;
        }
    }
}