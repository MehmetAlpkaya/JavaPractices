package OOP.Inheritance;

public class Staff
{
    private String nameSurname;
    private String mbPhone;
    private String ePosta;

    public Staff(String nameSurname, String mbPhone, String ePosta) {
        this.nameSurname = nameSurname;
        this.mbPhone = mbPhone;
        this.ePosta = ePosta;
    }
    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getMbPhone() {
        return mbPhone;
    }

    public void setMbPhone(String mbPhone) {
        this.mbPhone = mbPhone;
    }

    public String getePosta() {
        return ePosta;
    }

    public void setePosta(String ePosta) {
        this.ePosta = ePosta;
    }

    public void enter()
    {
        System.out.println(this.nameSurname +" enter to university !!");
    }

    public void exit()
    {
        System.out.println(this.nameSurname +"exit to university !!");
    }

    public void canteen()
    {
        System.out.println(this.nameSurname +"enter to canteen !!");
    }


}
