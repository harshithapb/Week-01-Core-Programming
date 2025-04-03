package Level2;
import java.util.Scanner;
public class RockPaperScissors {
    public static String compChoice(){
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[(int) (Math.random() * 3)];
    } // rock paper sci =>1 2 3
    public static String winner(String user, String computer){
        //user-> 1 and comp-> 2
        if (user.equalsIgnoreCase(computer)) {
            return "Draw";
        }
        if ((user.equalsIgnoreCase("Rock") && computer.equalsIgnoreCase("Scissors")) ||
                (user.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Rock")) ||
                (user.equalsIgnoreCase("Scissors") && computer.equalsIgnoreCase("Paper"))) {
            return "User";
        }
        return "Computer";
    }
    public static String[][] calcWinner(int userWin,int compWins, int totGames){
        double avg_user = (double)userWin / totGames;
        double avg_comp = (double)compWins / totGames;
        double percentUser = avg_user * 100;
        double percentComp = avg_comp * 100;
        String[][] result =new String[2][4];
        result[0][0]="Avg User";
        result[0][1]="Avg Comp";
        result[0][2]="Percent User";
        result[0][3]="Percent Comp";
        result[1][0]=String.format("%.2f", avg_user);
        result[1][1]=String.format("%.2f", avg_comp);
        result[1][2]=String.format("%.2f%%", percentUser);
        result[1][3]=String.format("%.2f%%", percentComp);
        return result;
    }

    public static void printGame(String [][] results, String [][] percentages){
        System.out.println(" Game No. \t User Choice \t Comp Choice \t Winner");
        for(int i=0;i<results.length;i++){
            System.out.println(" " + (i+1) + " \t\t " + results[i][0] + " \t\t " + results[i][1] + " \t\t " + results[i][2]);
        }
        System.out.println("\nThe statistics are:");
        System.out.println(" " + percentages[0][0] + " \t " + percentages[0][1] + " \t " + percentages[0][2] + " \t " + percentages[0][3]);
        System.out.println(" " + percentages[1][0] + " \t\t " + percentages[1][1] + " \t\t " + percentages[1][2] + " \t\t " + percentages[1][3]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()
        String[][] resultOfGames = new String[games][3];
        int userWins = 0;
        int compWins = 0;
        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine();
            String comp = compChoice();
            String winnerofGame = winner(userChoice, comp);
            if (winnerofGame.equals("User")) {
                userWins++;
            } else if (winnerofGame.equals("Computer")) {
                compWins++;
            }
            resultOfGames[i] = new String[]{userChoice, comp, winnerofGame};
        }
        printGame(resultOfGames, calcWinner(userWins, compWins, games));
        sc.close();

    }
}
