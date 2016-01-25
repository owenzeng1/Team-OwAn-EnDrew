public class IronSword extends Weapon{
    public IronSword(){
        name = "Iron Sword";
        weaponType = "S";
        might = 5;
        crit = 0;
        hit = 95;
        range = 1;
        durability = 8;
        fullDur = 8;
        worth = (int) (520 * (durability / fullDur));
    }
}