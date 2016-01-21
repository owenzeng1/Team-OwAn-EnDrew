public abstract class Character{
    public String name;
    public int level;
    public int experience;
    public int maxHP;
    public int HP;
    public int ATK;
    public int DEF;
    public int MAG;
    public int RES;
    public int SKL;
    public int SPD;
    public int LUK;
    public int maxMove;
    
    //Basic functions that each character should have;
    public String toString(){
        String retStr = "Unit: " + name + "\n";
        retStr += "Level: " + (level + 1) + "\n";
        retStr += "EXP: " + experience + "\n";
        retStr += "HP: " + HP + "\n";
        retStr += "ATK: " + ATK + "\n";
        retStr += "DEF: " + DEF + "\n";
        retStr += "MAG: " + MAG + "\n";
        retStr += "RES: " + RES + "\n";
        retStr += "SKL: " + SKL + "\n";
        retStr += "SPD: " + SPD + "\n";
        retStr += "LUK: " + LUK + "\n";
        retStr += "Movement: " + maxMove + "\n";
        return retStr;
    }
    public boolean isAlive(){
        return this.HP > 0;
    }
    public boolean isLevelUp(){
        return experience >= 100;
    }
    public void attack(Character attacker, Character defender){
        hitRate = attacker.inventory[0].getHit
    }
    
    //Accessors
    public String getName(){
        return this.name;
    }
    public int getLevel(){
        return this.level;
    }
    public int getExp(){
        return this.experience;
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
    public int getMaxMove(){
        return this.maxMove;
    }
    
    
    //Mutators
    public void setName(String newName){
        this.name = newName;
    }
    public void setLevel(int newLevel){
        this.level = newLevel;
    }
    public void setExp(int newExp){
        this.experience = newExp;
    }
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
    
    abstract void levelUp(String message);
    
    /*public static void main(String[] args){
        Character archer = new William();
        System.out.println(archer);
        archer.setExp(160);
        if (archer.isLevelUp()){
            archer.levelUp("YOOOOOOOO");
            System.out.println(archer);
        }
    }
    */
}