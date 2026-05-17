package sa.edu.kau.fcit.cpit252.project;
import java.util.ArrayList;
import java.util.List;

class AccountSubsystem implements Subject {
    private List<Transaction> transactions = new ArrayList<>();
    private double balance = 0.0;
    private double monthlySalary = 0.0;
    private List<FinanceObserver> observers = new ArrayList<>();

    public void addTransaction(Transaction t) {
        transactions.add(t);
        if(t.getType().equals("Income")) {
            balance += t.getAmount();
        } else {
            balance -= t.getAmount();
        }
        notifyObservers(t);
    }
    public void setMonthlySalary(double salary) {
        this.monthlySalary = salary;
    }

    public double getMonthlySalary()
    {
        return monthlySalary;
    }
    public double getBalance() {
        return balance;
    }
    public List<Transaction> getTransactions() { return transactions; }

    @Override
    public void addObserver(FinanceObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(FinanceObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Transaction transaction) {
        for (FinanceObserver observer : observers) {
            observer.update(transaction, balance);
        }
    }
}