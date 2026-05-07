package sa.edu.kau.fcit.cpit252.project;
import java.util.ArrayList;
import java.util.List;

class AccountSubsystem {
    private List<Transaction> transactions = new ArrayList<>();
    private double balance = 0.0;

    public void addTransaction(Transaction t) {
        transactions.add(t);
        if(t.getType().equals("Income")) {
            balance += t.getAmount();
        } else {
            balance -= t.getAmount();
        }
    }

    public double getBalance() {
        return balance;
    }
    public List<Transaction> getTransactions() { return transactions; }
}