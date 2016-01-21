import cs1.Keyboard;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

//In the process of allowing user to choose maps. 
public class FireEmblem{
    private int level = 0;
    private int gender = -1;
    private String playerName = "";
    //Space alloted for Maps. Board a and b and maps that are pregenerated. Board c and d are space alloted for new map creation 
    private Board a = new Board(20, "Bob");
    private Board b = new Board(20, "Joe");
    private Board c = new Board(20);
    private Board d = new Board(20);
    private final String[] MAP = {a.getName(), b.getName(), c.getName(), d.getName()};
    
    //Creates Default Boards a and b;
    FireEmblem() {
        //crt(name);
        //crt(name);
        
    }
    
    //Before game selection, <something main game runner>() will print the name of all the boards which are noted in Array MAP. then, the function will run crt(name) to load the
    //appropriate map. When creating a map (also another function allocated in this class and <main game runner>, the user will first have to save the map name. Before
    //Having the option the create the map. 
    //While board a and b will always be loaded when FireEmblem is run, all data created in board C and D will be lost after a game of FireEmblem is closed.
    public void crt(String name) {
        if (name == a.getName()) {
            //a.crtTerrain Blah Blah Blah
        }
        
        else if (name == b.getName()) {
            //b.crtTerrain Blah Blah
        }
        
        else if (name == c.getName()) {
            
        }
        
        else {
            
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
            System.out.println ("Please select the map terrain? \n 1-Plain, 2-Forest, 3-Desert, 4-Moutain, 5-Fort, 6-Rivers, 7-Shops");
            int t = Keyboard.readInt();
            System.out.println ("Please select an coordinate (x,y)");
            int x = Keyboard.readInt();
            int y = Keyboard.readInt();
            System.out.println ("Please select the dimensions (x,y)");
            int x_dim = Keyboard.readInt();
            int y_dim = Keyboard.readInt();
            //Board <board_name>.crtTerrain();
            m.crtTerrain(x, y, x_dim, y_dim, t);
            System.out.println(m);
            System.out.println ("Is your map finished?");
            Boolean b = Keyboard.readBoolean();
            if (b) {done = true;}
        }
        m.populate();
        System.out.println(m); 
    } 
    
    /*public void play(){
        while (level < 10){
            if (level == 0){
                while (gender != 1 && gender != 2){
                    System.out.println("Yo there! Are you male or female?");
                    System.out.println("1. Male");
                    System.out.println("2. Female");
                    gender = Keyboard.readInt();
                }
            }
        }
        if (gender == 1){
            System.out.println("Hello, my Lord. I am your new loyal Cavailer Favianna, what is your name? (Enter name)");
        }
        else{
            System.out.println("Hello my Lordess. I am your new loyal Cavalier Favianna, what is your name? (Enter name)");
        }
        String playerName = Keyboard.readString();    
        System.out.println("Yes, " + playerName + " that is a wonderful name. I will serve you well." );
        } */
    
    public static void main(String[] args){ //Tester
        FireEmblem game = new FireEmblem();
        System.out.println("Please select Game Mode \n 1.Play \n 2.Create a new Map");
        int response = Keyboard.readInt();
        if (response == 2) {
            HashMap<Integer, Board>mapCol = new HashMap<Integer, Board>(); //Stretch Concept
            //=================================================================
            mapCol.put(0, game.a);
            mapCol.put(1, game.b);
            mapCol.put(2, game.c);
            mapCol.put(3, game.d); 
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
        /*if else (response == 1) {
            game.play();
        }*/
        else { System.out.println ("Please select an appropriate option"); }
    }
}//end class FireEmblem