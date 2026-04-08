package sa.edu.kau.fcit.cpit252.project;

final public class IncomeFactory implements TransactionFactory {
    @Override
    public Transaction createTransaction(double amount, String description) {
        return new Income(amount, description);
    }
}
