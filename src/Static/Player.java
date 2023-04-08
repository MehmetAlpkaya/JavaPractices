package Static;

public class Player
{
    public int id;
    public String name;
    public static String game="CS";
    public static int count= 0;

    public Player(String name, int id)
    {
        this.name=name;
        this.id=id;
        count++; // her Player constructerı çağırıldığında count artar
    }

    public static void showName()
    {
        //System.out.println(this.name); // Static metod içerisinden static metoda ait olmayan bir şeye ulaşamayız bu yüzden nesne üreterek ulaşabiliriz
        Player p=new Player("Mehmet", 5);
        System.out.println(p.name);
    }
}
