import java.util.Scanner;
public class Ruin {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("What is the start amount?");
    int startAmount = in.nextInt();
    System.out.println("What is the chance of winning a single play?");
    double winChance = in.nextDouble();
    System.out.println("What is the win limit?");
    int winLimit = in.nextInt ();
    System.out.println("How many days will you play?");
    int totalSimulations = in.nextInt ();
    
    
    for (int day = 1; day <= totalSimulations; day++) {
        int roundsPerDay = 0;
     while (startAmount > 0 && startAmount < winLimit) {
        double game = Math.random();
        roundsPerDay++;
        if (game<winChance) {
            startAmount++;
        } else {
            startAmount--;
        }
    }
        System.out.println("On " +day+ ":");
        System.out.println("You played " +roundsPerDay+ " rounds today.");
}
    if (startAmount >= winLimit) {
        System.out.println("Sucess!");
    }
    if (startAmount <= 0) {
        System.out.println("Ruin!");
    }
}
}


