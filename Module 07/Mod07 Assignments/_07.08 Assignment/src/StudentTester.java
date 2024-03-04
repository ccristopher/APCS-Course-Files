import java.util.ArrayList;
import java.util.List;

public class StudentTester {
    public static void main(String[] args) {
        // create array of candidates
        List<Student> students = new ArrayList<Student>();

        // initialize candidates
        students.add(new Student("Radclyffe Clint", 70, 80, 90, 80, 90));
        students.add(new Student("Derek Tim", 80, 85, 90, 85, 80));
        students.add(new Student("Meg Zelma", 50, 79, 89, 99, 99));
        students.add(new Student("Louis Durward", 85, 80, 85, 88, 89));
        students.add(new Student("Kaitlyn Peyton", 70, 70, 90, 70, 80));

        String find, replace;
        int q, qScore;
        int[] qScores;

        System.out.println("Starting Gradebook:\n");
        printTable(students);

        find = "Meg Zelma";
        replace = "Roberto Alarcon";

        System.out.println("\n<< Replacing " + find +  " with " + replace +  " >>\n");
        replaceName(students, find, replace);
        printTable(students);

        find = "Meg Zelma";
        q = 1;
        qScore = 70;

        System.out.println("\n<< Replacing " + find +  "'s Q" + 1 + " with " + qScore + " >>\n");
        replaceGrade(students, find, q, qScore);
        printTable(students);

        find = "Derek Tim";
        replace = "Claudia Ferrera";
        qScores = new int[]{50, 70, 90, 87, 92};

        System.out.println("\n<< Replacing " + find + " with " + replace + " >>");
        System.out.print("<< with Q's of: { ");
        for(int score : qScores) {
            System.out.print(score + " ");
        }
        System.out.println("}\t\t\t  >>\n");
        replaceStudent(students, find, replace, qScores);
        printTable(students);

        find = "Louis Durward";
        replace = "Cindy Mercedes";
        qScores = new int[]{90, 93, 94, 87, 89};

        System.out.println("\n<< Inserting " + replace + " before " + find + " >>");
        System.out.print("<< with Q's of: { ");
        for(int score : qScores) {
            System.out.print(score + " ");
        }
        System.out.println("}\t\t\t  >>\n");
        insertStudent(students, find, replace, qScores);
        printTable(students);
    }

    public static void printTable(List<Student> students)
    {
        System.out.println("Student name\tQ1\t\tQ2\t\tQ3\t\tQ4\t\tQ5");
        System.out.println("----------------------------------------------------");
        for(Student student : students) {
            System.out.printf("%-15s %-7d %-7d %-7d %-7d %d\n", student.getName(), student.getQuiz(1),
                    student.getQuiz(2), student.getQuiz(3), student.getQuiz(4), student.getQuiz(5));
        }
    }

    public static void replaceName(List<Student> students, String find, String replace) {
        for(Student student : students) {
            if(student.getName().equals(find)) {
                student.setName(replace);
            }
        }
    }

    public static void replaceGrade(List<Student> students, String find, int q, int qScore) {
        for(Student student : students) {
            if(student.getName().equals(find)) {
                student.setQuiz(q, qScore);
            }
        }
    }

    public static void replaceStudent(List<Student> students, String find, String replace, int[] qScores) {
        for(Student student : students) {
            if(student.getName().equals(find)) {
                student.setName(replace);
                for(int q = 1; q <= qScores.length; q++) {
                    student.setQuiz(q, qScores[q - 1]);
                }
            }
        }
    }

    public static void insertStudent(List<Student> students, String find, String replace, int[] qScores) {
        int location = 0;

        for(int index = 0; index < students.size(); index++) {
            if(students.get(index).getName().equals(find)) {
                location = index;
            }
        }
        students.add(location, new Student(replace, qScores[0], qScores[1], qScores[2], qScores[3], qScores[4]));
    }
}