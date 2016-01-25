public class Tomahawk extends Weapon{
    public Tomahawk(){
        name = "Tomahawk";
        weaponType = "SA";
        might = 10;
        crit = 10;
        hit = 60;
        range = 2;
        durability = 5;
        fullDur = 5;
        worth = (int)(2550 * (durability / fullDur));
    }
}