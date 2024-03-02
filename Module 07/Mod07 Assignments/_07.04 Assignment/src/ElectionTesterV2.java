import java.util.*;
public class ElectionTesterV2 {
    public static void main(String[] args) {
        List<Candidate> candidates = new ArrayList<Candidate>();

        candidates.add( new Candidate("Radclyffe Clint", 3691));
        candidates.add( new Candidate("Derek Tim", 2691));
        candidates.add( new Candidate("Meg Zelma", 1962));
        candidates.add( new Candidate("Louis Durward", 1491));
        candidates.add( new Candidate("Kaitlyn Peyton", 1968));

        System.out.println(" Raw Election Data:\n");
        printCandidates(candidates);
        System.out.println("\n\nElection Results:\n");
        System.out.println("                  Votes           % of Total");
        System.out.println("Candidate        Recieved            Votes");
        System.out.println("============================================");
        printTable(candidates);
        System.out.print("\nThe total number of votes is: " + totalVotes(candidates));
    }

    public static void printCandidates(List<Candidate> candidateList)
    {
        for(Candidate candidate : candidateList) {
            System.out.println(candidate);
        }
    }

    public static int totalVotes(List<Candidate> candidateList)
    {
        int votes = 0;
        for(Candidate candidate : candidateList) {
            votes += candidate.getVotes();
        }
        return votes;
    }

    public static void printTable(List<Candidate> candidateList)
    {
        for(Candidate candidate : candidateList) {
            System.out.printf("%-18s %-5d %18.2f\n", candidate.getName(), candidate.getVotes(),
                    ((double) candidate.getVotes() / totalVotes(candidateList)) * 100);
        }
    }
}