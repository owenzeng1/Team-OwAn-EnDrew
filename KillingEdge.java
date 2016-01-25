public class KillingEdge extends Weapon{
    public KillingEdge(){
        name = "Killing Edge";
        weaponType = "SS";
        might = 9;
        crit = 30;
        hit = 90;
        range = 1;
        durability = 6;
        fullDur = 6;
        worth = (int) (2340 * (durability / fullDur));
    }
}