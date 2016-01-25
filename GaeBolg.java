public class GaeBolg extends Weapon{
    public GaeBolg(){
        name = "Gáe Bolg";
        weaponType = "SL";
        might = 15;
        crit = 0;
        hit = 75;
        range = 1;
        durability = 5;
        fullDur = 5;
        worth = (int) (2470 * (durability / fullDur));
    }
}