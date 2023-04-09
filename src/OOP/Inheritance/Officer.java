package OOP.Inheritance;

public class Officer extends Staff
{
    private String department;
    private String shift;

    public Officer(String nameSurname, String mbPhone, String ePosta, String department, String shift) {
        super(nameSurname, mbPhone, ePosta);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void work()
    {
        System.out.println(this.getNameSurname() +  "Officer start to work !!");
    }
}
