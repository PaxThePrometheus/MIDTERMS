import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class MidtermAct2_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nme = readName(scanner);

        int ptl = readInt(scanner, "Enter the number of pages of the book: ", 1, Integer.MAX_VALUE);
        int pgn = readInt(scanner, "Enter the amount of pages read: ", 0, ptl);

        LocalDate isd = readIssueDate(scanner);
        LocalDate dud = readDueDate(scanner, isd);

        int drd = (int) ChronoUnit.DAYS.between(isd, LocalDate.now());
        int dlt = (int) ChronoUnit.DAYS.between(isd, dud);
        int drft = dlt - drd;

        showGreeting(nme);
        showProgress(pgn, ptl);
        showDeadline(drft);
        showPace(ptl, dlt);

    }

    public static String readName(Scanner scanner) {

        while (true) {

            System.out.print("Enter your name: ");
            String nme = scanner.nextLine().trim();

            if (nme.isEmpty()) {
                System.out.println("Name cannot be empty.");
            } else if (!nme.matches("[\\p{L} .'-]+")) {
                System.out.println("Name must contain letters only, no numbers or symbols.");
            } else {
                return nme;
            }

        }

    }

    public static int readInt(Scanner scanner, String msg, int min, int max) {

        while (true) {

            System.out.print(msg);
            String line = scanner.nextLine().trim();

            try {

                int num = Integer.parseInt(line);

                if (num < min) {
                    System.out.println("Value must be at least " + min + ".");
                } else if (num > max) {
                    System.out.println("Value must not exceed " + max + ".");
                } else {
                    return num;
                }

            } catch (NumberFormatException e) {
                System.out.println("That is not a valid integer.");
            }

        }

    }

    public static LocalDate readDate(Scanner scanner, String msg) {

        while (true) {

            System.out.print(msg);
            String[] prt = scanner.nextLine().trim().split("\\s+");

            if (prt.length != 3) {
                System.out.println("Use the format dd mm yyyy.");
                continue;
            }

            try {

                int dy = Integer.parseInt(prt[0]);
                int mnth = Integer.parseInt(prt[1]);
                int yr = Integer.parseInt(prt[2]);

                if (dy < 1 || mnth < 1 || yr < 1) {
                    System.out.println("Date values must be positive.");
                    continue;
                }

                return LocalDate.of(yr, mnth, dy);

            } catch (NumberFormatException e) {
                System.out.println("That is not a valid integer.");
            } catch (DateTimeException e) {
                System.out.println("That date does not exist.");
            }

        }

    }

    public static LocalDate readIssueDate(Scanner scanner) {

        while (true) {

            LocalDate isd = readDate(scanner, "Enter the issue date (dd mm yyyy): ");

            if (isd.isAfter(LocalDate.now())) {
                System.out.println("Issue date cannot be in the future.");
            } else {
                return isd;
            }

        }

    }

    public static LocalDate readDueDate(Scanner scanner, LocalDate isd) {

        while (true) {

            LocalDate dud = readDate(scanner, "Enter the due date (dd mm yyyy): ");

            if (!dud.isAfter(isd)) {
                System.out.println("Due date must be after the issue date.");
            } else {
                return dud;
            }

        }

    }

    public static int showGreeting(String nme) {

        System.out.println("\nHello, " + nme + "!");

        return 0;

    }

    public static int showProgress(int pgn, int ptl) {

        System.out.println("You have read " + String.format("%.2f", (double) pgn * 100 / ptl) + "% of the book.");

        return 0;

    }

    public static int showDeadline(int drft) {

        if (drft > 0) {
            System.out.println("You have " + drft + " days left to return the book.");
        } else {
            System.out.println("Your book is overdue for return.");
        }

        return 0;

    }

    public static int showPace(int ptl, int dlt) {

        System.out.println("You have to read " + String.format("%.0f", Math.ceil((double) ptl / dlt)) + " pages everyday to finish the book on time.");

        return 0;

    }

}