package ui;
import java.util.Scanner;
import model.GameController;

public class TableGameSystem {
    
    public static void print(Object a){
        System.out.println(a);
    }
    
    public static GameController game;
    public static Scanner sc = new Scanner(System.in); 
    public TableGameSystem() {
        game = new GameController();
    }

    public static void main(String[] args) {
        int option = 0;
        while (option!=4){
            menu(); 
            option = sc.nextInt();
            switch(option){
                case 1:
                    print("Please enter the number of rows: ");
                    int rows = sc.nextInt();
                    print("Please enter the number of columns: ");
                    int cols = sc.nextInt();
                    game.createTable(rows, cols);
                    print("Table created successfully!")
                    break;
                case 2:
                    print("Please enter the player number (1 or 2): ");
                    int playerNum = validateOneOrTwo();
                    print( "You got: " + (game.trowDice(playerNum));
                    break;
                case 3:
                    game.viewPlayerPos();
                    break;
                case 4:
                    print("Thanks for playing!");
                    break;
                default:
                    print("Please enter a valid option");
                    break;
            }
        }

    }

    public static void menu(){

        print("*******Welcome to the game*********");
        print(" Please select an option: ");
        print("1. Start game");
        print("2. Trow dice");
        print("3. View player position (table)");
        print("4. Exit");
        print("************************************");
    }

    public static int validateOneOrTwo(){
        int num = sc.nextInt();
        while(num!=1 && num!=2){
            print("Please enter a valid player number (1 or 2)");
            num = sc.nextInt();
        }
        return num;
    }
}
