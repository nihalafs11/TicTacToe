import java.util.*;

public class TicTacToe {
    
    static String winner = "none", playerMark = null;
    static boolean win = false, endGame = false;
    static char s1, s2, s3 , s4 , s5 , s6, s7 , s8 , s9;
    
    public static void initialGrid()
    {
        // initialize
        s1 = ' ';
        s2 = ' ';
        s3 = ' ';
        s4 = ' ';
        s5 = ' ';
        s6 = ' ';
        s7 = ' ';
        s8 = ' ';
        s9 = ' ';
        
        // print grid
        System.out.println("__________________");
        System.out.println("|     |     |     |");
        System.out.println("|  1  |  2  |  3  |");
        System.out.println("|_____|_____|_____|");
        System.out.println("|     |     |     |");
        System.out.println("|  4  |  5  |  6  |");
        System.out.println("|_____|_____|_____|");
        System.out.println("|     |     |     |");
        System.out.println("|  7  |  8  |  9  |");
        System.out.println("|_____|_____|_____|");
        
    }
    // method that prints the grid every time a move is made
    public static void printGrid(char s1, char s2, char s3, char s4,
                                 char s5, char s6, char s7, char s8, char s9)
    {
        System.out.println("__________________");
        System.out.println("|     |     |     |");
        System.out.println("|  "+s1+"  |  "+s2+"  |  "+s3+"  |");
        System.out.println("|_____|_____|_____|");
        System.out.println("|     |     |     |");
        System.out.println("|  "+s4+"  |  "+s5+"  |  "+s6+"  |");
        System.out.println("|_____|_____|_____|");
        System.out.println("|     |     |     |");
        System.out.println("|  "+s7+"  |  "+s8+"  |  "+s9+"  |");
        System.out.println("|_____|_____|_____|");
    }
    
    // method that checks if a selected space is occupied, then fills the grid with the appropriate player's marker
    public static void fillGrid(char playerMark)
    {
        
        boolean successMove = false;
        
        System.out.println("enter fillGrid("+playerMark+")");
        
        Scanner input = new Scanner(System.in);
        
        while (!successMove) {
            
            System.out.println("successMove = "+successMove);
            
            int userChoice = input.nextInt();
            
            while (userChoice < 1 || userChoice > 9) {
                System.out.println("Please choose a valid option (1-9).");
                userChoice = input.nextInt();
            }
            
            System.out.println("integer input = "+userChoice);
            
            if (userChoice == 1) {
                if (s1 != ' ') {
                    System.out.println("That space is already taken!");
                    System.out.println("Please choose a valid option (1-9)");
                    userChoice = input.nextInt();
                } else {
                    s1 = playerMark;
                    successMove = true;
                }
            }
            
            if (userChoice == 2) {
                if (s2 != ' ') {
                    System.out.println("That space is already taken!");
                    System.out.println("Please choose a valid option (1-9)");
                    userChoice = input.nextInt();
                    
                } else {
                    s2 = playerMark;
                    successMove = true;
                }
            }
            
            if (userChoice == 3) {
                if (s3 != ' ') {
                    System.out.println("That space is already taken!");
                    System.out.println("Please choose a valid option (1-9)");
                    userChoice = input.nextInt();
                    
                } else {
                    s3 = playerMark;
                    successMove = true;
                }
            }
            
            if (userChoice == 4) {
                if (s4 != ' ') {
                    System.out.println("That space is already taken!");
                    System.out.println("Please choose a valid option (1-9)");
                    userChoice = input.nextInt();
                    
                } else {
                    s4 = playerMark;
                    successMove = true;
                }
            }
            
            if (userChoice == 5) {
                if (s5 != ' ') {
                    System.out.println("That space is already taken!");
                    System.out.println("Please choose a valid option (1-9)");
                    userChoice = input.nextInt();
                    
                } else {
                    s5 = playerMark;
                    successMove = true;
                }
            }
            
            if (userChoice == 6) {
                if (s6 != ' ') {
                    System.out.println("That space is already taken!");
                    System.out.println("Please choose a valid option (1-9)");
                    userChoice = input.nextInt();
                    
                }  else {
                    s6 = playerMark;
                    successMove = true;
                }
            }
            
            if (userChoice == 7) {
                if (s7 != ' ') {
                    System.out.println("That space is already taken!");
                    System.out.println("Please choose a valid option (1-9)");
                    userChoice = input.nextInt();
                } else {
                    s7 = playerMark;
                    successMove = true;
                }
            }
            
            if (userChoice == 8) {
                if (s8 != ' ') {
                    System.out.println("That space is already taken!");
                    System.out.println("Please choose a valid option (1-9)");
                    userChoice = input.nextInt();
                } else {
                    s8 = playerMark;
                    successMove = true;
                }
            }
            
            if (userChoice == 9) {
                if (s9 != ' ') {
                    System.out.println("That space is already taken!");
                    System.out.println("Please choose a valid option (1-9)");
                    userChoice = input.nextInt();
                } else {
                    s9 = playerMark;
                    successMove = true;
                }
            }
        }
    }
    
    
    // method that checks if there are three matching player markers in a row anywhere on the board
    public static void winCheck() {
        /*
         System.out.println("Enter winCheck()");
         
         if (s1 != ' ' &&
         s2 != ' ' &&
         s3 != ' ' &&
         s4 != ' ' &&
         s5 != ' ' &&
         s6 != ' ' &&
         s7 != ' ' &&
         s8 != ' ' &&
         s9 != ' ')
         
         {
         TicTacToe.endGame = true;
         }
         
         if (s1 == s2 && s2 == s3)
         {
         TicTacToe.endGame = true;
         if (s1 == 'X')
         TicTacToe.winner = "Player 1";
         else
         TicTacToe.winner = "Player 2";
         System.out.println("s1=s2=s3 endGame = "+TicTacToe.endGame);
         System.out.println("winner = "+TicTacToe.winner);
         //win = true;
         //winner = s1;
         }
         
         /////
         if (s4 == s5 && s5 == s6) {
         win = true;
         winner = s4;
         }
         if (s7 == s8 && s8 == s9) {
         win = true;
         winner = s7;
         }
         if (s1 == s4 && s4 == s7) {
         win = true;
         winner = s1;
         }
         if (s2 == s5 && s5 == s8) {
         win = true;
         winner = s2;
         }
         if (s3 == s6 && s6 == s9) {
         win = true;
         winner = s3;
         }
         if (s1 == s5 && s5 == s9) {
         win = true;
         winner = s1;
         }
         if (s3 == s5 && s5 == s7) {
         win = true;
         winner = s3;
         } else {
         win = false;
         }
         
         System.out.println("Exit winCheck() : endGame = "+endGame);
         */
    }
    
    // main game
    public static void main (String[] args) {
        
        boolean endProgram = false;
        
        System.out.println("Welcome to Tic Tac Toe!");
        
        while (!endProgram) {
            
            initialGrid();
            
            System.out.println("Player 1 uses X. Player 2 uses O.");
            
            for (int i = 0; i < 4; i++) {
                
                System.out.println("in while loop : winner = "+winner+". endGame = "+endGame);
                System.out.println("Player 1's turn. Enter the corresponding space you would like to mark (1-9).");
                fillGrid('X');
                printGrid(s1,s2,s3,s4,s5,s6,s7,s8,s9);
                //winCheck();
                System.out.println("endGame = "+endGame);
                
                if (s1 == s2 && s2 == s3)
                {
                    if (s1 == 'X')
                        TicTacToe.winner = "Player 1";
                    else
                        TicTacToe.winner = "Player 2";
                    System.out.println("s1=s2=s3 endGame = "+endGame);
                    System.out.println("winner = "+winner);
                    break;
                    //win = true;
                    //winner = s1;
                }
                
                System.out.println("Player 2's turn. Enter the corresponding space you would like to mark (1-9).");
                fillGrid('O');
                printGrid(s1,s2,s3,s4,s5,s6,s7,s8,s9);
                //winCheck();
                
                if (s1 == s2 && s2 == s3)
                {
                    if (s1 == 'X')
                        TicTacToe.winner = "Player 1";
                    else
                        TicTacToe.winner = "Player 2";
                    System.out.println("s1=s2=s3 endGame = "+endGame);
                    System.out.println("winner = "+winner);
                    //win = true;
                    //winner = s1;
                    break;
                }
            }
            
            if (winner == "none") {
                System.out.println("Player 1's turn. Enter the corresponding space you would like to mark (1-9).");
                fillGrid('X');
                printGrid(s1,s2,s3,s4,s5,s6,s7,s8,s9);
            }
            /*
             * if (win == false) {
             System.out.println("Player 1's turn. Enter the corresponding space you would like to mark (1-9).");
             fillGrid("X");
             printGrid(s1,s2,s3,s4,s5,s6,s7,s8,s9);
             winCheck();
             }
             */
            
            if (winner != "none" && endGame == true) {
                
                System.out.println("Congratulations! Player "+winner+" won the game! Play again? (Y)es/(N)o");
                
            } else {
                System.out.println("Stalemate! Play again? (Y)es/(N)o");
            }
            
            String choice;
            
            Scanner input = new Scanner(System.in);
            choice = input.nextLine();
            while (choice != "Y" && choice != "N") {
                System.out.println("Please choose a valid option.");
                System.out.println("Play again? (Y)es/(N)o");
                choice = input.nextLine();
            }
            
            if (choice == "N")
                endProgram = true;
            // else
            // endProgram = false;
            input.close();
        }
        System.out.println("Thanks for playing!");
        
    }
    
}
