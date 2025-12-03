import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Player A, enter your choice (rock/paper/scissors): ");
        String playerA = scanner.nextLine().toLowerCase();
        System.out.print("Player B, enter your choice (rock/paper/scissors): ");
        String playerB = scanner.nextLine().toLowerCase();
        
        switch(playerA) {
            case "rock":
                switch(playerB) {
                    case "rock": System.out.println("Draw"); break;
                    case "paper": System.out.println("Player B wins"); break;
                    case "scissors": System.out.println("Player A wins"); break;
                }
                break;
            case "paper":
                switch(playerB) {
                    case "rock": System.out.println("Player A wins"); break;
                    case "paper": System.out.println("Draw"); break;
                    case "scissors": System.out.println("Player B wins"); break;
                }
                break;
            case "scissors":
                switch(playerB) {
                    case "rock": System.out.println("Player B wins"); break;
                    case "paper": System.out.println("Player A wins"); break;
                    case "scissors": System.out.println("Draw"); break;
                }
                break;
        }
        scanner.close();
    }
}