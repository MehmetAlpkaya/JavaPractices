package OOP.Interface;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Enter the amount :");

        double price=input.nextDouble();

        System.out.print("Enter the card number :");

        String cardNumber=input.next();

        System.out.print("Enter the card expiration date :");

        String date=input.next();

        System.out.print("Enter the CVC :");

        String cvc=input.next();

        System.out.println("1. Bank A");
        System.out.println("2. Bank B");
        System.out.println("3. Bank C");
        System.out.println("Select a bank");



        int selectBank =input.nextInt();
        switch (selectBank){
        case 1:
            aBank aPos=new aBank("Bank A","123456789","123456" );
            aPos.connect("127.1.1.1");
            aPos.payment(price,cardNumber,date,cvc);
            break;
        case 2:
            bBank bPos=new bBank("Bank A","123456789","123456" );
            bPos.connect("127.1.1.1");
            bPos.payment(price,cardNumber,date,cvc);
            break;
        default:
        System.out.println("Enter a valid bank");
        }
    }
}
