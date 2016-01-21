public class BronzeBow extends Weapon{
    public BronzeBow(){
        name = "Bronze Bow";
        weaponType = "B";
        might = 3;
        crit = 0;
        hit = 90;
        range = 2;
        durability = 10;
        fullDur = 10;
        worth = (int) (350 * (durability / fullDur));
    }
}