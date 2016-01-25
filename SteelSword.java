public class SteelSword extends Weapon{
    public SteelSword(){
        name = "Steel Sword";
        weaponType = "S";
        might = 5;
        crit = 0;
        hit = 90;
        range = 1;
        durability = 7;
        fullDur = 7;
        worth = (int) (840 * (durability / fullDur));
    }
}