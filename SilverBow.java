public class SilverBow extends Weapon{
    public SilverBow(){
        name = "Silver Bow";
        weaponType = "B";
        might = 13;
        crit = 0;
        hit = 75;
        range = 2;
        durability = 6;
        fullDur = 6;
        worth = (int) (1560 * (durability / fullDur));
    }
}