/**
 * This class demonstrates binary and sequential search in an array of contacts.
 *
 * @author Cristopher Encarnacion
 * @version 03/28/24
 */

public class TestContactV1 {
    public static void main(String[] args) {
        int test;
        Contact[] contacts = new Contact[10];

        contacts[0] = new Contact("Chuck Jewel", "Uncle", "Feb 08", "(206) 342-8631", "chuck.jewel@example.com");
        contacts[1] = new Contact("Barney Pond", "Aunt", "Mar 11", "(717) 550-1675", "barney.pond@example.com");
        contacts[2] = new Contact("Gwen Outterridge", "Mother", "May 09", "(248) 762-0356", "gwen.outterridge@example.com");
        contacts[3] = new Contact("Harlan Jacobson", "Coworker", "Oct 14", "(253) 644-2182", "harlan.jacobson@example.com");
        contacts[4] = new Contact("Maya Willard", "Coworker", "Mar 22", "(212) 658-3916", "maya.willard@example.com");
        contacts[5] = new Contact("Gus Wyman", "Friend", "Aug 01", "(209) 300-2557", "gus.wyman@example.com");
        contacts[6] = new Contact("Paige Mathers", "Niece", "May 03", "(262) 162-1585", "paige.mathers@example.com");
        contacts[7] = new Contact("Grover Law", "Friend", "May 15", "(252) 258-3799", "grover.law@example.com");
        contacts[8] = new Contact("Danny Paul", "Aunt", "Mar 11", "(234) 109-6666", "danny.paul@example.com");
        contacts[9] = new Contact("Sheri Victor", "Sister", "Oct 16", "(201) 874-8593", "sheri.victor@example.com");

        printContacts(contacts);

        System.out.println("\n\nSearching for Grover Law: ");
        insertionRelation(contacts);
        test = binarySearchName(contacts, "Grover Law");
        if(test != -1)
            System.out.println("Found: \n" + contacts[test]);
        else
            System.out.println("Not found. " );

        System.out.println("\n\nSearching for Cristopher Encarnacion: ");
        test = binarySearchName(contacts, "Cristopher Encarnacion");
        if(test != -1)
            System.out.println("Found: " + contacts[test]);
        else
            System.out.println("Not found. " );

        System.out.println("\n\nSearching for Coworker: ");
        insertionRelation(contacts);
        binarySearchRelation(contacts, "Coworker");

        System.out.println("\n\nSearching for Nephew: ");
        insertionRelation(contacts);
        binarySearchRelation(contacts, "Nephew");

        System.out.println("\n\nSearching for May: ");
        sequentialBirthdate(contacts, "May");

        System.out.println("\n\nSearching for Jan: ");
        sequentialBirthdate(contacts, "Jan");

        System.out.println("\n\nSearching for (209) 300-2557: ");
        sequentialNumber(contacts, "(209) 300-2557");

        System.out.println("\n\nSearching for (786) 464-6806: ");
        sequentialNumber(contacts, "(786) 464-6806");

        System.out.println("\n\nSearching for harlan.jacobson@example.com: ");
        sequentialEmail(contacts, "harlan.jacobson@example.com");

        System.out.println("\n\nSearching for cristopher.encarnacion@example.com: ");
        sequentialEmail(contacts, "cristopher.encarnacion@example.com");
    }

    public static void printContacts(Contact[] c)
    {
        System.out.println("Title             Relation   Birth     Number             Email");
        System.out.println("-------------------------------------------------------------------------------------");
        for(int i = 0; i < c.length; i++)
            System.out.println(c[i]);
    }

    public static int binarySearchName(Contact[] r, String toFind)
    {
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if( r[probe].getName().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        if( (low >= 0) && (r[low].getName().compareTo(toFind) == 0 ))
            return low;
        else
            return -1;
    }

    public static void binarySearchRelation(Contact[] r, String toFind )
    {
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(r[probe].getRelation().compareTo(toFind) > 0)
                high = probe;
            else
            {
                low = probe;
                if( r[probe].getRelation().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }

        if( (low >= 0) && (r[low].getRelation().compareTo(toFind) == 0 ))
        {
            linearPrintRelation(r, low, toFind);
        }
        else
            System.out.println("NOT found: " + toFind);
    }

    public static void insertionRelation(Contact[] source)
    {
        Contact[] dest = new Contact[ source.length ];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Contact next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getRelation().compareTo(dest[k-1].getRelation()) > 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;

//            Debugging Statements
//            uncomment to print the listings after each pass through the sort
//             System.out.println("\nPass # " + i);
//             for(Contact a : dest)
//                if( a != null) System.out.printf("%-10s \n", a.getRelation() );
        }

        for(int i = 0; i < dest.length; i++)
            source[i] = dest[i];
    }

    public static void linearPrintRelation(Contact[] r, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (r[i].getRelation().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < r.length) && (r[i].getRelation().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(r[i]);
    }

    public static void sequentialBirthdate(Contact[] r, String toFind)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getBirthdate().substring(0, 3).compareTo(toFind) == 0)
            {
                System.out.println(r[i]);
                found++;
            }
        }

        if(found == 0)
        {   // we have not found the location
            System.out.println(toFind + " is not in the contact list");
        }
    }

    public static void sequentialNumber(Contact[] r, String toFind)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getNumber().compareTo(toFind) == 0)
            {
                System.out.println(r[i]);
                found++;
            }
        }

        if(found == 0)
        {   // we have not found the location
            System.out.println(toFind + " is not in the contact list");
        }
    }

    public static void sequentialEmail(Contact[] r, String toFind)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getEmail().compareTo(toFind) == 0)
            {
                System.out.println(r[i]);
                found++;
            }
        }

        if(found == 0)
        {   // we have not found the location
            System.out.println(toFind + " is not in the contact list");
        }
    }
}