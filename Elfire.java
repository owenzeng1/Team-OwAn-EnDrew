public class Elfire extends Weapon{
    public Elfire(){
        name = "Elfire";
        weaponType = "T";
        might = 5;
        crit = 0;
        hit = 85;
        range = 2;
        durability = 7;
        fullDur = 7;
        worth = (int)(980 * (durability / fullDur));
    }
}