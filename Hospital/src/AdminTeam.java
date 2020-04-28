import java.util.ArrayList;
import java.util.List;

public class AdminTeam {

    public List<Doctors> getTeamDoctor() {
        return teamDoctor;
    }

    public void setTeamDoctor(List<Doctors> teamDoctor) {
        this.teamDoctor = teamDoctor;
    }

    List<Doctors> teamDoctor = new ArrayList<Doctors>();
    public void addDoctorToTeam(Doctors doctor){
        teamDoctor.add(doctor);
    }

    public void removeDoctorFromTeam(Doctors doctor){
        teamDoctor.remove(doctor);
    }


    public void promoteDoctor(Doctors doctor){
        doctor.increaseRank();
    }

}
