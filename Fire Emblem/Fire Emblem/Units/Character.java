public interface Character{
    abstract String nameOf;
    abstract int HP;
    abstract int ATK;
    abstract int DEF;
    abstract int MAG;
    abstract int RES;
    abstract int SKL;
    abstract int SPD;
    abstract int LUK;
    abstract int maxMovement;
    public void setHP(int newHP){
        this.HP = newHP;
    }
    public void setATK(int newATK){
        this.ATK = newATK;
    }
    public void setDEF(int newDEF){
        this.DEF = newDEF;
    }
    public void setMAG(int newMAG){
        this.MAG = newMAG;
    }
    public void setRES(int newRES){
        this.RES = newRES;
    }
    public void setSKL(int newSKL){
        this.SKL = newSKL;
    }
    public void setSPD(int newSPD){
        this.SPD = newSPD;
    }
    public void setLUK(int newLUK){
        this.LUK = newLUK;
    }
     public void setHP(int newHP){
        this.HP = newHP;
    }
    
    
    public int getHP(){
        return this.HP;
    }
    public int getATK(){
        return this.ATK;
    }
    public int getDEF(){
        return this.DEF;
    }
    public int getMAG(){
        return this.MAG;
    }
    public int getRES(){
        return this.RES;
    }
    public int getSKL(){
        return this.SKL;
    }
    public int getSPD(){
        return this.SPD;
    }
    public int getLUK(){
        return this.LUK;
    }
    
    public void attack(Character attacker , Character defender){
        
    }
    public static void main(String[] args){
        System.out.println("working");
    }
    public void takeDamage(int damage){
        
    }
}