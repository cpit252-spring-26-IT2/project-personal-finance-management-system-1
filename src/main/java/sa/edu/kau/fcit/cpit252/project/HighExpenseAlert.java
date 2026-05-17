package sa.edu.kau.fcit.cpit252.project;

public class  HighExpenseAlert implements FinanceObserver {
    private double totalExpenses = 0.0;

    @Override
    public void update(Transaction transaction, double monthlySalary) {

        double expenseLimit = 3000.0;

        if (transaction.getType().equals("Expense")) {

            totalExpenses += transaction.getAmount();

            if (totalExpenses > expenseLimit) {
                System.out.println("***ALERT*** : You just spent "
                        + transaction.getAmount() + " SAR on '" + transaction.getDescription() + "'.");
                System.out.println("   -> Your total expenses (" + totalExpenses
                        + " SAR) have now exceeded (" + expenseLimit + " SAR).");
            }
        }
    }
}