import java.util.Scanner;
public class BuyMovieTickets
{
    public static void main(String[] args)
    {
        // create scanner
        Scanner in = new Scanner(System.in);

        // collect info
        System.out.print("Please enter your first and last name: ");
        String firstName = in.next();
        String lastName = in.nextLine().substring(1);

        System.out.print("Enter todays date (mm/dd/yyyy): ");
        String date = in.next().replace('/', '-'); // reformat date
        in.nextLine();

        System.out.print("What movie are you here to see?: ");
        String movie = in.next() + in.nextLine();

        System.out.print("How many tickets?: ");
        int tickets = Integer.parseInt(in.next());
        in.nextLine();

        System.out.print("What is the price of the ticket?: $");
        double price = Double.parseDouble(in.next());
        in.nextLine();

        System.out.print("Debit card (#####-###-####): ");
        String card = in.next();
        in.nextLine();

        System.out.print("PIN (#####): ");
        String pin = in.next();
        in.nextLine();

        // quick calculations
        String order = lastName.substring(1, 3) + card.substring(6, 9); // create order number
        char firstInitial = firstName.charAt(0); // censor first name
        String censoredCard = "#####-###-" + card.substring(10, 14); // censor debit card
        double totalCost = tickets * price; // calculate total cost
        String column = "*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~";

        // print receipt
        System.out.println("\n\n" + column + "\n" + column);
        System.out.println("Your e-Receipt");
        System.out.println("\n" + date);
        System.out.println("Order number: " + order);
        System.out.println("\n\t" + firstInitial + ". " + lastName);
        System.out.println("\tAccount: " + censoredCard);
        System.out.println("\tMovie: " + movie);
        System.out.println("\tNumber of Tickets: " + tickets);
        System.out.println("\tTicket Price: " + price);
        System.out.println("\n\t$" + totalCost + " will be debited to your account.");
        System.out.println("\n\tThank you!");
        System.out.println(column + "\n" + column);
    }
}