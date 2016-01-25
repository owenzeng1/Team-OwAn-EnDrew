public class SilverSword extends Weapon{
    public SilverSword(){
        name = "Silver Sword";
        weaponType = "S";
        might = 11;
        crit = 0;
        hit = 85;
        range = 1;
        durability = 6;
        fullDur = 6;
        worth = (int) (1410 * (durability / fullDur));
    }
}