package fintech.model;

/**
 * Kelas untuk menyimpan informasi akun.
 */
public class Account {
    private String owner;
    private String accountname;
    private double balance;

    // Konstruktor
    public Account(String owner, String accountname, double balance) {
        this.owner = owner;
        this.accountname = accountname;
        this.balance = balance;
    }

    // Metode untuk mendapatkan saldo
    public double getBalance() {
        return balance;
    }
    public String getAccountName() {
        return accountname;
    }

    @Override
    public String toString() {
        return accountname + "|" + owner + "|" + balance;
    }
}
