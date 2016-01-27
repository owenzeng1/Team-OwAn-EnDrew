public class Julius extends Shepherds{
    //Total stats: 46, Growths: 18.75
    //Role: Healer, Weapons: Staffs only
    public Julius(){
        inventory[0] = new Heal();
        inventory[1] = new NoWeapon();
        inventory[2] = new NoWeapon();
        name = "Julius";
        allegiance = "Shepherds";
        symbol = " H ";
        color = "";
        level = 0;
        experience = 0;
        maxHP = 15;
        HP = 15;
        ATK = 0;
        DEF = 2;
        MAG = 7;
        RES = 7;
        SKL = 5;
        SPD = 3;
        LUK = 7;
        maxMove = 4;
        drop = 0;
        arrayholder = 1;
    }
    
    public void levelUp(String message){
        if (level < 5){
        System.out.println(message);
        level += 1;
        experience -= 100;
        maxHP = 15 + level * 2;
        HP = 15 + level * 2;
        ATK = (int)(0 + level * .25);
        DEF = 2 + level * 2;
        MAG = (int)(7 + level * 3.5);
        RES = 7 + level * 3;
        SKL = 5 + level * 2;
        SPD = (int)(5 + level * 2.5);
        LUK = (int)(5 + level * 3.5);
        }
        else {
            experience = 99;
        }
    }
}