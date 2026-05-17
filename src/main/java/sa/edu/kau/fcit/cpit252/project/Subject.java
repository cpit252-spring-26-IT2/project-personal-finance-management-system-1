package sa.edu.kau.fcit.cpit252.project;

public interface Subject {

    void addObserver(FinanceObserver observer);
    void removeObserver(FinanceObserver observer);
    void notifyObservers(Transaction transaction);

}
