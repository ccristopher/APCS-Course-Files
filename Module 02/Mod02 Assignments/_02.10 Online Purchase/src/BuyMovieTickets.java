import java.util.Scanner;
public class BuyMovieTickets
{
    public static void main(String[] args)
    {
        // declare local variables
        Scanner in = new Scanner(System.in);


        System.out.print("Please enter your first and last name: ");
        String firstName = in.next();
        String firstInitial = firstName.charAt(0) + ". ";
        System.out.println(firstInitial);
        String lastName = in.nextLine().substring(1);
        System.out.println(lastName);
        System.out.println(firstName);

        System.out.print("Enter todays date (mm/dd/yyyy): ");
        String date = in.next().replace('/', '-') + in.nextLine();
        System.out.println(date);

        System.out.print("What movie are you here to see?: ");
        String movie = in.next() + in.nextLine();
        System.out.println(movie);

        System.out.print("How many tickets?: ");
        int tickets = Integer.parseInt(in.next());
        in.nextLine();
        System.out.println(tickets);

        System.out.print("What is the price of the ticket?: $");
        double price = Double.parseDouble(in.next());
        in.nextLine();
        System.out.println(price);

        System.out.print("Debit card (#####-####-###): ");
        String card = in.next();
        String censoredCard = "#####-####-" + card.substring(11,14);
        System.out.println(censoredCard);

        System.out.print("PIN (#####): ");
        String pin = in.next();
        in.nextLine();
        System.out.print(pin);

        String column = "*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~";
        System.out.println("\n\n" + column + "\n" + column);

    }
}