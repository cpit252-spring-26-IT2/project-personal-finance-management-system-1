package sa.edu.kau.fcit.cpit252.project;

final public class ExpenseFactory implements TransactionFactory {
    @Override
    public Transaction createTransaction(double amount, String description) {
        return new Expense(amount, description);
    }
}
