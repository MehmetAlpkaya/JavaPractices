package Static;

public class Calculate {
    public static void calcAverage(Course[] notes)
    {
        double total=0.0;
        for (Course i:  notes) {
            total +=i.note;
            System.out.println(i);
        }
        double average = total / notes.length;
        System.out.println("Ortalamız:"+ average);
    }
}
