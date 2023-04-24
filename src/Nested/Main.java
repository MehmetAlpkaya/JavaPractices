package Nested;

public class Main {
    public static void main(String[] args) {
        Out out=new Out();
        Out.In ınNesne= out.new In();
        ınNesne.print();
        out.print();
    }
}
