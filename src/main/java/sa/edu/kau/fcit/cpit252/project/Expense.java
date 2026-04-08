package sa.edu.kau.fcit.cpit252.project;

final public class Expense extends Transaction {
    public Expense(double amount, String description) {
        super(amount, description);
    }

    @Override
    public String getType() {
        return "Expense";
    }


}
