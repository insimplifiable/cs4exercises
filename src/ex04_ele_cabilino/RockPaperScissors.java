package ex04_ele_cabilino;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

public class RockPaperScissors{
    public static void main(String[] args) throws IOException{
        Move rock = new Move("Rock");
        Move paper = new Move("Paper");
        Move scissors = new Move("Scissors");

        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);

        int roundsToWin = 2;
        int playerPoints; int computerPoints;
        
        String mainInput = "";
        String outInput;
        
        Random rand = new Random();
        Move playerMove = null; Move computerMove = null;
        
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        
        System.out.print("Welcome to Rock, Paper, Scissors. ");
        // Enters into a loop wherein the program runs until the user chooses to exit.
        while(!mainInput.equals("3")) {
            
            System.out.print("\nPlease choose an option:\n1. Start game\n2. Change number of rounds\n3. Exit application\n> ");
            mainInput = reader.readLine();
            
            while (true) {
                //If 1 is chosen
                if(mainInput.equals("1")) {
                    //Resets points in case user wishes to do another game
                    playerPoints = 0;
                    computerPoints = 0;
                    
                    System.out.println("\nThis match will be best to " + roundsToWin + ".");
                    
                    //Loop that runs the game, adding points for both players until one wins
                    while(!(playerPoints == roundsToWin || computerPoints == roundsToWin)) {
                        //Creates a random number and calculates the remainder when divided by 3 to assign for any of the 3 moves
                        int moveComputerInput = rand.nextInt()%3;
                        switch(moveComputerInput) {
                            case 0 -> {computerMove = rock;}
                            case 1 -> {computerMove = paper;}
                            case 2 -> {computerMove = scissors;}
                        }
                        
                        System.out.print("The computer has selected its move. Select your move\n1. Rock\n2. Paper\n3. Scissors\n> ");
                        String movePlayerInput = reader.readLine();
                       
                        //Loop in case player does not choose a valid number
                        while (!movePlayerInput.matches("1|2|3")) {
                            System.out.print("\nInvalid input. Please enter a number between 1 to 3.\n> ");
                            movePlayerInput = reader.readLine();
                        }
                        
                        //Assigns number to move
                        switch(movePlayerInput) {
                            case "1" -> {playerMove = rock;}
                            case "2" -> {playerMove = paper;}
                            case "3" -> {playerMove = scissors;}
                        }
                        System.out.print("\nPlayer chose " + playerMove.getName() + ". Computer chose " + computerMove.getName() + ". ");
                        
                        //Assigns return value of compareMoves() to give output and necessary addition if either wins
                        switch(Move.compareMoves(playerMove, computerMove)) {
                            case 0 -> {System.out.println("Player wins!"); playerPoints++;}
                            case 1 -> {System.out.println("Computer wins!"); computerPoints++;}
                            case 2 -> {System.out.println("Sadly, it is a tie.");}
                        }
                        
                        System.out.println("Player: " + playerPoints + " - Computer: " + computerPoints);
                        
                    }
                    //Determines whether user or computer wins the match
                    if(playerPoints == roundsToWin) System.out.println("\nPlayer wins the match!");
                    else System.out.println("\nComputer wins the match!");
                    
                    //Uses outInput to either go back to the main menu or loops back for another game (Note: mainInput that still has the value "1" is unchanged)
                    System.out.print("Do you wish to play again?\n1. Yes\n2. No\n> ");
                    outInput = reader.readLine();
                    
                    while(!outInput.matches("1|2")) {
                        System.out.println("Invalid input. Please enter either 1 or 2 to continue.\n> ");
                        outInput = reader.readLine();
                    }
                    
                    if(outInput.equals("2")) break;
                    
                }
                
                else if(mainInput.equals("2")) {
                    System.out.print("\nHow many wins will it take then to win a match?\n> ");
                    
                    //Checks if the input is a natural number - since we are counting number of rounds won until the match is overall won
                    try {
                        int checkInt = Integer.parseInt(reader.readLine());
                        if(checkInt > 0) roundsToWin = checkInt;
                        else System.out.println("Invalid number - please choose an integer greater than 0. Redirecting back to main menu.");
                    }
                    catch(NumberFormatException er) { System.out.println("Invalid input - please choose an integer greater than 0. Redirecting back to main menu.");}
                    
                    //Redirects back to main menu, no matter if a new number of rounds to win is set or the input is invalid
                    break;
                }
                
                else if(mainInput.equals("3")) {
                    //Exits the loop for the program to end
                    break;
                }
                
                else {
                    //Asks user to enter a valid number to continue
                    System.out.print("Invalid input. Please enter a number between 1 to 3.\n> ");
                    mainInput = reader.readLine();
                }
            }
        }
        System.out.println("Thank you for playing and see you next time!");
    }
}