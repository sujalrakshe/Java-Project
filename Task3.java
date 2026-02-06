import java.util.ArrayList;
import java.util.Scanner;

/* ---------- Parent Class ---------- */
class Bank {
    protected double balance;
    protected ArrayList<String> transactions = new ArrayList<>();

    void openAccount(double open) {
        balance = open;
        transactions.add("Account opened with balance: " + balance);
        System.out.println("Opening Balance = " + balance);
    }
}

/* ---------- Credit Class ---------- */
class Credit extends Bank {
    void credit(double creditAmt) {
        if (creditAmt <= 0) {
            System.out.println("Invalid Credit Amount");
            return;
        }
        balance += creditAmt;
        transactions.add("Credited: " + creditAmt);
        System.out.println("After Credit Balance = " + balance);
    }
}

/* ---------- Debit Class ---------- */
class Debit extends Credit {
    void debit(double debitAmt) {
        if (debitAmt <= 0) {
            System.out.println("Invalid Debit Amount");
        } else if (debitAmt > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= debitAmt;
            transactions.add("Debited: " + debitAmt);
            System.out.println("After Debit Balance = " + balance);
        }
    }

    void showTransactions() {
        System.out.println("\n--- Transaction History ---");
        for (String t : transactions) {
            System.out.println(t);
        }
    }
}

/* ---------- Main Class ---------- */
public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Debit d = new Debit();

        System.out.print("Enter Opening Balance: ");
        d.openAccount(sc.nextDouble());

        System.out.print("Enter Credit Amount: ");
        d.credit(sc.nextDouble());

        System.out.print("Enter Debit Amount: ");
        d.debit(sc.nextDouble());

        d.showTransactions();

        sc.close();
    }
}
