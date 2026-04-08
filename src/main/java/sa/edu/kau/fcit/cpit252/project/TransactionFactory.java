package sa.edu.kau.fcit.cpit252.project;

//Factory Method Pattern
interface TransactionFactory {
    Transaction createTransaction(double amount, String description);

}
