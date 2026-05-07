package sa.edu.kau.fcit.cpit252.project;
import java.util.List;
public class TransactionHistorySubsystem {

    public void printHistory(List<Transaction> transactions) {
        System.out.println("\n--- Transaction History ---");
        if (transactions.isEmpty()) {
            System.out.println("No transactions recorded yet.");
        } else {
            for (Transaction t : transactions) {
                System.out.printf("[%s] %-10s | %8.2f SAR | %s%n",
                        t.getDateTime().toLocalDate(),
                        t.getType(),
                        t.getAmount(),
                        t.getDescription());
            }
        }
        System.out.println("---------------------------");
    }

}
