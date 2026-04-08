package sa.edu.kau.fcit.cpit252.project;

final public class Income extends Transaction{
    public Income(double amount, String description) {
        super(amount, description);
    }

    @Override
    public String getType() {
        return "Income";
    }
}
