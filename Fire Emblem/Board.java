import cs1.Keyboard;
/*=====================================
Creation of a Board
In process of turning this into a map editing software**
===========================================*/

public class Board {
    private final static int BOARD_SIZE = 8;

    private Tile[][] board;

    //default constructor intializes a DEFAULT_SIZE*DEFAULT_SIZE board
    public Board( ) {
	    board = new Tile[BOARD_SIZE][BOARD_SIZE];
    }// O (1);


    //constructor intializes an a*a board
    public Board( int a ) {
	board = new Tile[a][a];
	for (int i = 0; i < size(); i ++) {
    	    for (int p = 0; p < size(); p ++) {
    	        Tile b = new Tile (i, p, 0);
    		    board[i][p] = b;
    	    } 
        }
    }//O (1)


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


    //overwrite item at specified row and column with newVal
    //return old value
    //Need to fix set to take only Tile;
    private Tile set( int r, int c, Tile newVal ) {
	    Tile temp = board[r][c];
	    board[r][c] = newVal;
	return temp;
    }// O(1)


    //return String representation of this board
    // (make it look like a board)
    public String toString() {
        String bar = "";
        for (int counter = 0; counter < size(); counter ++) {
	    bar += "___|";}
	    String retStr = "\n";
	    for (int counter = 0; counter < size(); counter ++) {
	    retStr += "____"; }
	    retStr += "\n";
	    for (Object[] a : board) {
	        //retStr += "\n" + bar + "\n";
	        for (Object b: a) {
		        retStr += b + "|"; 
	        }
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
    
    public void crtTerrain (int a, int b, int dim_x, int dim_y, int terrain) {
        if (a + dim_x > size() || b + dim_y > size() ) {System.out.println ("Pick Different Values Pls");}
        else {
           for (int i = a; i < a + dim_x ; i ++) {
    	        for (int p = b; p < b + dim_y; p ++) {
    	            if (board[i][p].getTerrain() == "Nothing") {
    	                Tile g = new Tile (i, p, terrain);  
    	                board[i][p] = g;}
                }
            }       
        }
    }
    
    /*public void crtMountain(int a, int b, int dim_x, int dim_y) { //Creates Moutain Patches
            if (a + dim_x > size() || b + dim_y > size() ) {System.out.println ("Pick Different Values Pls");}
            else {
            for (int i = a; i < a + dim_x ; i ++) {
    	        for (int p = b; p < b + dim_y; p ++) {
    	            if (board[i][p] == null) {
    	                Tile g = new Tile (i, p, 4);  
    	                board[i][p] = g;}
            }
        }
            }
    }
    
    public void crtForest(int a, int b, int dim_x, int dim_y) { //Creates Forest Patches
            if (a + dim_x > size() || b + dim_y > size() ) {System.out.println ("Pick Different Values Pls");}
            else {
            for (int i = b; i < b + dim_y ; i ++) {
    	        for (int p = a; p < a + dim_x; p ++) {
    	            if (board[i][p] == null) {
    	                Tile g = new Tile (i, p, 2);  
    	                board[i][p] = g;}
                }
            }
        }
    }
    
    /*public void crtRivers(int a, int b, int dim_x, int dim_y, String shape) { //Creates River Patches
            if (a + dim_x > size() || b + dim_y > size() ) {System.out.println ("Pick Different Values Pls"); break;}
            if (shape == "Diagonal") {
                for (int i = a; i < a + dim_x ; i ++) {
                    if (board[i][i] == null) {
    	            Tile a = new Tile (i, i, 6);  
    	            board[i][i] = a;
                    }
                }
            }
            else {
                for (int i = b; i < b + dim_x ; i ++) {
    	            for (int p = c; p < c + dim_y; p ++) {
    	                if (board[i][p] == null) {
    	                    Tile a = new Tile (i, p, 2);  
    	                    board[i][p] = a;}
    	            }
    	        }
            }
        } 
    
    public void crtDesert(int a, int b, int dim_x, int dim_y) { //Creates Desert Patches
            if (a + dim_x > size() || b + dim_y > size() ) {System.out.println ("Pick Different Values Pls");}
            else {
            for (int i = a; i < a + dim_x ; i ++) {
    	        for (int p = b; p < b + dim_y; p ++) {
    	            if (board[i][p] == null) {
    	                Tile g = new Tile (i, p, 3);  
    	                board[i][p] = g;}
            }
        }
            }
    } */

    /*
    //swap two columns of this board 
    //(1,1) is top left corner of board
    //row values increase going down
    //column value increase L-to-R
    public void swapColumns( int c1, int c2  ) {
        for (int counter = 0; counter < board.length; counter ++) {
	    board[counter][c1] = set (counter, c2, board[counter][c1]);
	}
    }//O(n);


    //swap two rows of this board 
    //(1,1) is top left corner of board
    //row values increase going down
    //column value increase L-to-R
    public void swapRows( int r1, int r2  ) {
	Object[] temp = board[r1];
	board[r1] = board[r2];
	board[r2] = temp;
    }// O(1);
    */
    
    
    //main method for testing
    public static void main( String[] args ) { //Testing newmap creations
    Board level = new Board(20);
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