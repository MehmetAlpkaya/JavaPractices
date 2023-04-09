package OOP.Inheritance;

public class Security extends Prelector{
    public Security(String nameSurname, String mbPhone, String ePosta, String department, String degree, int no, String certificate) {
        super(nameSurname, mbPhone, ePosta, department, degree, no);
        this.certificate = certificate;
    }

    private String certificate;

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }
}
