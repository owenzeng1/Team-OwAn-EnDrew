public class Nosferatu extends Weapon{
    public Nosferatu(){
        name = "Nosferatu";
        weaponType = "ST";
        might = 9;
        crit = 10;
        hit = 75;
        range = 2;
        durability = 4;
        fullDur = 4;
        worth = (int)(2340 * (durability / fullDur));
    }
}