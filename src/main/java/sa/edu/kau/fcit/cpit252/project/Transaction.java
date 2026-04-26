package sa.edu.kau.fcit.cpit252.project;
import java.util.*;
import java.time.LocalDateTime;


abstract class Transaction  {

    private final double amount;
    private final String description;
    private final LocalDateTime dateTime;


    protected Transaction(double amount, String description) {
        validateAmount(amount);
        this.amount = amount;
        this.description = description == null ? "" : description.trim();
        this.dateTime = LocalDateTime.now();
    }

    private void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0.");
        }
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public abstract String getType();


}
