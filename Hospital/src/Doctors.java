public class Doctors {




    String firstName;
    String lastName;
    String department;
    int rank;

    public Doctors(String firstName, String lastName, String department, int rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.rank = rank;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void increaseRank(){
        this.rank += 1;
    }

}
