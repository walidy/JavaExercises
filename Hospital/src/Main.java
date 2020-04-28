public class Main {

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Nurses nurses = new Nurses();

        AdminTeam admin = new AdminTeam();
        Receptionist receptionist = new Receptionist();

        Patients patient = new Patients("adil", "oozeerally", 25, 654848);
        Patients patient2 = new Patients("walid", "yusof", 25, 2456158);

        hospital.addPatientToCheckUp(patient2);
        hospital.addPatientToOperation(patient);

        System.out.println(hospital.getCheckUpList().get(0).getFirstName());
        System.out.println(nurses.getDepartment(hospital, patient.getFirstName()));


        Doctors doctor2 = new Doctors("Dr", "Fritzl", "Physician", 1);
        Doctors doctor3 = new Doctors("Mr", "Killamunshum", "Pediatrician", 5);
        admin.addDoctorToTeam(doctor2);
        admin.promoteDoctor(doctor2);
        admin.addDoctorToTeam(doctor3);
        admin.promoteDoctor(doctor3);
        System.out.println(doctor2.getRank());
        System.out.println(doctor3.getRank());
        receptionist.printSystem(admin.getTeamDoctor(), hospital.depCheckUp);





    }
}
