package Nested;

public class localClass
{
    public void run()
    {
         class Locall{
            private int a=123;

             public int getA() {
                 return a;
             }

             public void setA(int a) {
                 this.a = a;
             }
         }
         Locall l=new Locall();

        System.out.println(l.getA());
    }
}
