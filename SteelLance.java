public class SteelLance extends Weapon{
    public SteelLance(){
        name = "Steel Lance";
        weaponType = "L";
        might = 9;
        crit = 0;
        hit = 80;
        range = 1;
        durability = 7;
        fullDur = 7;
        worth = (int) (910 * (durability / fullDur));
    }
}