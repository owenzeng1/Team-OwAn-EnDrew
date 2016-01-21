public class AWilliam extends Character{
    Object[] inventory = new Object [3];
    public AWilliam(){
        Weapon first = new BowBronze();
        inventory[0] = first;
        name = "William";
    }
}