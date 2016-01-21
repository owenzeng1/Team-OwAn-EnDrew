public class BronzeAxe extends Weapon{
    public BronzeAxe(){
        name = "Bronze Axe";
        weaponType = "A";
        might = 4;
        crit = 0;
        hit = 80;
        range = 1;
        durability = 10;
        fullDur = 10;
        worth = (int)(400 * (durability / fullDur));
    }
}