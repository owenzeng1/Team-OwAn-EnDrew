public class Thoron extends Weapon{
    public Thoron(){
        name = "Thoron";
        weaponType = "T";
        might = 14;
        crit = 10;
        hit = 65;
        range = 2;
        durability = 5;
        fullDur = 5;
        worth = (int)(2200 * (durability / fullDur));
    }
}