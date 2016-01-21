public abstract class Weapon{
    public String name;
    public String weaponType;
    public int might;
    public int crit;
    public int hit;
    public int range;
    public int durability;
    
    //Basic functions
    public boolean isBroken(){
        return durability == 0;
    }
    
    //Accessors
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.weaponType;
    }
    public int getMight(){
        return this.might;
    }
    public int getCrit(){
        return this.crit;
    }
    public int getHit(){
        return this.hit;
    }
    public int getRange(){
        return this.range;
    }
    public int getDur(){
        return this.durability;
    }
    
    
    //Mutators
    public void setMight(int newMight){
        this.might = newMight;
    }
    public void setCrit(int newCrit){
        this.crit = newCrit;
    }
    public void setHit(int newHit){
        this.hit = newHit;
    }
    public void setDur(int newDur){
        this.durability = newDur;
    }
}