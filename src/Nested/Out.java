package Nested;
//Outer class
public class Out
{
    public int a=10;

    // Inner non-static class
    public class In
    {
        public int a=20;
        public void print()
        {
            int a=1;
            System.out.println(a);// Specifies the a in the method
            System.out.println(this.a); // specifies a that belongs to the class
            System.out.println(Out.this.a); //This way we can have variables in Out classes.
        }
    }
    //Inner static class
    public static class IN1
    {
        public static int a=10;

        public static
        void print()
        {
            int a=1;
            System.out.println(a);
            System.out.println(IN1.a);
        }

    }
    public void print()
    {
       In in=new In();
       in.print();
    }
}
