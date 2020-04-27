public class Main {

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Nurses nurses = new Nurses();

        Patients patient = new Patients("adil", "oozeerally", 25, 654848);
        Patients patient2 = new Patients("walid", "yusof", 25, 2456158);

        hospital.addPatientToCheckUp(patient2);
        hospital.addPatientToOperation(patient);

        System.out.println(hospital.getCheckUpList().get(0).getFirstName());
        System.out.println(nurses.getDepartment(hospital, patient.getFirstName()));
    }
}
