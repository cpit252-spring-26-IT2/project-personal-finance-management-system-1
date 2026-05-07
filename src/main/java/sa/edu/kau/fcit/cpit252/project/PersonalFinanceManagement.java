package sa.edu.kau.fcit.cpit252.project;

// This class acts as the Facade, simplifying the interactions for the client.
public class PersonalFinanceManagement {
    private AccountSubsystem account;
    private TransactionFactory incomeFactory;
    private TransactionFactory expenseFactory;
    private TransactionHistorySubsystem history;
    private SavingsSubsystem savings;
    private InvestmentSubsystem investment;

    public PersonalFinanceManagement() {
        this.account = new AccountSubsystem();
        this.incomeFactory = new IncomeFactory();
        this.expenseFactory = new ExpenseFactory();
        this.history = new TransactionHistorySubsystem();
        this.savings = new SavingsSubsystem();
        this.investment = new InvestmentSubsystem();
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

    public void addSalary(double amount, String description)
    {
        Transaction income = incomeFactory.createTransaction(amount, description);
        account.addTransaction(income);
        account.setMonthlySalary(amount);
        System.out.println("Recorded Salary : " + amount + " SAR (" + description + ")");
    }

    public void setSavingsGoal(double targetAmount, int durationMonths) {
        savings.setSavingsGoal(targetAmount, durationMonths, account.getMonthlySalary());
        System.out.println("\n=== Savings Goal ===");
        System.out.println("Savings goal: " + targetAmount + " SAR during " + durationMonths + " months.");
    }

    public void viewDashboard() {
        double balance = account.getBalance();
        double salary = account.getMonthlySalary();
        double monthlySaving = savings.isGoalSet() ? savings.getMonthlySavings() : 0.0;

        System.out.println("\n=== Your Financial Dashboard ===");
        System.out.println("Current Available Balance: $" + balance);
        System.out.println("================================\n");

        history.printHistory(account.getTransactions());
        savings.printSavingsPlan(salary);
        investment.printAdvice(balance, salary, monthlySaving);
    }
}