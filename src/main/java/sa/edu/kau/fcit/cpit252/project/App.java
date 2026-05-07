package sa.edu.kau.fcit.cpit252.project;

public class App {
    public static void main(String[] args)
    {
        // Clients do not need to manually handle the subsystems or the factories.
        // Singleton Pattern
        PersonalFinanceManagement app = PersonalFinanceManagement.getInstance();

        app.addSalary(6000, "Monthly Salary");
        app.addIncome(450, "gift");
        app.addExpense(1200, "Rent");
        app.addExpense(150, "Groceries");

        app.setSavingsGoal(15000, 6);



        app.viewDashboard();
    }
}