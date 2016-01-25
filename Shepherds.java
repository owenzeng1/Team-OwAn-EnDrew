public abstract class Shepherds extends Unit{    
    Weapon[] inventory = new Weapon[3];
    public String name;
    public String allegiance;
    public String symbol;
    public String color = "\u001B[37m\u001B[1m";
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
    public int drop;
    
    abstract void levelUp(String message);
    
     public String toString() {
        return color + symbol;
    }
    public String getInfo(){
        String retStr = "Unit: " + name + "\n";
        retStr += "Allegiance: " + allegiance + "\n";
        retStr += "Level: " + level + "\n";
        retStr += "EXP: " + experience + "\n";
        retStr += "Item: " + inventory[0].getName() + "\n";
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
    public Weapon getEquip(){
        return this.inventory[0];
    }
    public void expGain(int reward){
        this.experience += reward;
    }
    public int getDamage(Unit offense, Unit defense){
        if(offense.inventory[0].getType().equals("T")){
            return offense.getMAG() - defense.getRES();
        }
        else{
            return offense.getATK() - defense.getDEF();
        }
    }
    public void swapWeapon(int first, int second){
        if (0 <= first && first <= 3 && 0 <= second && second <= 3){
            if (this.inventory[first] != null && this.inventory[second] != null){
                Weapon temp = this.inventory[first];
                this.inventory[first] = this.inventory[second];
                this.inventory[second] = temp;
            }
        }
    }
    public void attack(Unit attacker, Unit defender, boolean outOfRange){
        //setting up a lot of variables that will be used
        double atkAccuracy = attacker.getEquip().getHit() + (attacker.getSKL() * 1.5) + (attacker.getLUK() * .5);
        double defAccuracy = defender.getEquip().getHit() + (defender.getSKL() * 1.5) + (defender.getLUK() * .5);
        double atkAvoid = (attacker.getSPD() * 1.5) + (attacker.getLUK() * .5);
        double defAvoid = (defender.getSPD() * 1.5) + (defender.getLUK() * .5);
        int atkHit = (int) (atkAccuracy - defAvoid);
        int defHit = (int) (defAccuracy - atkAvoid);
        double atkCrit = attacker.inventory[0].getCrit() + attacker.getSKL() / 2;
        double defCrit = defender.inventory[0].getCrit() + defender.getSKL() / 2;
        double atkAntiCrit = attacker.getLUK();
        double defAntiCrit = defender.getLUK();
        int atkCritical = (int) (atkCrit - defAntiCrit);
        int defCritical = (int) (defCrit - atkAntiCrit);
        boolean stopSecondAtk = false;
        boolean stopSecondDef = false;
        
        //finding the damage
        int atkDamage = attacker.inventory[0].getMight() + getDamage(attacker, defender);
        int defDamage = defender.inventory[0].getMight() + getDamage(defender, attacker);
        
        //implementing weapon triangle
        if (attacker.getEquip().getType().equals("S")){
            if (defender.getEquip().getType().equals("A") || defender.getEquip().getType().equals("SA")){
                atkHit += 10;
                atkDamage += 1;
                defHit -= 10;
                defDamage -= 1;
            }
            else if (defender.getEquip().getType().equals("L")){
                atkHit -= 10;
                atkDamage -= 1;
                defHit += 10;
                defDamage += 1;
            }
        }
        else if (attacker.getEquip().getType().equals("A") || attacker.getEquip().getType().equals("SA")){
            if (defender.getEquip().getType().equals("L")){
                atkHit += 10;
                atkDamage += 1;
                defHit -= 10;
                defDamage -= 1;
            }
            else if (defender.getEquip().getType().equals("S")){
                atkHit -= 10;
                atkDamage -= 1;
                defHit += 10;
                defDamage += 1;
            }
        }
        else if (attacker.getEquip().getType().equals("L")){
            if (defender.getEquip().getType().equals("S")){
                atkHit += 10;
                atkDamage += 1;
                defHit -= 10;
                defDamage -= 1;
            }
            else if (defender.getEquip().getType().equals("A")){
                atkHit -= 10;
                atkDamage -= 1;
                defHit += 10;
                defDamage += 1;
            }
        }
        
        
        
        //doing the RNGs
        int atkHitRoll = (int)(Math.random() * 101);
        int defHitRoll = (int)(Math.random() * 101);
        int atkCritRoll = (int)(Math.random() * 101);
        int defCritRoll = (int)(Math.random() * 101);
        int secondAtkHitRoll = (int)(Math.random() * 101);
        int secondDefHitRoll = (int)(Math.random() * 101);
        int secondAtkCritRoll = (int)(Math.random() * 101);
        int secondDefCritRoll = (int)(Math.random() * 101);
        
        /*System.out.println(defHit);
        System.out.println(defHitRoll);
        System.out.println(atkDamage);
        System.out.println(defDamage);
        */
        
        //beginning calculation
        
        //======================================offensive first strike========================================//
        if (atkHitRoll < atkHit){
            if (atkCritRoll < atkCritical){
                defender.setHP(defender.getHP() - (3 * atkDamage));
                if (attacker.inventory[0].getType().equals("ST")){
                    attacker.setHP(attacker.getHP() + (3 * atkDamage) / 2);
                }
            }
            else{
                defender.setHP(defender.getHP() - atkDamage);
                if (attacker.inventory[0].getType().equals("ST")){
                    attacker.setHP(attacker.getHP() + (atkDamage / 2));
                }
            }
            attacker.inventory[0].setDur(inventory[0].getDur() - 1);
            stopSecondAtk = attacker.inventory[0].isBroken();
            //System.out.println("Successful first attack");
            //check is defender is dead
            if (attacker.getHP() > attacker.getMaxHP()){
                attacker.setHP(attacker.getMaxHP());
            }
            if (defender.getHP() > attacker.getMaxHP()){
                defender.setHP(defender.getMaxHP());
            }
            if (!defender.isAlive()){
                attacker.expGain(defender.getDrop());
                if(attacker.isLevelUp()){
                    attacker.levelUp("LEVEL UP!");
                }
                return;
            }
        }
        
        //==================================defensive first strike=======================================//
        if (!outOfRange){
            if (defHitRoll < defHit){
                if (defCritRoll < defCritical){
                    attacker.setHP(attacker.getHP() - (3 *defDamage));
                }
                else{
                    attacker.setHP(attacker.getHP() - defDamage);
                }
                defender.inventory[0].setDur(inventory[0].getDur() - 1);
                stopSecondDef = defender.inventory[0].isBroken();
                //System.out.println("Successful defensive strike");
                //check if attacker is dead
                if (attacker.getHP() > attacker.getMaxHP()){
                attacker.setHP(attacker.getMaxHP());
                }
                if (defender.getHP() > attacker.getMaxHP()){
                    defender.setHP(defender.getMaxHP());
                }
                if (!attacker.isAlive()){
                    defender.expGain(attacker.getDrop());
                    if(defender.isLevelUp()){
                        defender.levelUp("LEVEL UP!");
                    }
                    return;
                }
            }
        }
        
        //====================================offensive possible second strike==============================//
        if(!stopSecondAtk){
            if (attacker.getSPD() - 5 > defender.getSPD()){
                if (secondAtkHitRoll < atkHit){
                    if (secondAtkCritRoll < atkCritical){
                        defender.setHP(defender.getHP() - (3 * atkDamage));
                        if (attacker.inventory[0].getType().equals("ST")){
                            attacker.setHP(attacker.getHP() + (3 * atkDamage) / 2);
                        }
                    }
                    else{
                        defender.setHP(defender.getHP() - atkDamage);
                         if (attacker.inventory[0].getType().equals("ST")){
                            attacker.setHP(attacker.getHP() + (atkDamage / 2));
                        }
                    }
                    //System.out.println("Successful double");
                }
            }
        }
        else{
            attacker.swapWeapon(0,1);
            attacker.swapWeapon(1,2);
            Weapon nothing = new NoWeapon();
            attacker.setWeapon(2,nothing);
        }
        
        //check if defender is dead
        if (attacker.getHP() > attacker.getMaxHP()){
            attacker.setHP(attacker.getMaxHP());
        }
        if (defender.getHP() > attacker.getMaxHP()){
            defender.setHP(defender.getMaxHP());
        }
        if (!defender.isAlive()){
            attacker.expGain(defender.getDrop());
            if(attacker.isLevelUp()){
                attacker.levelUp("LEVEL UP!");
            }
            return;
        }
        
        //========================defensive possible second strike==========================//
        if (!outOfRange){
            if (!stopSecondDef){
                if (defender.getSPD() - 5 > attacker.getSPD()){
                    if (secondDefHitRoll < defHit){
                        if (secondDefCritRoll < defCritical){
                            defDamage *= 3;
                        }
                        attacker.setHP(attacker.getHP() - defDamage);
                    }
                }
            }
            else{
                defender.swapWeapon(0,1);
                defender.swapWeapon(1,2);
                Weapon nothing = new NoWeapon();
                defender.setWeapon(2,nothing);
            }
        
            //check if attacker is dead
            if (attacker.getHP() > attacker.getMaxHP()){
                attacker.setHP(attacker.getMaxHP());
            }
            if (defender.getHP() > attacker.getMaxHP()){
                defender.setHP(defender.getMaxHP());
            }
            if (!attacker.isAlive()){
                defender.expGain(attacker.getDrop());
                if(defender.isLevelUp()){
                    defender.levelUp("LEVEL UP!");
                }
                return;
            }
        }
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
    public int getMaxHP(){
        return this.maxHP;
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
    public int getDrop(){
        return this.drop;
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
    public void setWeapon(int spot, Weapon newWep){
        if (0 <= spot && spot <=3) {
            this.inventory[spot] = newWep;
        }
    }
    public void setSymbol(String newSymbol){
        this.symbol = newSymbol;
    }
    
    public static void main(String[] args){
        Unit mainChar = new Lord();
        Unit enemy = new EnemyLord();
        System.out.println(mainChar);
        System.out.println(enemy);
        /*mainChar.setExp(160);
        if (mainChar.isLevelUp()){
            mainChar.levelUp("YOOOOOOOO");
            System.out.println(mainChar);
        }
        */
        mainChar.attack(mainChar, enemy, false);
        System.out.println(mainChar);
        System.out.println(enemy);
    }
    
}