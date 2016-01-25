public class SilverAxe extends Weapon{
    public SilverAxe(){
        name = "Silver Axe";
        weaponType = "A";
        might = 15;
        crit = 0;
        hit = 65;
        range = 1;
        durability = 6;
        fullDur = 6;
        worth = (int) (1740 * (durability / fullDur));
    }
}