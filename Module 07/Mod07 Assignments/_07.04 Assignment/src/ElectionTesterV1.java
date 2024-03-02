public class ElectionTesterV1 {
    public static void main(String[] args) {
        Candidate[] candidates = new Candidate[5];

        candidates[0] = new Candidate("Radclyffe Clint", 3691);
        candidates[1] = new Candidate("Derek Tim", 2691);
        candidates[2] = new Candidate("Meg Zelma", 1962);
        candidates[3] = new Candidate("Louis Durward", 1491);
        candidates[4] = new Candidate("Kaitlyn Peyton", 1968);

        System.out.println(" Raw Election Data:\n");
        printCandidates(candidates);
        System.out.println("\n\nElection Results:\n");
        System.out.println("                  Votes           % of Total");
        System.out.println("Candidate        Recieved            Votes");
        System.out.println("============================================");
        printTable(candidates);
        System.out.print("\nThe total number of votes is: " + totalVotes(candidates));
    }

    public static void printCandidates(Candidate[] candidateList)
    {
        for(int i = 0; i < candidateList.length; i++)
            System.out.println(candidateList[i]);
    }

    public static int totalVotes(Candidate[] candidateList)
    {
        int votes = 0;
        for(int i = 0; i < candidateList.length; i++) {
            votes += candidateList[i].getVotes();
        }
        return votes;
    }

    public static void printTable(Candidate[] candidateList)
    {
        for(int i = 0; i < candidateList.length; i++) {
            System.out.printf("%-18s %-5d %18.2f\n", candidateList[i].getName(), candidateList[i].getVotes(),
                    ((double) candidateList[i].getVotes() / totalVotes(candidateList)) * 100);
        }
    }
}