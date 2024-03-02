/**
 * Purpose:  This class prints election data using arrays.
 *
 * @author Cristopher Encarnacion
 * @version 03/01/24
 */

public class ElectionTesterV7 {
    public static void main(String[] args) {
        // create array of candidates
        Candidate[] candidates = new Candidate[5];

        // initialize candidates
        candidates[0] = new Candidate("Radclyffe Clint", 3691);
        candidates[1] = new Candidate("Derek Tim", 2691);
        candidates[2] = new Candidate("Meg Zelma", 1962);
        candidates[3] = new Candidate("Louis Durward", 1491);
        candidates[4] = new Candidate("Kaitlyn Peyton", 1968);

        // print data
        System.out.println(" Raw Election Data:\n");
        printCandidates(candidates);
        System.out.println("\n\nOriginal Results:\n");
        printTable(candidates);

        String find = "Radclyffe Clint";
        String name = "Alfredo Barquero";
        int vote;
        int location;

        System.out.println("<< Changing " + find +  " to " + name +  " >>\n");
        changeName(candidates, find, name);
        printTable(candidates);

        find = "Meg Zelma";
        vote = 284;

        System.out.println("<< Changing " + find +  " votes to " + vote +  " >>\n");
        changeVote(candidates, find, vote);
        printTable(candidates);

        find = "Louis Durward";
        name = "Taco Sosa";
        vote = 1345;

        System.out.println("<< Replacing " + find +  " with " + name +  " and " + vote + " votes >>\n");
        changeCandidate(candidates, find, vote, name);
        printTable(candidates);

        location = 1;
        name = "Roberto Alarcon";
        vote = 2342;

        System.out.println("<< In position " + location + ", add " + name + ", " + vote + " votes >>\n");
        insertCandidate(candidates, location, name, vote);
        printTable(candidates);

        find = "Meg Zelma";
        name = "Cynthia Suarez";
        vote = 1384;

        System.out.println("<< Before " + find + ", add " + name + ", " + vote + " votes >>\n");
        insertCandidate2(candidates, find, name, vote);
        printTable(candidates);
    }

    // print name and votes of all candidates
    public static void printCandidates(Candidate[] candidateList) {
        for (int i = 0; i < candidateList.length; i++)
            System.out.println(candidateList[i]);
    }

    // calculate and return total votes
    public static int totalVotes(Candidate[] candidateList) {
        int votes = 0;
        for (int i = 0; i < candidateList.length; i++) {
            votes += candidateList[i].getVotes();
        }
        return votes;
    }

    // print election data in a table
    public static void printTable(Candidate[] candidateList) {
        System.out.println("                  Votes           % of Total");
        System.out.println("Candidate        Recieved            Votes");
        System.out.println("============================================");
        for (int i = 0; i < candidateList.length; i++) {
            System.out.printf("%-18s %-5d %18.2f\n", candidateList[i].getName(), candidateList[i].getVotes(),
                    ((double) candidateList[i].getVotes() / totalVotes(candidateList)) * 100);
        }
        System.out.println("\nThe total number of votes is: " + totalVotes(candidateList));
    }

    // modifies name of a candidate
    public static void changeName(Candidate[] candidateList, String find, String replace) {
        for (int index = 0; index < candidateList.length; index++) {
            if (candidateList[index].getName().equals(find)) {
                candidateList[index].setName(replace);
            }
        }
    }

    // modifies vote count of a candidate
    public static void changeVote(Candidate[] candidateList, String find, int replace) {
        for (int index = 0; index < candidateList.length; index++) {
            if (candidateList[index].getName().equals(find)) {
                candidateList[index].setVotes(replace);
            }
        }
    }

    // modifies name and vote count of a candidate
    public static void changeCandidate(Candidate[] candidateList, String find, int vote, String name) {
        for (int index = 0; index < candidateList.length; index++) {
            if (candidateList[index].getName().equals(find)) {
                candidateList[index].setVotes(vote);
                candidateList[index].setName(name);
            }
        }
    }
    public static void insertCandidate(Candidate[] candidateList, int location, String name, int vote)
    {
        //move items down in the array - last item is lost
        for(int index = candidateList.length - 1; index > location; index--)
            candidateList[index] = candidateList[index-1];

        candidateList[location] = new Candidate(name, vote);
    }

    public static void insertCandidate2(Candidate[] candidateList, String find, String name, int vote)
    {
        int location = 0;

        // find location of item you want to insert before
        for(int index = 0; index < candidateList.length; index++)
            if(candidateList[index].getName().equals(find))
                location = index;

        //move items down in the array - last item is lost
        for(int index = candidateList.length - 1; index > location; index--)
            candidateList[index] = candidateList[index-1];

        candidateList[location] = new Candidate(name, vote);
    }
}