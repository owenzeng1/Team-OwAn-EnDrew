public class Arcthunder extends Weapon{
    public Arcthunder(){
        name = "Arcthunder";
        weaponType = "T";
        might = 10;
        crit = 10;
        hit = 70;
        range = 2;
        durability = 6;
        fullDur = 6;
        worth = (int)(1620 * (durability / fullDur));
    }
}