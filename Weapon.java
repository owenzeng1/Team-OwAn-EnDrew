public abstract class Weapon{
    public String name;
    public String weaponType;
    public int might;
    public int crit;
    public int hit;
    public int range;
    public int durability;
    public int fullDur;
    public int worth;
    
    //Basic functions
    public boolean isBroken(){
        return durability == 0;
    }
    public String toString(){
        String retStr = "Weapon: " + name + "\n";
        retStr += "Type: " + weaponType + "\n";
        retStr += "Might: " + might + "\n";
        retStr += "Crit: " + crit + "\n";
        retStr += "Hit: " + hit + "\n";
        if (weaponType.equals("SA") || weaponType.equals("T")){
            retStr += "Range: 1-2" + "\n";
        }
        else if (weaponType.equals("SB")){
            retStr += "Range: 2-3" + "\n";
        }
        else {
            retStr += "Range: " + range + "\n";
        }
        retStr += "Durability: " + durability + "\n";
        retStr += "Worth: " + worth + "\n";
        return retStr;
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
    
    public static void main (String[] args){
        Weapon destroyer = new BronzeLance();
        System.out.println(destroyer);
    }
}