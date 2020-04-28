import java.util.List;

public class Receptionist {

    public void printSystem(List<Doctors> doctorList, List<Patients> patientList) {
        printDoctors(doctorList);
        printPatients(patientList);
    }

    private void printDoctors(List<Doctors> doctorsList) {
        for (Doctors doctor : doctorsList) {
            System.out.println(doctor.getFirstName());
        }
    }

    private void printPatients(List<Patients> patientsList) {
        for (Patients patients : patientsList) {
            System.out.println(patients.getFirstName());
        }
    }
}
