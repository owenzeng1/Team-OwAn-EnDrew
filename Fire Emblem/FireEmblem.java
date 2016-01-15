import cs1.Keyboard;
public class FireEmblem{
    private int level = 0;
    private int gender = -1;
    private String playerName = "";
    public void play(){
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
        playerName = Keyboard.readInt();    
        System.out.println("Yes, " + playerName + " that is a wonderful name. I will serve you well." );
        }
    }
    public static void main(String[] args){
        FireEmblem game = new FireEmblem();
        game.play();
    }
}