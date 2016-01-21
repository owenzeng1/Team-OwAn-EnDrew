public class BronzeLance extends Weapon{
    public BronzeLance(){
        name = "Bronze Lance";
        weaponType = "L";
        might = 3;
        crit = 0;
        hit = 90;
        range = 1;
        durability = 10;
        fullDur = 10;
        worth = (int)(350 * (durability / fullDur));
    }
}