public class IronAxe extends Weapon{
    public IronAxe(){
        name = "Iron Axe";
        weaponType = "A";
        might = 7;
        crit = 0;
        hit = 80;
        range = 1;
        durability = 8;
        fullDur = 8;
        worth = (int) (600 * (durability / fullDur));
    }
}