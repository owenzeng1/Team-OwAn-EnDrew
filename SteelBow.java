public class SteelBow extends Weapon{
    public SteelBow(){
        name = "Steel Bow";
        weaponType = "B";
        might = 9;
        crit = 0;
        hit = 80;
        range = 2;
        durability = 7;
        fullDur = 7;
        worth = (int) (910 * (durability / fullDur));
    }
}