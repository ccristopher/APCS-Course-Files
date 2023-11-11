public class Bag
{
    public static void main(String[] args)
    {
        // Declare and initialize variables
        int purple = 0;
        int yellow = 0;
        int pickCount = 0;
        int totalPicks = 20;
        double randNum = 0.0;

        // Simulate drawing stones
        while(pickCount < totalPicks)
        {
            randNum = Math.random();
            System.out.print(pickCount + "\t" + randNum);

            if(randNum < 0.4)
            {
                purple++;
                System.out.println("\t purple");
            }
            else
            {
                yellow++;
                System.out.println("\t yellow");
            }
            pickCount++;
        }

        // Output number of stones
        System.out.println();
        System.out.println("Number of Purple Stones = " + purple);
        System.out.println("Number of Yellow Stones = " + yellow);
    }
}