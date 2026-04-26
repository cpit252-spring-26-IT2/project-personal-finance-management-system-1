package sa.edu.kau.fcit.cpit252.project;

// This class acts as the Facade, simplifying the interactions for the client.
public class PersonalFinanceManagement {
    private AccountSubsystem account;
    private TransactionFactory incomeFactory;
    private TransactionFactory expenseFactory;

    public PersonalFinanceManagement() {
        this.account = new AccountSubsystem();
        this.incomeFactory = new IncomeFactory();
        this.expenseFactory = new ExpenseFactory();
    }

    public void addIncome(double amount, String description) {
        Transaction income = incomeFactory.createTransaction(amount, description);
        account.addTransaction(income);
        System.out.println("Recorded Income: " + amount + " SAR (" + description + ")");

        // The subsystem logic happens automatically behind the scenes
    }

    public void addExpense(double amount, String description) {
        Transaction expense = expenseFactory.createTransaction(amount, description);
        account.addTransaction(expense);
        System.out.println("Recorded Expense: " + amount + " SAR (" + description + ")");
    }

    public void viewDashboard() {
        double balance = account.getBalance();
        System.out.println("\n=== Your Financial Dashboard ===");
        System.out.println("Current Available Balance: $" + balance);
        System.out.println("================================\n");
    }
}