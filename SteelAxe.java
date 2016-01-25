public class SteelAxe extends Weapon{
    public SteelAxe(){
        name = "Steel Axe";
        weaponType = "A";
        might = 11;
        crit = 0;
        hit = 70;
        range = 1;
        durability = 7;
        fullDur = 7;
        worth = (int) (980 * (durability / fullDur));
    }
}