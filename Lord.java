public class Lord extends Character{
    //Total stats: 47, Growths: 22
    //Role: Lord, Weapons: Tome, Sword
    public Lord(){
        Weapon[] inventory = new Weapon[3];
        inventory[0] = new BronzeSword();
        inventory[1] = new Wind();
        name = "Oliver";
        level = 0;
        experience = 0;
        maxHP = 19;
        HP = 19;
        ATK = 5;
        DEF = 3;
        MAG = 5;
        RES = 2;
        SKL = 3;
        SPD = 5;
        LUK = 5;
        maxMove = 4;
    }
    
    public void levelUp(String message){
        level += 1;
        experience -= 100;
        maxHP = 19 + level * 4;
        HP = 19 + level * 4;
        ATK = 5 + level * 3;
        DEF = (int)(3 + level * 2.5);
        MAG = (int)(5 + level * 2.5);
        RES = 2 + level * 2;
        SKL = 3 + level * 3;
        SPD = (int)(5 + level * 2.5);
        LUK = (int)(5 + level * 2.5);
    }
}