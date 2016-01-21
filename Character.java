public abstract class Character{
    public String name;
    public int HP;
    public int DEF;
    public int MAG;
    public int RES;
    public int SKL;
    public int SPD;
    public int LUK;
    
    //Basic functions that each character should have;
    public boolean isAlive(){
        return this.HP > 0;
    }
    public void attack(Character attacker, Character defender){
        
    }
}