import cs1.Keyboard;
/*=====================================
Creation of a Board
In process of turning this into a map editing software**
===========================================*/

public class Board {
    private final static int BOARD_SIZE = 20;

    private Tile[][] board;
    private String name;

    //default constructor intializes a DEFAULT_SIZE*DEFAULT_SIZE board
    public Board( ) {
	    board = new Tile[BOARD_SIZE][BOARD_SIZE];
	    for (int i = 0; i < size(); i ++) {
    	    for (int p = 0; p < size(); p ++) {
    	        Tile b = new Tile (i, p, 0);
    		    board[i][p] = b;
    	    } 
        }
	    this.name = "";
    }// O ();


    //constructor intializes an a*a board
    public Board( int a ) {
	board = new Tile[a][a];
	for (int i = 0; i < size(); i ++) {
    	    for (int p = 0; p < size(); p ++) {
    	        Tile b = new Tile (i, p, 0);
    		    board[i][p] = b;
    	    } 
        }
    this.name = "";
    }//O ()
    
    public Board( int a, String name ) {
	board = new Tile[a][a];
	for (int i = 0; i < size(); i ++) {
    	    for (int p = 0; p < size(); p ++) {
    	        Tile b = new Tile (i, p, 0);
    		    board[i][p] = b;
    	    } 
        }
    this.name = name;
    }//O ()


    //return size of this board, where size is 1 dimension
    private int size() {
	    return board.length;
    }//O (1);


    //return the item at the specified row & column   
    private void get( int r, int c ) {
    	System.out.println (board[r][c]);
    }//O (1)


    //return true if this board is empty, false otherwise
    private boolean isEmpty( int r, int c ) {
	    return board[r][c] == null;
    }//O (1)

    public String toString() {
        String bar = "";
        for (int counter = 0; counter < size() + 1; counter ++) {
	    bar += "___|";}
	    String retStr = "\n";
	    retStr += "   |";
	    for (int counter = 0; counter < size(); counter ++) {
	        if (counter >= 10) {retStr += counter + " |";}
	        else {retStr += counter + "  |";}
	    }
	    retStr += "\n" + bar + "\n";
	    int counter = 0;
	    for (Tile[] a : board) {
	        retStr += counter;
	        if (counter >= 10) {retStr += " ";}
	        else {retStr += "  ";}
	        retStr += "|";
	        for (Tile b: a) {
		        retStr += b + "|"; 
	        }
	        /*
	        retStr += "\n" + "   |";
	        for (Tile b: a) {
	            retStr += b.getUnit() + "|";
	        } */
	        counter += 1;
	        retStr += "\n" + bar + "\n"; 
	    }
	    return retStr; 
    }// O(n^2);
    
    /*  public int randomize() {
        return (int)(1 + 6*Math.random());    
    } */
    
    public void populate(int T) { //Fills in the rest of the array datasets with Plains Tiles
        for (int i = 0; i < size(); i ++) {
    	    for (int p = 0; p < size(); p ++) {
    	    if (board[i][p].getTerrain() == "Nothing") {
    	        Tile a = new Tile (i, p, T);
    		    board[i][p] = a;
    	        }    
    	    } 
        }
    }
    
    //============================================================================================
    public void crtTerrain (int a, int b, int dim_x, int dim_y, int terrain, String Diagonally) {
        if (a + dim_x > size() || b + dim_y > size() ) {System.out.println ("Pick Different Values Pls"); return;}
        if (Diagonally.equals("R") || Diagonally.equals("L")) {
            crtThelperDia (a, b, dim_x, dim_y, terrain, Diagonally); //Keyboard.readBoolean() represent rightside or leftside
        }   
        else if (Diagonally.equals("N")) {
           for (int i = a; i < a + dim_x ; i ++) {
    	        for (int p = b; p < b + dim_y; p ++) {
    	            if (board[p][i].getTerrain() == "Nothing") {
    	                Tile g = new Tile (p, i, terrain);  
    	                board[p][i] = g;}
                }
            }
        }
        else {System.out.println ("Incorrect Option Selected. Nothing has been created, exiting function now"); return;}
    }
    
    
    public void crtThelperDia(int a, int b, int dim_x, int dim_y, int terrain, String Side) {
        int counter = 0;
        if (Side.equals("L")) { //Leftside
        for (int i = b; i < b + dim_y ; i ++) {
    	       for (int p = a; p < a + dim_x; p ++) {
    	                if (board[i][p + counter].getTerrain() == "Nothing") {
    	                Tile g = new Tile (i, p + counter, terrain);  
    	                board[i][p + counter] = g;
                    }
    	       }
    	       counter += 1;
            }
        }
        else {
            for (int i = b + dim_y - 1; i >= b ; i --) {
    	       for (int p = a + dim_x - 1; p >= a; p --) {
    	                if (board[i][p + counter].getTerrain() == "Nothing") {
    	                Tile g = new Tile (i, p + counter, terrain);  
    	                board[i][p + counter] = g;
                    }
    	        }
    	        counter += 1;
            }
            //System.out.println ("Diagonally Printed");
        }
    }
    
    //============================================================================================
    
    public String getName() {
        return name;
    }
    public Tile[][] getBoard(){
        return board;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setUnit(int x, int y, Unit unit){
        board[x][y].setUnit(unit);
    } 
    
    
    //main method for testing
    public static void main( String[] args ) { //Testing newmap creations
    Board level = new Board(19);
    System.out.println (level.getName());
    boolean done = false;
    Lord a = new Lord();
    //level.setUnit(0, 0, a);
    System.out.println(level);
    //System.out.println(level.board[0][0].getFighter().getx_cor());
    //System.out.println(level.board[0][0].getFighter().gety_cor());
    while (!done) {
        System.out.println ("Please select the map terrain? \n 1-Plain, 2-Forest, 3-Desert, 4-Moutain, 5-Fort, 6-Rivers");
        int t = Keyboard.readInt();
        System.out.println ("Please select an coordinate (x, y)");
        int x = Keyboard.readInt();
        int y = Keyboard.readInt();
        System.out.println ("Please select the dimensions (x,y)");
        int x_dim = Keyboard.readInt();
        int y_dim = Keyboard.readInt();
        System.out.println("Create Diagonally? L for Left, R for Right, N for No");
        String retStr = Keyboard.readString();
        level.crtTerrain(x, y, x_dim, y_dim, t, retStr);
        System.out.println ("Is your map finished?");
        String B = Keyboard.readString();
        if (B.equals("Y")) {done = true;}
        System.out.println(level);
    } 
    System.out.println("What do you choose to cover the rest of your unmapped Tiles with? \n 1-Plain, 2-Forest, 3-Desert, 4-Moutain, 5-Fort, 6-River");
    level.populate(Keyboard.readInt());
    System.out.println(level); 
    } 
    
}//end class Board