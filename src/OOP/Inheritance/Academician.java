package OOP.Inheritance;

public class Academician extends Staff{

    private String department;
    private String degree;
    public Academician(String nameSurname, String mbPhone, String ePosta,String department,String degree ) {
        super(nameSurname, mbPhone, ePosta);
        this.department=department;
        this.degree=degree;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
