public class BlankUnit extends Unit{
    //Total stats: 47, Growths: 18.5
    //Role: PlaceHolder, Weapons: NoWeapon only
    public BlankUnit(){
        Weapon[] inventory = new Weapon[3];
        inventory[0] = new NoWeapon();
        name = "Blank";
        allegiance = "Nothing";
        symbol = "   ";
        color = "\u001B[31m\u001B[1m"; //Red and High Intensity
        level = 0;
        experience = 0;
        maxHP = 0;
        HP = 0;
        ATK = 0;
        DEF = 0;
        MAG = 0;
        RES = 0;
        SKL = 0;
        SPD = 0;
        LUK = 0;
        maxMove = 0;
        drop = 0;
    }
    
    
    
    public void levelUp(String message){
        //Nothing
    }
}