public class Heal extends Weapon{
    public Heal(){
        name = "Heal";
        weaponType = "F";
        might = -5;
        crit = 0;
        hit = 100;
        range = 1;
        durability = 6;
        fullDur = 6;
        worth = (int)(600 * (durability / fullDur));
    }
}