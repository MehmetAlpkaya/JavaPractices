package OOP.Inheritance;

import java.awt.*;

public class Main {
    public static void main(String[] args)
    {
        //Staff s1= new Staff("Mehmet Alpkaya", "05454121788", "alpkaya@gmail.com");
        //Academician A1=new  Academician("Soner Alpkaya", "05454121788","alpkayasoner@hotmail.com","CENG","Doç");
        //Staff s2= new Academician("Tanju Alpkaya","05454121788", "alpkaya@gmail.com","CENG","Doç");

        //Polymorfizm (Çok biçimlilik)
        //Staff[] loginUser={s1,A1,s2};
        //Staff.enterStaff(loginUser);
        Prelector a=new Prelector("Mehmet", "05454121788","alpkaya71@gmail.com","CENG", "Doç",10);
        a.enterCourse("dsada");
    }
}
