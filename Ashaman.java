public class Ashaman extends Character{
    //Total stats: 47, Growths: 18.5
    //Role: Mage, Weapons: Tomes only
    public Ashaman(){
        Weapon[] inventory = new Weapon[3];
        inventory[0] = new Wind();
        name = "Asha'man";
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
    }
    
    public void levelUp(String message){
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
}