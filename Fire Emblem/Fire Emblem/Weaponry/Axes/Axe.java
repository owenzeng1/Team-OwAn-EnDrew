public interface Axe{
    private String weaponType = "A";
    abstract int might;
    abstract int hitRate;
    abstract int critRate;
    abstract int durability;
    public String getWeaponType(){
        return weaponType;
    }
    public int getMight(){
        return this.might;
    }
    public int getHit(){
        return this.hitRate;
    }
    public int getCrit(){
        return this.critRate;
    }
    public int getDurability(){
        return this.durability;
    }
    public void setHit(int newHit){
        this.hitRate = newHit;
    }
    public void setCrit(int newCrit){
        this.critRate = newCrit;
    }
    public void setDur(int newDur){
        this.durability = newDur;
    }
}