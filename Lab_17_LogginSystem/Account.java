public class Account{
    private String accountNumber ;
    private String password;

    public Account(String account, String password){
        this.accountNumber = account;
        this.password = password;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
}