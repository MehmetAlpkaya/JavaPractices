package Static;

public class main
{
    public static void main(String[] args) {

        Course mat = new Course("Matamatik","MAT101", 50);
        Course fizik = new Course("Fizik","FZK101", 70);
        Course kimya = new Course("Kimya","KMY101", 60);
        Player a=new Player("Mehmet", 2);
        System.out.println(Player.game);
        Player.showName(); // nesne üretmeden static kullanarak Player üzerinden erişmemizi sağlar
        Course [] dersler={mat,fizik,kimya};
        Calculate.calcAverage(dersler);


    }
}
