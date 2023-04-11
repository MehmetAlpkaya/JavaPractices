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
        return false;
    }

    @Override
    public boolean peyment(double price, String cardNumber, String date, String cvc) {
        return false;
    }
}
