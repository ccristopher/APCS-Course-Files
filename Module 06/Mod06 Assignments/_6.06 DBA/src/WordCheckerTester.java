public class WordCheckerTester {
    public static void main(String[] args) {
        String[] array = new String[] {"hey", "whats", "up"};
        WordChecker checker = new WordChecker(array, 3, "whats");
        System.out.println(checker.isWithin());
    }
}