public class main {


    public static void main(String[] args) {


        Hospital hospital = new Hospital();
        Patients patient = new Patients("walid", "yusof", 25, 2456158);
        Patients patient2 = new Patients("walid", "yusof", 25, 2456158);

        hospital.addPatientToCheckUp(patient2);

        System.out.println(hospital.getCheckUpList().get(0).getFirstName());
    }
}
