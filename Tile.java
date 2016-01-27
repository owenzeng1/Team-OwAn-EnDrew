public class Tile {
    private int x_cor;
    private int y_cor;
    private boolean hasUnits;
    private int terrain;
    private Unit fighter;
    private static final String[] TERRAIN = {"Nothing","Plain", "Forest", "Desert", "Moutain", "Fort", "River"};
    private static final String[] TERRAINPIC = {"", "","\u001B[42m", "\u001B[43m", "\u001B[41m", "\u001B[45m", "\u001B[44m"};
    //0- Nonexistant (need to initalize), 1-Plain, 2-Forest, 3-Desert, 4-Moutain, 5-Fort, 6-Rivers
    
    /*============================================================
 ANSI_RESET = "\u001B[0m";
 ANSI_BLACK = "\u001B[30m";
 ANSI_RED = "\u001B[31m";
 ANSI_GREEN = "\u001B[32m";
 ANSI_YELLOW = "\u001B[33m";
 ANSI_BLUE = "\u001B[34m";
 ANSI_PURPLE = "\u001B[35m";
 ANSI_CYAN = "\u001B[36m";
 ANSI_WHITE = "\u001B[37m";
=============================*/
    
    //=======================DEFAULT CONSTRUCTORS====================
    public Tile() {
        this.x_cor = 0;
        this.y_cor = 0;
        hasUnits = false;
        terrain = 0;
        Unit a = new BlankUnit();
        fighter = a;
    }
    
    public Tile(int x_cor, int y_cor) {
        this.x_cor = x_cor;
        this.y_cor = y_cor;
        hasUnits = false;
        terrain = 0;
        Unit a = new BlankUnit();
        fighter = a;
    }
    
    public Tile(int x_cor, int y_cor, int terrain) {
        this.x_cor = x_cor;
        this.y_cor = y_cor;
        hasUnits = false;
        this.terrain = terrain;
        Unit a = new BlankUnit();
        fighter = a;
    }
    
    //==========================================================
    
    //======================ACCESORS============================
    
    public int getX_cor() {
        return x_cor;
    }
    
    public int getY_cor() {
        return y_cor;
    } 
    
    public boolean getHasUnits() {
        return hasUnits;
    }
    public String getTerrain() {
        return TERRAIN[this.terrain];
    }
    public Unit getFighter(){
        return fighter;
    }
    
    
    /*public Unit getUnit() {
        return unit;
    } */
    //=========================================================
    
    //======================MUTATORS===========================
    public int setTerrain(int terrain) {
        this.terrain = terrain;
        return this.terrain;
    }
    
    public void setUnit(Unit unit) {
        this.hasUnits = true;
        this.fighter = unit;
        this.fighter.x_cor = this.x_cor;
        this.fighter.y_cor = this.y_cor;
        //System.out.println("Done");
    }
    
    public void setBlank() {
        Unit a = new BlankUnit();
        this.fighter = a;
        this.hasUnits = false;
    }
    //=========================================================
    
    public String getInfo() {
        String retStr = "Location: (" + x_cor + "," + y_cor + ")" + "\n" + "Terrain: " + getTerrain() + "\nExistingUnits?:"; //unit;
        return retStr;
    }
    
    public String toString () {
        return TERRAINPIC[this.terrain] + fighter + "\u001B[0m";
    }
    
    //For testing purposes
    public static void main (String [] args) {
        Tile a = new Tile(0, 6, 6);
        Lord b = new Lord();
        a.setUnit (b);
        System.out.println(a.getFighter().getArrayHolder());
       // System.out.println (a.fighter.getx_cor());
        //System.out.println (a.getX_cor());
        //System.out.println (a.getY_cor());
        //System.out.println(a.getInfo());
        System.out.println(a.getHasUnits());
        System.out.println(a.getTerrain());
        System.out.println(a);
    }
}