package OOP.Interface;

public interface IBank {
    final String hostIpAddres="127.0.0.1";
    boolean connect(String ipAddres);
    boolean payment(double price , String cardNumber,String date, String cvc );


}
