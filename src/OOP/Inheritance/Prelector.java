package OOP.Inheritance;

public class Prelector extends Academician{
    private int no;

    public Prelector(String nameSurname, String mbPhone, String ePosta, String department, String degree, int no) {
        super(nameSurname, mbPhone, ePosta, department, degree);
        this.no = no;
    }
}
