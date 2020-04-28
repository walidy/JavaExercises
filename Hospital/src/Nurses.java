import java.util.List;

public class Nurses {
    public String getDepartment(Hospital hospital, String name){
        String stringToReturn = "";

        if (isInThisDepartment(hospital.depXray, name)) {
            stringToReturn = "X-ray Dept";
        }
        if (isInThisDepartment(hospital.depCheckUp, name)) {
            stringToReturn = "Check-up Dept";
        }
        if (isInThisDepartment(hospital.depOperation, name)) {
            stringToReturn = "Operation Dept";
        }
        return stringToReturn;
    }

    private Boolean isInThisDepartment(List<Patients> department, String name) {
        for(Patients patients : department) {
            if (patients.getFirstName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}
