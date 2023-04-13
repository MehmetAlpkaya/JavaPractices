package OOP.Interface;

public class bBank implements IBank
{
    private String bankName;
    private String terminalId;
    private String password;

    public bBank(String bankName, String terminalId, String password) {
        this.bankName = bankName;
        this.terminalId = terminalId;
        this.password = password;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddres) {
        System.out.println("User ip :"+ ipAddres);
        System.out.println("Host ip :"+ this.hostIpAddres);
        System.out.println(this.bankName+" connected!");
        return false;
    }

    @Override
    public boolean payment(double price, String cardNumber, String date, String cvc) {
        System.out.println("Awaiting a reply from the bank");
        System.out.println("The transaction was successful");
        return false;
    }
}
