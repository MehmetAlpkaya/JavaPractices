package finall;

public class Daire
{
    public int r;
    final double pi=3.14;
    public Daire(int r)
    {
        this.r=r;
    }
    public void calcArea()
    {
        double alan= pi*this.r*this.r;
        System.out.println("alan :"+alan);
    }
}
