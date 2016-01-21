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

    //return String representation of this board
    // (make it look like a board)
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
	        retStr += "\n" + "   |";
	        for (Tile b: a) {
	            retStr += b.getUnit() + "|";
	        }
	        counter += 1;
	        retStr += "\n" + bar + "\n";
	    }
	    return retStr; 
    }// O(n^2);
    
    /*  public int randomize() {
        return (int)(1 + 6*Math.random());    
    } */
    
    public void populate() { //Fills in the rest of the array datasets with Plains Tiles
        for (int i = 0; i < size(); i ++) {
    	    for (int p = 0; p < size(); p ++) {
    	    if (board[i][p].getTerrain() == "Nothing") {
    	        Tile a = new Tile (i, p, 1);
    		    board[i][p] = a;
    	        }    
    	    } 
        }
    }
    
    //============================================================================================
    public void crtTerrain (int a, int b, int dim_x, int dim_y, int terrain) {
        if (a + dim_x > size()-1 || b + dim_y > size()-1 ) {System.out.println ("Pick Different Values Pls");}
        System.out.println("Create Diagonally? True for Yes, False for No");
        Boolean retBol = Keyboard.readBoolean();
        if (retBol == true) {
            int counter = 0;
            System.out.println ("Leftside or Rightside?");
            crtThelperDia (a, b, dim_x, dim_y, terrain, Keyboard.readBoolean()); //Keyboard.readBoolean() represent rightside or leftside
        }   
        else if (retBol == false) {
           for (int i = a; i < a + dim_x ; i ++) {
    	        for (int p = b; p < b + dim_y; p ++) {
    	            if (board[p][i].getTerrain() == "Nothing") {
    	                Tile g = new Tile (p, i, terrain);  
    	                board[p][i] = g;}
                }
            }
        }
        else {System.out.println ("Incorrect Option Selected. Nothing has been created, exiting function now");}
    }
    
    
    public void crtThelperDia(int a, int b, int dim_x, int dim_y, int terrain, boolean Side) {
        int counter = 0;
        if (Side == true) { //Leftside
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
            System.out.println ("Diagonally Printed");
        }
    }
    
    //============================================================================================
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void attack(int atkerXCor, int atkerYCor, int deferXCor, int deferYCor){
        //Isn't this already a Character Function? 
    }
    
    
    //main method for testing
    public static void main( String[] args ) { //Testing newmap creations
    Board level = new Board(20, "Bob");
    System.out.println (level.getName());
    System.out.println (level);
    boolean done = false;
    System.out.println(level);
    while (!done) {
        System.out.println ("Please select the map terrain? \n 1-Plain, 2-Forest, 3-Desert, 4-Moutain, 5-Fort, 6-Rivers");
        int t = Keyboard.readInt();
        System.out.println ("Please select an coordinate (x, y)");
        int x = Keyboard.readInt();
        int y = Keyboard.readInt();
        System.out.println ("Please select the dimensions (x,y)");
        int x_dim = Keyboard.readInt();
        int y_dim = Keyboard.readInt();
        level.crtTerrain(x, y, x_dim, y_dim, t);
        System.out.println ("Is your map finished?");
        Boolean B = Keyboard.readBoolean();
        if (B) {done = true;}
        System.out.println(level);
    }
    level.populate();
    System.out.println(level); 
    } 
    
}//end class Board