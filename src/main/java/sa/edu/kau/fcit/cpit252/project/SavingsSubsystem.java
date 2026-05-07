package sa.edu.kau.fcit.cpit252.project;

class SavingsSubsystem {
    private double targetAmount = 0.0;
    private int durationMonths = 0;
    private double monthlySavings = 0.0;
    private boolean goalSet = false;

    public void setSavingsGoal(double targetAmount, int durationMonths, double monthlySalary) {
        if (targetAmount <= 0) throw new IllegalArgumentException("Target amount must be greater than 0.");
        if (durationMonths <= 0) throw new IllegalArgumentException("Duration must be at least 1 month.");
        if (monthlySalary <= 0) throw new IllegalArgumentException("Monthly salary must be set before defining a savings goal.");

        this.targetAmount = targetAmount;
        this.durationMonths = durationMonths;
        this.monthlySavings = targetAmount / durationMonths;
        this.goalSet = true;
    }

    public void printSavingsPlan(double monthlySalary) {
        if (!goalSet) {
            System.out.println("No savings goal set.");
            return;
        }
        double percentage = (monthlySavings / monthlySalary) * 100;
        System.out.println("\n--- Savings Plan ---");
        System.out.printf("Target Amount   : %.2f SAR%n", targetAmount);
        System.out.printf("Duration        : %d months%n", durationMonths);
        System.out.printf("Monthly Savings : %.2f SAR (%.1f%% of salary)%n", monthlySavings, percentage);
        System.out.println("--------------------");
    }

    public double getMonthlySavings() { return monthlySavings; }
    public boolean isGoalSet() { return goalSet; }
}