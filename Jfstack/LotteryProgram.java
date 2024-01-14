import java.util.*;
import java.util.random.*;
import java.util.TreeSet;

public class LotteryProgram {

    public static final int NUMBERS = 6;
    public static final int MAX_NUMBERS = 40;
    public static final int PRIZE = 100;

    public static void main(String args[]) {

        // 3 - Getting winning number and ticket set
        Set<Integer> winning = createWinningNumbers();
        Set<Integer> ticket = getTicket();

        // 4 - Keeping only winning numbers from user ticket
        // using retain all to remove non common
        Set<Integer> matches = new TreeSet<>(ticket);
        matches.retainAll(winning);

        // Calculating the price
        System.out.println("Your tikcet was : " + ticket);
        System.out.println("Winning NUmbers: " + matches);
        if (matches.size() > 0) {
            double prize = PRIZE * Math.pow(2, matches.size());
            System.out.println("Matchedn Numbers:  " + matches);
            System.err.printf("Your prize is $%.2f\n", prize);
        }
    }

    // generates a set of the winning lotto numnber
    public static Set<Integer> createWinningNumbers() {
        Set<Integer> winning = new TreeSet<>();
        Random random = new Random();

        while (winning.size() < NUMBERS) {
            int number = random.nextInt(MAX_NUMBERS) + 1;
            winning.add(number);
        }
        return winning;
    }

    // Reading the players lottery ticket from console
    public static Set<Integer> getTicket() {
        ;
        Set<Integer> ticket = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + NUMBERS + " Lotto Numbers:");

        while (ticket.size() < NUMBERS) {
            int number = sc.nextInt();
            if (number <= MAX_NUMBERS)

                ticket.add(number);
        }
        return ticket;

    }
}
