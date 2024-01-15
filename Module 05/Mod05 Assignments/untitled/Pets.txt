/**
 * Pet object
 *
 * @author Cristopher Encarnacion
 * @version 12/14/2023
 */

public class Pets {
//declare instance variables for pet name, pet breed and pet age
    private String myName;
    private String myBreed;
    private int myAge;

//create the default constructor
    public Pets() {

    }

//create the constructor with parameters
    public Pets(String name, String breed, int age) {
        myName = name;
        myBreed = breed;
        myAge = age;
    }

//setter & getter methods for petName, petBreed and petAge
    public String getName() {
        return myName;
    }

    public String getBreed() {
        return myBreed;
    }

    public int getAge() {
        return myAge;
    }

    public void setName(String newName) {
        myName = newName;
    }

    public void setBreed(String newBreed) {
        myBreed = newBreed;
    }

    public void setAge(int newAge) {
        myAge = newAge;
    }
}