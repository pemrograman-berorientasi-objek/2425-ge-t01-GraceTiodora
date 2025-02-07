package fintech.model;

/**
 * Kelas untuk menyimpan informasi transaksi.
 */
public class Transaction {
    private static int transactionCounter = 0; // Counter ID transaksi

    private int id;
    private String accountName;
    private double amount;
    private String postedAt;
    private String note;

    public Transaction(String accountName, double amount, String postedAt, String note) {
        this.id = ++transactionCounter; // ID otomatis bertambah
        this.accountName = accountName;
        this.amount = amount;
        this.postedAt = postedAt;
        this.note = (note.length() > 40) ? note.substring(0, 40) : note; // Batas 40 karakter
    }

    @Override
    public String toString() {
        return id + "|" + accountName + "|" + amount + "|" + postedAt + "|" + note + "|" + amount;
    }
}
