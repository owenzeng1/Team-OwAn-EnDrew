public class DoubleBow extends Weapon{
    public DoubleBow(){
        name = "Double Bow";
        weaponType = "SB";
        might = 13;
        crit = 10;
        hit = 70;
        range = 3;
        durability = 5;
        fullDur = 5;
        worth = (int) (2650 * (durability / fullDur));
    }
}