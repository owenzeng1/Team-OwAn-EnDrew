public class Lord extends Shepherds{
    //Total stats: 47, Growths: 22
    //Role: Lord, Weapons: Tome, Sword
    public Lord(){
        inventory[0] = new BronzeSword();
        inventory[1] = new Wind();
        inventory[2] = new NoWeapon();
        name = "Oliver";
        allegiance = "Shepherds";
        symbol = " L ";
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
        drop = 0;
        arrayholder = 2;
    }
    
    public void levelUp(String message){
        if (level < 5) {
        System.out.println(message);
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
        else {
            experience = 99;
        }
    }
    
    public String ToString() {
        return color + symbol;
    }
   
    
     public static void main (String [] args) {
        Lord a = new Lord();
        System.out.println (a.getInfo());
        System.out.println (a.getArrayHolder());
    }
}