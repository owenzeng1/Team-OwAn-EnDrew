public class Ashaman extends Shepherds{
    //Total stats: 47, Growths: 18.5
    //Role: Mage, Weapons: Tomes only
    public Ashaman(){
        Weapon[] inventory = new Weapon[3];
        inventory[0] = new Wind();
        inventory[1] = new NoWeapon();
        inventory[2] = new NoWeapon();
        name = "Asha'man";
        allegiance = "Shepherds";
        symbol = " M ";
        color = "";
        level = 0;
        experience = 0;
        maxHP = 17;
        HP = 17;
        ATK = 1;
        DEF = 4;
        MAG = 8;
        RES = 7;
        SKL = 3;
        SPD = 6;
        LUK = 1;
        maxMove = 4;
        drop = 0;
        arrayholder = 0;
    }
    
    public void levelUp(String message){
        if (level < 5){
        System.out.println(message);
        level += 1;
        experience -= 100;
        maxHP = (int) (17 + level * 2.5);
        HP = (int)(17 + level * 2.5);
        ATK = (int)(1 + level * .5);
        DEF = (int)(4 + level * 2.5);
        MAG = (int)(8 + level * 4.25);
        RES = (int)(7 + level * 3.75);
        SKL = (int)(3 + level * 1.5);
        SPD = 6 + level * 2;
        LUK = 1 + level * 2;
        }
        else {
            experience = 99;
        }
    }
}