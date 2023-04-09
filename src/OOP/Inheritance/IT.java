package OOP.Inheritance;

public class IT extends Prelector{
    private String mission;

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public IT(String nameSurname, String mbPhone, String ePosta, String department, String degree, int no, String mission) {
        super(nameSurname, mbPhone, ePosta, department, degree, no);
        this.mission = mission;
    }
}
