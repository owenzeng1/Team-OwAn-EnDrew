public class IronLance extends Weapon{
    public IronLance(){
        name = "Iron Lance";
        weaponType = "L";
        might = 6;
        crit = 0;
        hit = 85;
        range = 1;
        durability = 8;
        fullDur = 8;
        worth = (int) (560 * (durability / fullDur));
    }
}