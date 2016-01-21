public class BronzeSword extends Weapon{
    public BronzeSword(){
        name = "Bronze Sword";
        weaponType = "S";
        might = 3;
        crit = 0;
        hit = 100;
        range = 1;
        durability = 10;
        fullDur = 10;
        worth = (int)(350 * (durability / fullDur));
    }
}