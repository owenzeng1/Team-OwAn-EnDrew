public class IronBow extends Weapon{
    public IronBow(){
        name = "Iron Bow";
        weaponType = "B";
        might = 6;
        crit = 0;
        hit = 85;
        range = 2;
        durability = 9;
        fullDur = 9;
        worth = (int) (560 * (durability / fullDur));
    }
}