import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Double> aList = new ArrayList <Double>(3);
        System.out.println(aList.size());
        aList.add(3.5);
        System.out.println(aList.get(1));
        aList.add(4.3);
        System.out.println(aList.size());
        aList.add(1, 12.3);
        aList.set(2, 18.9);
        aList.add(-42.6);
        aList.set(0, -20.3);
        aList.remove(3);
        aList.add(24.8);
        System.out.println(aList.size());
    }
}