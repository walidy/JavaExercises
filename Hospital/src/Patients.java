import java.util.Date;

public class Patients {

    String firstName;
    String lastName;

    int age;
    int niNumber;


    public Patients(String firstName, String lastName, int age, int niNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.niNumber = niNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(int niNumber) {
        this.niNumber = niNumber;
    }


}
