package fintech.driver;

import fintech.model.Account;
import fintech.model.Transaction;
import java.util.Scanner;

/**
 * 12S23019 - Clarasia Simanjuntak
 * 12S23043 - Grace Tiodora
 */
public class Driver2 {
    public static void main(String[] _args) {
        Scanner sc = new Scanner(System.in);

        // Membaca perintah pertama (harus create-account)
        String command1 = sc.nextLine();

        if (command1.equals("create-account")) {
            String owner = sc.nextLine();
            String accountname = sc.nextLine();
            Account account = new Account(owner, accountname, 0.0);

            // Membaca perintah kedua (harus create-transaction)
            String command2 = sc.nextLine();

            if (command2.equals("create-transaction")) {
                String accName = sc.nextLine();
                double amount = Double.parseDouble(sc.nextLine());
                String postedAt = sc.nextLine();
                String note = sc.nextLine();

                // Membuat transaksi
                Transaction transaction = new Transaction(accName, amount, postedAt, note);
                
                // Cetak hasil sesuai format yang diinginkan
                System.out.println(account.toString());
                System.out.println(transaction.toString());
            }
        }

        sc.close();
    }
}
