import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hospital {


    List<Patients> depXray = new ArrayList<Patients>();
    List<Patients> depOperation = new ArrayList<Patients>();
    List<Patients> depCheckUp = new ArrayList<Patients>();


    public void addPatientToXray(Patients patient) {
        depXray.add(patient);
    }


    public void addPatientToOperation(Patients patient) {
        depOperation.add(patient);
    }

    public void addPatientToCheckUp(Patients patient) {
        depCheckUp.add(patient);
    }

    public List<Patients> getCheckUpList() {
        return depCheckUp;

    }

}
