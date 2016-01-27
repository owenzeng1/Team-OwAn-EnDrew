import cs1.Keyboard;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.lang.Math;


//In the process of allowing user to choose maps. 
public class FireEmblem{
    private int level = 0;
    //Space alloted for Maps. Board a and b and maps that are pregenerated. Board c and d are space alloted for new map creation 
    private Board a = new Board(19, "Montaine");
    private Board e = new Board(19, "Spotty Forts");
    private Board f = new Board(19, "Green, Green, Grass");
    private Board g = new Board(19, "Lakeside");
    private Board i = new Board(19, "???");
    //====NEXT TWO BOARDS ARE RESERVED FOR USERS OWN CREATION
    private Board c = new Board(19);
    private Board d = new Board(19);
    //=======================================================
    private final String[] MAP = {a.getName(), e.getName(), c.getName(), d.getName(), f.getName()};
    
    //Creates Default Boards a and b;
    FireEmblem() {
        crt("Montaine");
        crt("Spotty Forts");
        crt("Green, Green, Grass");
        crt("Lakeside");
        crt("???");
        //crt(name);
        
    }
    public int checkLevel(){
        return level;
    }
    //Before game selection, <something main game runner>() will print the name of all the boards which are noted in Array MAP. then, the function will run crt(name) to load the
    //appropriate map. When creating a map (also another function allocated in this class and <main game runner>, the user will first have to save the map name. Before
    //Having the option the create the map. 
    //While board a and b will always be loaded when FireEmblem is run, all data created in board C and D will be lost after a game of FireEmblem is closed.
    public void crt(String name) {
        if (name == a.getName()) {
            //level.crtTerrain(x, y, x_dim, y_dim, t, retStr);
            //Mountain Creation
            a.crtTerrain(10, 2, 2, 3, 4, "R");
            a.crtTerrain(14, 2, 3, 2, 4, "L");
            a.crtTerrain(6, 5, 3, 2, 4, "L");
            a.crtTerrain(0, 5, 3, 1, 4, "N");
            //River Creation
            a.crtTerrain(3, 0, 1, 7, 6, "N");
            a.crtTerrain(4, 6, 1, 4, 6, "N");
            a.crtTerrain(5, 9, 2, 8, 6, "L");
            //Desert Creation
            a.crtTerrain(15, 8, 4, 4, 3, "N");
            //Forest Creation
            a.crtTerrain(1, 1, 2, 2, 2, "N");
            a.crtTerrain(2, 10, 2, 2, 2, "N");
            a.crtTerrain(3, 13, 2, 2, 2, "N");
            //Fort Creation
            a.crtTerrain(9, 7, 1, 1, 5, "N");
            a.crtTerrain(9, 14, 1, 1, 5, "N");
            a.crtTerrain(15, 14, 1, 1, 5, "N");
            a.crtTerrain(15, 7, 1, 1, 5, "N");
            a.crtTerrain(5, 14, 1, 1, 5, "N");
            a.crtTerrain(5, 7, 1, 1, 5, "N");
            //Fill in with Plains
            a.populate(1);
            //a.crtTerrain Blah Blah Blah
        }
        
        else if (name == e.getName()) {
            //16	9	4	15	0	12	15	12	16	17
            //12	1	10	10	7	6	18	13	18	9
            //Fort Creation
            e.crtTerrain(16, 12, 1, 1, 5, "N");
            e.crtTerrain(9, 1, 1, 1, 5, "N");
            e.crtTerrain(4, 10, 1, 1, 5, "N");
            e.crtTerrain(15, 10, 1, 1, 5, "N");
            e.crtTerrain(0, 7, 1, 1, 5, "N");
            e.crtTerrain(12, 6, 1, 1, 5, "N");
            e.crtTerrain(15, 18, 1, 1, 5, "N");
            e.crtTerrain(16, 18, 1, 1, 5, "N");
            e.crtTerrain(17, 9, 1, 1, 5, "N");
            e.crtTerrain(16, 18, 1, 1, 5, "N");
            //Populating Desert
            e.populate(3);
            //b.crtTerrain Blah Blah
        }
        
        else if (name == c.getName()) {
            
        }
        
        else if (name == d.getName()) {
            
        }
        
        else if (name == i.getName()) {
        //River Creation
        i.crtTerrain(9, 0, 1, 2, 6, "N");
        i.crtTerrain(8, 1, 1, 4, 6, "N");
        i.crtTerrain(7, 4, 1, 4, 6, "N");
        i.crtTerrain(7, 8, 1, 3, 6, "L");
        i.crtTerrain(9, 11, 1, 4, 6, "N");
        i.crtTerrain(8, 14, 1, 4, 6, "N");
        i.crtTerrain(7, 17, 1, 2, 6, "N");
        //Fort Creation
        i.crtTerrain(3, 12, 1, 1, 5, "N");
        i.crtTerrain(9, 1, 1, 1, 5, "N");
        i.crtTerrain(4, 11, 1, 1, 5, "N");
        i.crtTerrain(15, 9, 1, 1, 5, "N");
        i.crtTerrain(6, 7, 1, 1, 5, "N");
        i.crtTerrain(12, 6, 1, 1, 5, "N");
        i.crtTerrain(14, 18, 1, 1, 5, "N");
        i.crtTerrain(16, 2, 1, 1, 5, "N");
        i.crtTerrain(2, 5, 1, 1, 5, "N");
        i.crtTerrain(10, 3, 1, 1, 5, "N");
        //Populate
        i.populate(1);
        }
        
        else if (name == f.getName()) {
        //Forest Creation
        f.crtTerrain(0, 0, 6, 5, 2, "N");
        f.crtTerrain(0, 10, 6, 6, 2, "N");
        f.crtTerrain(2, 6, 2, 3, 2, "N");
        f.crtTerrain(13, 0, 6, 5, 2, "N");
        f.crtTerrain(15, 6, 2, 3, 2, "N");
        f.crtTerrain(13, 10, 6, 6, 2, "N");
        //Fort Creation
        f.crtTerrain(2, 17, 2, 1, 5, "N");
        f.crtTerrain(15, 17, 2, 1, 5, "N");
        //River Creation
        f.crtTerrain(9, 0, 1, 2, 6, "N");
        f.crtTerrain(8, 1, 1, 4, 6, "N");
        f.crtTerrain(7, 4, 1, 4, 6, "N");
        f.crtTerrain(7, 8, 1, 3, 6, "L");
        f.crtTerrain(9, 11, 1, 4, 6, "N");
        f.crtTerrain(8, 14, 1, 4, 6, "N");
        f.crtTerrain(7, 17, 1, 2, 6, "N");
        //Population Plains
        f.populate(1);
        }
        
        else if (name == g.getName()) {
            //Mountain Creation
            g.crtTerrain(0, 2, 2, 4, 4, "R");
            g.crtTerrain(6, 3, 2, 4, 4, "L");
            g.crtTerrain(3, 7, 2, 7, 4, "L");
            g.crtTerrain(2, 10, 2, 5, 4, "N");
            g.crtTerrain(5, 5, 1, 3, 4, "N");
            g.crtTerrain(0, 17, 2, 1, 4, "N");
            g.crtTerrain(3, 17, 2, 1, 4, "N");
            g.crtTerrain(6, 17, 2, 1, 4, "N");
            g.crtTerrain(9, 17, 2, 1, 4, "N");
            g.crtTerrain(10, 18, 1, 1, 4, "N");
            g.crtTerrain(8, 8, 1, 1, 4, "N");
            g.crtTerrain(15, 8, 2, 2, 4, "N");
            //Plains Creation
            g.crtTerrain(14, 7, 4, 4, 1, "N");
            //River Creation 
            g.crtTerrain(11, 0, 8, 19, 6, "N");
            g.crtTerrain(10, 1, 1, 3, 6, "N");
            g.crtTerrain(9, 1, 1, 2, 6, "N");
            g.crtTerrain(6, 8, 5, 2, 6, "N");
            g.crtTerrain(10, 10, 1, 2, 6, "N");
            g.crtTerrain(9, 15, 2, 1, 6, "N");
            //Populate Plains
            g.populate(1);
            }
        else {
            System.out.println ("Map does not exist");
        }
    }
    
    public int Empty() {
        for (int j = 0; j < MAP.length; j ++) {
            if (MAP[j] == "") {return j;}
        }
        return -1;
    }
    
    public int indexOf (String[] a, String s) {
        int i = 0;
        for (String b: a) {
            if (b == s) {return i;}
            i ++;
        }
        return -1;
    }
    
    public void crtMap(Board m, String name) {
        m.setName(name);
        boolean done = false;
        System.out.println(m);
        while (!done) {
            System.out.println ("Please select the map terrain? \n 0-Nothing 1-Plain, 2-Forest, 3-Desert, 4-Moutain, 5-Fort, 6-Rivers");
            int t = Keyboard.readInt();
            System.out.println ("Please select an coordinate (x,y)");
            int x = Keyboard.readInt();
            int y = Keyboard.readInt();
            System.out.println ("Please select the dimensions (x,y)");
            int x_dim = Keyboard.readInt();
            int y_dim = Keyboard.readInt();
            //Board <board_name>.crtTerrain();
            System.out.println("Create Diagonally? L for Left, R for Right, N for No");
            String retStr = Keyboard.readString();
            m.crtTerrain(x, y, x_dim, y_dim, t, retStr);
            System.out.println(m);
            System.out.println ("Is your map finished?");
            String B = Keyboard.readString();
            if (B.equals("Y")) {done = true;}
            System.out.println(m); 
        }
        System.out.println("What do you choose to cover the rest of your unmapped tiles with? \n 1-Plain, 2-Forest, 3-Desert, 4-Moutain, 5-Fort, 6-River");
        int i = Keyboard.readInt();
        if (i == 0) {m.populate(1); System.out.println ("Bad Option. Making all tiles Plains");} //Default
        else {m.populate(Keyboard.readInt());} 
        System.out.println(m); 
    } 
    
    //=============================================================================================
    
    public int characterSelection (String chac) {
        if (chac.equals("Ashaman")) {return 0;}
        else if (chac.equals("Favianna")) {return 5;}
        else if (chac.equals("Julius")) {return 1;}
        else if (chac.equals("Lord") ){return 2;}
        else if (chac.equals("Lucien")) {return 3;}
        else if (chac.equals("Paige") ){return 4;}
        else if (chac.equals("William")) {return 6;}
        else if (chac.equals("EnemyArcher")) {return 7;}
        else if (chac.equals("EnemyCavalier")) {return 8;}
        else if (chac.equals("EnemyKnight")) {return 9;}
        else if (chac.equals("EnemyLord")) {return 10;}
        else if (chac.equals("EnemyMage")) {return 11;}
        else if (chac.equals("EnemyMyrmidon")) {return 12;}
        else {return -1;}
    }
    
    public void move (Board level, int chac) {
        //if (chac == -1) {System.out.println ("Error"); Move this outside
        int old_xcor = level.getX_cor(chac);
        int old_ycor = level.getY_cor(chac);
        System.out.println (old_xcor);
        System.out.println (old_ycor);
        System.out.println("Please indicate the x and y coordinates you wish to move to.");
        int new_xcor = Keyboard.readInt();
        int new_ycor = Keyboard.readInt();
        while (new_xcor < 0|| new_xcor > 18 || new_ycor < 0 || new_ycor > 18){
            System.out.println("The coordinates you have specified are an invalid option.");
            new_xcor = Keyboard.readInt();
            new_ycor = Keyboard.readInt();
            }
        while (level.getTile(new_xcor, new_ycor).getHasUnits()){
            System.out.println("There is already a unit on this tile.");
            new_xcor = Keyboard.readInt();
            new_ycor = Keyboard.readInt();
            }
        while (Math.abs(new_xcor - old_xcor) + Math.abs(new_ycor - old_ycor) > level.getTile(old_xcor, old_ycor).getFighter().getMaxMove()) 
            {System.out.println("This is out of your units range.");
            new_xcor = Keyboard.readInt();
            new_ycor = Keyboard.readInt();}
        level.setUnit(new_xcor, new_ycor, level.getTile(old_xcor, old_ycor).getFighter());
    }
    
    public void move (Board level, int chac, int new_x, int new_y) {
        //if (chac == -1) {System.out.println ("Error"); Move this outside
        int old_xcor = level.getX_cor(chac);
        int old_ycor = level.getY_cor(chac);
        level.setUnit(old_xcor + new_x, old_ycor + new_y, level.getTile(old_xcor, old_ycor).getFighter());
    }

    
    public void check(String tileUnitWeapon, Board level){
        int check_xcor = 19;
        int check_ycor = 19;
        while (check_xcor < 0 || check_ycor < 0 || check_xcor > 18 || check_ycor > 18){
            System.out.println("What is the row you would like to check?");
            check_xcor = Keyboard.readInt();
            System.out.println("What is the column you would like to check?");
            check_ycor = Keyboard.readInt();
        }
        if (tileUnitWeapon.equals("T")){
            System.out.println(level.getBoard()[check_xcor][check_ycor]);
            readingBreak();
        }
        else if (tileUnitWeapon.equals("U")){
            System.out.println(level.getBoard()[check_xcor][check_ycor].getFighter());
            readingBreak();
        }
        else{
            System.out.println(level.getBoard()[check_xcor][check_ycor].getFighter().getWeapon(0));
            readingBreak();
        }
    }
    
    
    public void equip(Unit unit) {
        int inventorySlot = 0;
        System.out.println("Which weapon would you like to equip?");
        System.out.println("\nEquipped: " + unit.getWeapon(0).getName() + "\n.1. " + unit.getWeapon(1).getName() + "\n2. " + unit.getWeapon(2).getName());
        inventorySlot = Keyboard.readInt();
        while (inventorySlot < -1 || inventorySlot > 2 ||unit.getWeapon(inventorySlot).getName().equals("Nothing")) {
            System.out.println ("Weapon does not exist");
            inventorySlot = Keyboard.readInt();
        }
        unit.swapWeapon(0, inventorySlot);
        System.out.println(unit.getWeapon(0).getName());
    }
    
    //==========================================================
    public void turnHelper(Board level, int playerMove) {
    if (playerMove == 0){
    int intendedMove = 0;
	System.out.println("What would you like " + "Oliver" + " (L) to do?");
	System.out.println("1. Move\n2. Attack\n3. Equip\n4. Check\n5. Wait");
	while (intendedMove < 1 || intendedMove > 5){
	    intendedMove = Keyboard.readInt();
	}
	if (intendedMove == 1){
	    move(level, characterSelection("Lord"));
	    System.out.println(level);
	    playerMove += 1; }
                            
	if (intendedMove == 2){
	    attack (level, characterSelection("Lord"));
	    playerMove += 1;
	}
                        
	if (intendedMove == 3){
	    int x = level.getX_cor(characterSelection("Lord"));
	    int y = level.getY_cor(characterSelection("Lord"));
	    equip(level.getTile(x, y).getFighter());
	    playerMove += 1;
	}
                        
	if (intendedMove == 4){
	    String checkInput = Keyboard.readString().toUpperCase();
	    while (!checkInput.equals("T") && !checkInput.equals("U") && !checkInput.equals("W")){
		System.out.println("Would you like to examine a (T)ile, (U)nit, or the (W)eapon the unit is carrying?");
		checkInput = Keyboard.readString().toUpperCase();
	    }
	    check(checkInput,level);
	}
	if (intendedMove == 5){
	}
	if (intendedMove > 5 || intendedMove < 1) {System.out.println("Please Pick a different Option");}
    }
    //===================================================================================
    if (playerMove == 1){
    int intendedMove = 0;
	System.out.println("What would you like " + "Faivanna" + " (C) to do?");
	System.out.println("1. Move\n2. Attack\n3. Equip\n4. Check\n5. Wait");
	while (intendedMove < 1 || intendedMove > 5){
	    intendedMove = Keyboard.readInt();
	}
	if (intendedMove == 1){
	    move(level, characterSelection("Favianna"));
	    System.out.println(level);
	    playerMove += 1; }
                            
	if (intendedMove == 2){
	    attack (level, characterSelection("Favianna"));
	    playerMove += 1;
	}
                        
	if (intendedMove == 3){
	    int x = level.getX_cor(characterSelection("Favianna"));
	    int y = level.getY_cor(characterSelection("Favianna"));
	    equip(level.getTile(x, y).getFighter());
	    playerMove += 1;
	}
                        
	if (intendedMove == 4){
	    String checkInput = Keyboard.readString().toUpperCase();
	    while (!checkInput.equals("T") && !checkInput.equals("U") && !checkInput.equals("W")){
		System.out.println("Would you like to examine a (T)ile, (U)nit, or the (W)eapon the unit is carrying?");
		checkInput = Keyboard.readString().toUpperCase();
	    }
	    check(checkInput,level);
	}
	if (intendedMove == 5){
	}
	if (intendedMove > 5 || intendedMove < 1) {System.out.println("Please Pick a different Option");}
    }
    //======================================================================================
    if (playerMove == 2){
    int intendedMove = 0;
	System.out.println("What would you like " + "Paige" + " (K) to do?");
	System.out.println("1. Move\n2. Attack\n3. Equip\n4. Check\n5. Wait");
	while (intendedMove < 1 || intendedMove > 5){
	    intendedMove = Keyboard.readInt();
	}
	if (intendedMove == 1){
	    move(level, characterSelection("Paige"));
	    System.out.println(level);
	    playerMove += 1; }
                            
	if (intendedMove == 2){
	    attack (level, characterSelection("Paige"));
	    playerMove += 1;
	}
                        
	if (intendedMove == 3){
	    int x = level.getX_cor(characterSelection("Paige"));
	    int y = level.getY_cor(characterSelection("Paige"));
	    equip(level.getTile(x, y).getFighter());
	    playerMove += 1;
	}
                        
	if (intendedMove == 4){
	    String checkInput = Keyboard.readString().toUpperCase();
	    while (!checkInput.equals("T") && !checkInput.equals("U") && !checkInput.equals("W")){
		System.out.println("Would you like to examine a (T)ile, (U)nit, or the (W)eapon the unit is carrying?");
		checkInput = Keyboard.readString().toUpperCase();
	    }
	    check(checkInput,level);
	}
	if (intendedMove == 5){
	}
	if (intendedMove > 5 || intendedMove < 1) {System.out.println("Please Pick a different Option");}
    }
    //=======================================================================================
    if (playerMove == 3){
    int intendedMove = 0;
	System.out.println("What would you like " + "Lucien" + " (S) to do?");
	System.out.println("1. Move\n2. Attack\n3. Equip\n4. Check\n5. Wait");
	while (intendedMove < 1 || intendedMove > 5){
	    intendedMove = Keyboard.readInt();
	}
	if (intendedMove == 1){
	    move(level, characterSelection("Lucien"));
	    System.out.println(level);
	    playerMove += 1; }
                            
	if (intendedMove == 2){
	    attack (level, characterSelection("Lucien"));
	    playerMove += 1;
	}
                        
	if (intendedMove == 3){
	    int x = level.getX_cor(characterSelection("Lucien"));
	    int y = level.getY_cor(characterSelection("Lucien"));
	    equip(level.getTile(x, y).getFighter());
	    playerMove += 1;
	}
                        
	if (intendedMove == 4){
	    String checkInput = Keyboard.readString().toUpperCase();
	    while (!checkInput.equals("T") && !checkInput.equals("U") && !checkInput.equals("W")){
		System.out.println("Would you like to examine a (T)ile, (U)nit, or the (W)eapon the unit is carrying?");
		checkInput = Keyboard.readString().toUpperCase();
	    }
	    check(checkInput,level);
	}
	if (intendedMove == 5){
	}
	if (intendedMove > 5 || intendedMove < 1) {System.out.println("Please Pick a different Option");}
    }
        
}
    public void enemyturn(Board level, int playerMove) { 
        if (playerMove == 0) {
            int random = (int)(Math.random()*4);
            if (random == 0) {
                move(level, characterSelection("EnemyLord"), 0, 1); }
            else if (random == 1) {
                move(level, characterSelection("EnemyLord"), -1, 0); }
            else if (random == 2) {
                move(level, characterSelection("EnemyLord"), 1, 0); }
            else if (random == 3) {
                move(level, characterSelection("EnemyLord"), 0, -1); }
            playerMove += 1; 
        }
        if (playerMove == 1) {
            int random = (int)(Math.random()*4);
            if (random == 0) {
                move(level, characterSelection("EnemyCavalier"), 0, 1); }
            else if (random == 1) {
                move(level, characterSelection("EnemyCavalier"), -1, 0); }
            else if (random == 2) {
                move(level, characterSelection("EnemyCavalier"), 1, 0); }
            else if (random == 3) {
                move(level, characterSelection("EnemyCavalier"), 0, -1); }
            playerMove += 1; 
        }
        if (playerMove == 2) {
            int random = (int)(Math.random()*4);
            if (random == 0) {
                move(level, characterSelection("EnemyKnight"), 0, 1); }
            else if (random == 1) {
                move(level, characterSelection("EnemyKnight"), -1, 0); }
            else if (random == 2) {
                move(level, characterSelection("EnemyKnight"), 1, 0); }
            else if (random == 3) {
                move(level, characterSelection("EnemyKnight"), 0, -1); }
            playerMove += 1; 
        }
        if (playerMove == 3) {
            int random = (int)(Math.random()*4);
            if (random == 0) {
                move(level, characterSelection("EnemyMyrmidon"), 0, 1); }
            else if (random == 1) {
                move(level, characterSelection("EnemyMyrmidon"), -1, 0); }
            else if (random == 2) {
                move(level, characterSelection("EnemyMyrmidon"), 1, 0); }
            else if (random == 3) {
                move(level, characterSelection("EnemyMyrmidon"), 0, -1); }
            playerMove += 1; 
        }
    }
    
    public void attack(Board level, int chac) {
        Unit temp = new BlankUnit();
        int old_xcor = level.getX_cor(chac);
        int old_ycor = level.getY_cor(chac);
        System.out.println (old_xcor);
        System.out.println (old_ycor);
        System.out.println("Please indicate the x and y coordinates of the unit you want to attack");
        int new_xcor = Keyboard.readInt();
        int new_ycor = Keyboard.readInt();
        while (new_xcor < 0|| new_xcor > 18 || new_ycor < 0 || new_ycor > 18){
            System.out.println("The coordinates you have specified are an invalid option.");
            new_xcor = Keyboard.readInt();
            new_ycor = Keyboard.readInt();
            }
        while (level.getTile(new_xcor, new_ycor).getHasUnits() == false) {
            System.out.println("No unit exist");
            return;
        }
        while (Math.abs(new_xcor - old_xcor) + Math.abs(new_ycor - old_ycor) > level.getTile(old_xcor, old_ycor).getFighter().getMaxMove()) 
            {System.out.println("This is out of your units range.");
            new_xcor = Keyboard.readInt();
            new_ycor = Keyboard.readInt();}
        System.out.println(level.getTile(old_xcor, old_ycor).getFighter().getInfo());
        System.out.println(level.getTile(new_xcor, new_ycor).getFighter().getInfo());
        level.getTile(old_xcor, old_ycor).getFighter().attack(level.getTile(new_xcor, new_ycor).getFighter(), false);
        System.out.println(level.getTile(old_xcor, old_ycor).getFighter().getInfo());
        System.out.println(level.getTile(new_xcor, new_ycor).getFighter().getInfo());
        if (level.getTile(new_xcor, new_ycor).getFighter().getHP() <= 0) 
            {level.getTile(new_xcor, new_ycor).setBlank();
            System.out.println("Enemy is dead");} 
        if (level.getTile(old_xcor, old_ycor).getFighter().getHP() <= 0)
            {level.getTile(old_xcor, old_ycor).setBlank();
            System.out.println("You are dead");} 
    }
    
    //==============================================================================================================
    public void play(){
        int playerMove = 0;
        int intendedMove = 0;
        int attack_xcor = -1;
        int attack_ycor = -1;
        String lordsName = "Oliver";
        String progress = "";
        boolean enemiesAlive = true;
        Unit defender = new BlankUnit();
        Unit lord = new Lord();
        Unit cavalier = new Favianna();
        Unit knight = new Paige();
        Unit mage = new Ashaman();
        Unit archer = new William();
        Unit healer = new Julius();
        Unit myrmidon = new Lucien();
        Unit blank = new BlankUnit();
        
        Unit enemyLord = new EnemyLord();
        Unit enemyCavalier = new EnemyCavalier();
        Unit enemyKnight = new EnemyKnight();
        Unit enemyMage = new EnemyMage();
        Unit enemyArcher = new EnemyArcher();
        Unit enemyMyrmidon = new EnemyMyrmidon();
        while (level < 4){
            
            //==========================LEVEL 1=========================================//
            if (level == 0){
                System.out.println("F(C): Greetings, I am called Favianna (C) of the Royal Sheperds.");
                System.out.println("F(C): I was informed that your second-in-command recently fell in the line of battle.");
                System.out.println("F(C): Your father has appointed me to serve you as a replacement.");
                boolean nameConfirm = false;
                while (!nameConfirm){
                    System.out.println("\nF(C): Young Lord, what shall I call you? (Enter your name)");
                    lordsName = Keyboard.readString();
                    while (lordsName.equals("") || lordsName.length() > 9){
                        System.out.println("F(C): Excuse my poor hearing. May I ask that you repeat your name? (Too many characters)");
                        lordsName = Keyboard.readString();
                    }
                    System.out.println("F(C): " + lordsName + ", what a wonderful name. That is your name right? (Confirm Y/N)");
                    String input = Keyboard.readString();
                    while (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N")){
                        System.out.println("F(C): I don't quite understand. Is that a (y)es or a (n)o?");
                        input = Keyboard.readString();
                    }
                    nameConfirm = input.equalsIgnoreCase("Y");
                }
                lord.setName(lordsName);
                //System.out.println(lord);
                readingBreak();
                System.out.println("\n/========ONE WEEK LATER========/");
                System.out.println("P(K): Paige (K) reporting in, Lord " + lordsName + ".");
                System.out.println("P(K): Sire, there have been reports of a band of theives residing in the mountains.");
                System.out.println("P(K): Our band of shepherds has been ordered by your father to deal with them.");
                readingBreak();
                System.out.println("\nF(C): Paige forgot to mention, but these mountains are near the village of Easthallow.");
                System.out.println("F(C): It's nice to be on a mission so soon. A perfect chance to demonstrate my strength.");
                readingBreak();
                System.out.println("\nL(S): Bless me, God. Your son Lucien (S) needs your protection.");
                while (progress.equals("")){
                    System.out.println("Begin? (Enter anything to start battle)");
                    progress = Keyboard.readString();
                }
                progress = "";
                Board levelOne = a;
                levelOne.setUnit(16, 2, lord);
                levelOne.setUnit(17, 2, knight);
                levelOne.setUnit(16, 1, cavalier);
                levelOne.setUnit(18, 2, myrmidon);
                levelOne.setUnit(6 , 11, enemyCavalier);
                levelOne.setUnit(16, 3, enemyMyrmidon);
                levelOne.setUnit(6, 13, enemyKnight);
                levelOne.setUnit(7, 12,enemyLord);
                System.out.println(levelOne);
                System.out.println("Asha'man (M), Julius (H), and William (A) are on a 2-week mission.");
                System.out.println("They are exploring the Thick Woods and will be back 3 days later.");
                while (lord.isAlive() && enemiesAlive) {
                    while (playerMove < 4){
                        turnHelper(levelOne, playerMove);
                        enemyturn(levelOne, playerMove);
                        System.out.println(levelOne);
                        //System.out.println(playerMove);
                }
                enemiesAlive = enemyLord.isAlive() || enemyMyrmidon.isAlive() || enemyKnight.isAlive() || enemyCavalier.isAlive();
                playerMove = 0;
                }
                //level += 1;
            }
            
            
            //==========================LEVEL 2=========================================//
            if (level == 1){
                System.out.println("\n/======3 DAYS LATER======/");
                System.out.println("William (A) and Julius(H) have returned from their mission without Asha'man(M).");
                System.out.println("W(A): William (A) reporting in. " + lordsName + " we have lost Asha'man.");
                System.out.println("J(H): Don't say it like that, the rest of the Shepherds will misunderstand.");
                System.out.println("W(A): Excuse me, a group of bandits in the Thick Woods have captured him and is demanding ransom.");
                readingBreak();
                System.out.println("\nP(K): Lord " + lordsName + " it'll take us a day's travel to get through the Aragoth Deserts.");
                System.out.println("L(S): No use thinking about it. We can't lose another Shepherd. Let's move, sire.");
                System.out.println("L(S): Your orders, Lord " + lordsName + "? (Ride? Y/N)");
                
                progress = Keyboard.readString();
                while (!progress.equalsIgnoreCase("Y")){
                    while (!progress.equalsIgnoreCase("Y") && !progress.equalsIgnoreCase("N")){
                        System.out.println("\nP(K): Spare us of the jokes, my sire. Your orders? (Y)es or (N)o?");
                        progress = Keyboard.readString();
                    }
                    if(progress.equalsIgnoreCase("N")){
                        System.out.println("\nL(S): You would have us leave Asha'man for dead?");
                        System.out.println("L(S): Even after the promise we made after HIS death?");
                        System.out.println("L(S): That would be a disgrace to your last Liutenant.");
                        System.out.println("Reconsider your orders, is it a (Y)es or a (N)o?");
                        progress = Keyboard.readString();
                    }
                }
            }
                progress = "";
                System.out.println("\nJ(H): William and I will restock on our weapons from the barracks.");
                System.out.println("F(C): I'll ride on ahead to scout out the situation.");
                readingBreak();
                System.out.println("\nL(S): Bless me, God. Your son Lucien (S) needs your protection.");
                readingBreak();
                Board levelTwo = e;
                System.out.println(e);
                System.out.println("\nAsha'man (M) is being held hostage and Favianna (C) has ridden ahead.");
                System.out.println("Favianna will rendevous with the Shepherds at the Thick Woods.");
                while (progress.equals("")){
                    System.out.println("Begin? (Enter anything to start battle)");
                    progress = Keyboard.readString();
                }
                progress = "";
                System.out.println("\nYou and your Shepherds begin your trek through the Aragoth Deserts.");
                System.out.println("Suddenly, you come across the Hylian army. The do not recognize you, the prince.");
                System.out.println("The provisions you carry with you display the Hylian mark of royalty and they suspect either thievery or fraud");
                /*while (lord.isAlive() && enemiesAlive){
                    
                }
                */
            
            //==================================LEVEL 3=============================//
            if (level == 2){
                System.out.println("\n/======1 DAY LATER======/");
                System.out.println("\nThe Shepherds have made it past the Aragoth Deserts and have met up with Favianna.");
                System.out.println("F(C): I have met with the thieves. They save my royal crest and upped the ransom amount.");
                System.out.println("F(C): They now demand we give them 60,000 gold for Asha'man.");
                readingBreak();
                System.out.println("\nJ(H): And if we don't have that much gold? What happens?");
                System.out.println("L(S): They kill him I presume.");
                System.out.println("F(C): Yep");
                readingBreak();
                System.out.println("\nF(C): They only keep one guard on Asha'man at a time though.");
                System.out.println("W(A): Well then there's only one other option.");
                System.out.println("W(A): I'll take care of that one guy and everyone else can charge.");
                readingBreak();
                System.out.println("\nP(K): Sounds good to me.");
                readingBreak();
                System.out.println("\nL(S): Bless me, God. Your son Lucien (S) needs your protection.");
                while (progress.equals("")){
                    System.out.println("Begin? (Enter anything to start battle)");
                    progress = Keyboard.readString();
                }
                //Board levelThree = f;
                System.out.println("William (A) needs to be elsewhere with his bow to take care of Asha'man's guard.");
                System.out.println("The rest of the Shepherds have decided to crash straight through the front gates....trees");
                /*while (lord.isAlive() && enemiesAlive){
                    
                }
                */
            }
            
            //==================================LEVEL 4=============================//
            if(level == 3){
                System.out.println("\n/======AFTER THE DEFEAT OF THE THICK WOODS BANDITS======/");
                System.out.println("\nA(M): Ash'man's the name. Are you the new second-in-command?");
                System.out.println("W(A): Yeah her name's Favianna. Anyway, it's nice to have you back pal.");
                System.out.println("F(C): Sire. I have failed you.");
                readingBreak();
                System.out.println("\nJ(H): Speak no more. I already see it on your neck.");
                System.out.println("J(H): The blue and red mark of the Mage's Gilliflower.");
                System.out.println("P(K): Mage's Gilliflower? What's that?");
                readingBreak();
                System.out.println("\nA(M): A very deadly flower infamous amongst mages. That much I know.");
                System.out.println("A(M): According to legend, it opens a magical gash of blue and red color.");
                System.out.println("J(H): The gash is unsealable by human means. And it lets out all of its victim's life energy");
                readingBreak();
                System.out.println("\nP(K): We have to do something.");
                System.out.println("L(S): We can't. Not without the help of a witch doctor.");
                System.out.println("W(A): Weren't witch doctor's banned after the incident of 5XX");
                readingBreak();
                System.out.println("\nL(S): They were.");
                System.out.println("A(M): That didn't stop my grandma though.");
                System.out.println("J(H): Your grandma is a witch doctor?");
                System.out.println("A(M): Correct. She lives over in those mountains over there.");
                System.out.println("P(K): What are we waiting for let's go.");
                readingBreak();
                System.out.println("\nL(S): Bless me, God. Your son Lucien (S) needs your protection.");
                while (progress.equals("")){
                    System.out.println("Begin? (Enter anything to start battle)");
                    progress = Keyboard.readString();
                }
                //Board levelFour = g;
                System.out.println("Favianna (C) will be unable to participate in this battle.");
                /*while (lord.isAlive() && enemiesAlive){
                    
                }
                */
            }
            level += 1;
        }
    }
        
    

    
    public void extras (int section){
        Unit lord = new Lord();
        Unit cavalier = new Favianna();
        Unit knight = new Paige();
        Unit myrmidon = new Lucien();
        Unit archer = new William();
        Unit healer = new Julius();
        Unit mage = new Ashaman();
        int examine = -1;
        int cutExtras = -1;
        boolean noStop = true;
        while (noStop){
            System.out.println("\n\nYou may enter zero (0) at any time to exit Extras.");
            if (section == 1){
                System.out.println("\nThese are the characters. Select one for inspection.");
                System.out.println("1. Lord\n2. Favianna\n3. Paige\n4. Lucien\n5. William\n6. Julius\n7. Asha'man");
                examine = Keyboard.readInt();
                cutExtras = examine;
                if (cutExtras == 0){
                    return;
                }
            }
            while (examine < 1 || examine > 7){
                System.out.println("\nPlease select a character from this table.");
                System.out.println("1. Lord\n2. Favianna\n3. Paige\n4. Lucien\n5. William\n6. Julius\n7. Asha'man");
                examine = Keyboard.readInt();
                cutExtras = examine;
                if (cutExtras == 0){
                    return;
                }
            }
            System.out.println("\n");
            if (examine == 1){
                System.out.println(lord);
            }
            if (examine == 2){
                System.out.println(cavalier);
            }
            if (examine == 3){
                System.out.println(knight);
            }
            if (examine == 4){
                System.out.println(myrmidon);
            }
            if (examine == 5){
                System.out.println(archer);
            }
            if (examine == 6){
                System.out.println(healer);
            }
            if (examine == 7) {
                System.out.println(mage);
            }
            System.out.println("(Enter an integer to continue)");
            cutExtras = Keyboard.readInt();
        }
    }
    

    public void readingBreak(){
        System.out.println("(Enter a key to continue)");
        String onwards =  "";
        while (onwards.equals("")){
            onwards = Keyboard.readString();
        }
    }
    
    
    public static void main(String[] args){ //Tester
    
        int noStops = 0;
        FireEmblem game = new FireEmblem();
       /* Board levelOne = game.a;
        Unit defender = new BlankUnit();
        Unit lord = new Lord();
        Unit cavalier = new Favianna();
        Unit knight = new Paige();
        Unit mage = new Ashaman();
        Unit archer = new William();
        Unit healer = new Julius();
        Unit myrmidon = new Lucien();
        Unit blank = new BlankUnit();
        
        Unit enemyLord = new EnemyLord();
        Unit enemyCavalier = new EnemyCavalier();
        Unit enemyKnight = new EnemyKnight();
        Unit enemyMage = new EnemyMage();
        Unit enemyArcher = new EnemyArcher();
        Unit enemyMyrmidon = new EnemyMyrmidon();
                levelOne.setUnit(16, 2, lord);
                levelOne.setUnit(17, 2, knight);
                levelOne.setUnit(16, 1, cavalier);
                levelOne.setUnit(18, 2, myrmidon);
                levelOne.setUnit(6 , 11, enemyCavalier);
                levelOne.setUnit(6, 12, enemyMyrmidon);
                levelOne.setUnit(6, 13, enemyKnight);
                levelOne.setUnit(7, 12,enemyLord);
        System.out.println (levelOne);
        game.move(levelOne, game.characterSelection("Lord"));
        System.out.println (levelOne);
        System.out.println(game.e);
        System.out.println(game.a);
        System.out.println(game.f);
        System.out.println(game.g);
        System.out.println(game.i);*/
        
        while (noStops == 0){
            System.out.println("\nWelcome to Fire Emblem: The Very First Adventure (Demo).");
            System.out.println("You may press Ctrl + C at any point to exit the game.");
            System.out.println("There are no save points so beware.");
            game.readingBreak();
            System.out.println("\nPlease select Game Mode \n 1. Play \n 2. Create a new Map  \n 3. Credits");
            int response = Keyboard.readInt();
            while (response < 1 || response > 3){
                System.out.println("\nPlease select a Game Mode.");
                System.out.println("Please select Game Mode \n 1.Play \n 2.Create a new Map \n 3.Credits");
                response = Keyboard.readInt();
            } 
        
            if (response == 1){
                game.play();
            }
            else if (response == 2) {
                HashMap<Integer, Board>mapCol = new HashMap<Integer, Board>(); //Stretch Concept
                //=================================================================
                mapCol.put(0, game.c);
                mapCol.put(1, game.d);
                //=================================================================
                //Decide which Board is empty
                int sel = game.Empty();
                while (sel == -1) {
                    System.out.println ("All Maps Filled. Select One to OverWrite \n 1." + game.c.getName() + "\n 2." + game.d.getName());
                    String input = Keyboard.readString();
                    if (game.indexOf (game.MAP, input) == -1) {System.out.println ("Please Type one of the names above correctly");}
                    else {sel = game.indexOf (game.MAP, input);} 
                    }
                //After a map is selected, begin the CrtMap function;
                System.out.println("Please Select a name for your new map");
                game.crtMap(mapCol.get(sel), Keyboard.readString());
            }   
            /*else if (response == 3){
                System.out.println("\n\nThis is the Extras section. What would you like to explore?");
                System.out.println("1. Characters\n2. Lore\n3. Weapons");
                int exploration = Keyboard.readInt();
                while (exploration < 1 || exploration > 3){
                    System.out.println("Invalid option. Pick again from this table.");
                    System.out.println("1. Characters\n2. Lore\n3. Weapons");
                    exploration = Keyboard.readInt();
                }
                game.extras(exploration);
            }*/
            else {
                System.out.println("Credits");
                System.out.println("Directors: Andrew Lin and Owen Zeng");
                System.out.println("Scriptwriter: Owen Zeng");
                System.out.println("Map Design: Andrew Lin");
                System.out.println("Character Design: Owen Zeng and Andrew Lin");
                System.out.println("Beta testers: Andrew Lin and Owen Zeng");
                game.readingBreak();
                System.out.println("\n\n\n\n");
            }
        }
    }
}//end class FireEmblem