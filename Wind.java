public class Wind extends Weapon{
    public Wind(){
        name = "Wind";
        weaponType = "T";
        might = 1;
        crit = 0;
        hit = 100;
        range = 2;
        durability = 9;
        fullDur = 9;
        worth = (int)(450 * (durability / fullDur));
    }
}