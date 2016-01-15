public class Tile {
    private int x_cor;
    private int y_cor;
    private boolean hasUnits;
    private int terrain;
    private String unit;
    private static final String[] TERRAIN = {"Nothing","Plain", "Forest", "Desert", "Moutain", "Fort", "River"};
    private static final String[] TERRAINPIC = {"   ", "   "," O ", " - ", " ^ ", "[_]", " ~ "};
    //0- Nonexistant (need to initalize), 1-Plain, 2-Forest, 3-Desert, 4-Moutain, 5-Fort, 6-Rivers
    
    //=======================DEFAULT CONSTRUCTORS====================
    public Tile() {
        this.x_cor = 0;
        this.y_cor = 0;
        hasUnits = false;
        terrain = 0;
        unit = "   ";
    }
    
    public Tile(int x_cor, int y_cor) {
        this.x_cor = x_cor;
        this.y_cor = y_cor;
        hasUnits = false;
        terrain = 0;
        unit = "   ";
    }
    
    public Tile(int x_cor, int y_cor, int terrain) {
        this.x_cor = x_cor;
        this.y_cor = y_cor;
        hasUnits = false;
        this.terrain = terrain;
        unit = "   ";
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
    //=========================================================
    
    //======================MUTATORS===========================
    public int setTerrain(int terrain) {
        this.terrain = terrain;
        return this.terrain;
    }
    
    public String setUnit(String newUnit) {
        String temp = unit;
        unit = newUnit;
        return temp;
    }
    //=========================================================
    
    public String getInfo() {
        String retStr = "Location: (" + x_cor + "," + y_cor + ")" + "\n" + "Terrain: " + getTerrain() + "\nExistingUnits?:" + unit;
        return retStr;
    }
    
    public String toString () {
        return TERRAINPIC[this.terrain];
    }
    
    //For testing purposes
    public static void main (String [] args) {
        Tile a = new Tile(0, 6, 5);
        System.out.println (a.getX_cor());
        System.out.println (a.getY_cor());
        System.out.println(a.getInfo());
        System.out.println(a.getHasUnits());
        System.out.println(a.getTerrain());
        System.out.println(a);
    }
}