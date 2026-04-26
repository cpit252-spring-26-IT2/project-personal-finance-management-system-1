package sa.edu.kau.fcit.cpit252.project;

public class App {
    public static void main(String[] args)
    {
        // The client only interacts with the PersonalFinanceManager.
        // They do not need to manually handle the subsystems or the factories.
        PersonalFinanceManagement app = new PersonalFinanceManagement();

        app.addIncome(6000, "Monthly Salary");
        app.addIncome(450, "gift");
        app.addExpense(1200, "Rent");
        app.addExpense(150, "Groceries");

        app.viewDashboard();
    }
}