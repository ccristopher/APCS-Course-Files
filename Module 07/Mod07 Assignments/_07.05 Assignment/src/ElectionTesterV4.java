/**
 * Purpose:  This class prints election data using array lists.
 *
 * @author Cristopher Encarnacion
 * @version 03/01/24
 */

import java.util.ArrayList;
import java.util.List;
public class ElectionTesterV4 {
    public static void main(String[] args) {
        // create array of candidates
        List<Candidate> candidates = new ArrayList<Candidate>();

        // initialize candidates
        candidates.add( new Candidate("Radclyffe Clint", 3691));
        candidates.add( new Candidate("Derek Tim", 2691));
        candidates.add( new Candidate("Meg Zelma", 1962));
        candidates.add( new Candidate("Louis Durward", 1491));
        candidates.add( new Candidate("Kaitlyn Peyton", 1968));

        // print data
        System.out.println(" Raw Election Data:\n");
        printCandidates(candidates);
        System.out.println("\n\nOriginal Results:\n");
        printTable(candidates);

        String find = "Radclyffe Clint";
        String name = "Alfredo Barquero";
        int vote;

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
    }

    // print name and votes of all candidates
    public static void printCandidates(List<Candidate> candidateList)
    {
        for(Candidate candidate : candidateList) {
            System.out.println(candidate);
        }
    }

    // calculate and return total votes
    public static int totalVotes(List<Candidate> candidateList)
    {
        int votes = 0;
        for(Candidate candidate : candidateList) {
            votes += candidate.getVotes();
        }
        return votes;
    }

    // print election data in a table
    public static void printTable(List<Candidate> candidateList)
    {
        System.out.println("                  Votes           % of Total");
        System.out.println("Candidate        Recieved            Votes");
        System.out.println("============================================");
        for(Candidate candidate : candidateList) {
            System.out.printf("%-18s %-5d %18.2f\n", candidate.getName(), candidate.getVotes(),
                    ((double) candidate.getVotes() / totalVotes(candidateList)) * 100);
        }
        System.out.println("\nThe total number of votes is: " + totalVotes(candidateList));
    }

    // modifies name of a candidate
    public static void changeName(List<Candidate> candidateList, String find, String replace) {
        for (Candidate candidate : candidateList) {
            if (candidate.getName().equals(find)) {
                candidate.setName(replace);
            }
        }
    }

    // modifies vote count of a candidate
    public static void changeVote(List<Candidate> candidateList, String find, int replace) {
        for (Candidate candidate : candidateList) {
            if (candidate.getName().equals(find)) {
                candidate.setVotes(replace);
            }
        }
    }

    // modifies name and vote count of a candidate
    public static void changeCandidate(List<Candidate> candidateList, String find, int vote, String name) {
        for (Candidate candidate : candidateList) {
            if (candidate.getName().equals(find)) {
                candidate.setVotes(vote);
                candidate.setName(name);
            }
        }
    }
}