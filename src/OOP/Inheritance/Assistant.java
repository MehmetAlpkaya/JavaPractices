package OOP.Inheritance;

import java.sql.Time;

public class Assistant extends Academician{
    private String oficeTime;

    public String getOficeTime() {
        return oficeTime;
    }

    public void setOficeTime(String oficeTime) {
        this.oficeTime = oficeTime;
    }

    public Assistant(String nameSurname, String mbPhone, String ePosta, String department, String degree, String oficeTime) {
        super(nameSurname, mbPhone, ePosta, department, degree);
        this.oficeTime = oficeTime;
    }
    public void enterCourse(String s)
    {}
}
