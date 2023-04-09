package OOP.Inheritance;

public class Main {
    public static void main(String[] args)
    {
        Staff s1= new Staff("Mehmet Alpkaya", "05454121788", "alpkaya@gmail.com");
        Academician A1=new  Academician("Soner Alpkaya", "05454121788","alpkayasoner@hotmail.com","CENG","Doç");
        Staff s2= new Academician("Tanju Alpkaya","05454121788", "alpkaya@gmail.com","CENG","Doç");
    }
}
