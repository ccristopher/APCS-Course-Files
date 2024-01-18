public class QuizResults {
    private String n;
    private int quiz1;
    private int quiz2;

    public QuizResults(String name, int firstQuiz, int secondQuiz) {
        n = name;
        quiz1 = firstQuiz;
        quiz2 = secondQuiz;
    }

    public String getName() {
        return n;
    }

    public int getFirstQuiz() {
        return quiz1;
    }

    public int getSecondQuiz() {
        return quiz2;
    }

    public void setName(String name) {
        n = name;
    }

    public void setFirstQuiz(int firstQuiz) {
        quiz1 = firstQuiz;
    }

    public void setSecondQuiz(int secondQuiz) {
        quiz2 = secondQuiz;
    }

    public int calcDifference() {
        int difference = 0;
        difference = quiz2 - quiz1;
        return difference;
    }

    public double calcAverage() {
        int average = 0;
        average = (quiz1 + quiz2) / 2;
        return average;
    }

    public String toString() {
        return String.format("%s %s %s %d %f", getName(), getFirstQuiz(), getSecondQuiz(), calcDifference(), calcAverage());
    }
}