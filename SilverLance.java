public class SilverLance extends Weapon{
    public SilverLance(){
        name = "Silver Lance";
        weaponType = "L";
        might = 13;
        crit = 0;
        hit = 75;
        range = 1;
        durability = 6;
        fullDur = 6;
        worth = (int) (1560 * (durability / fullDur));
    }
}