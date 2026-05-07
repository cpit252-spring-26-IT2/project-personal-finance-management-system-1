package sa.edu.kau.fcit.cpit252.project;

public class InvestmentSubsystem {


    public void printAdvice(double balance, double monthlySalary, double monthlySavings) {
        System.out.println("\n--- Investment Recommendation ---");
        if (monthlySalary <= 0) {
            System.out.println("Please record your monthly salary to receive investment advice.");
            System.out.println("---------------------------------");
            return;
        }
        // Calculate investable surplus: balance after accounting for savings
        double investableSurplus = balance - monthlySavings;
        double surplusRatio = investableSurplus / monthlySalary;

        String riskLevel;
        String advice;

        if (investableSurplus <= 0 || surplusRatio < 0.1) {
            riskLevel = "Low Risk";
            advice = "Your current surplus is limited. Consider low-risk options such as "
                    + "government bonds or a high-yield savings account until your balance grows.";
        } else if (surplusRatio < 0.4) {
            riskLevel = "Medium Risk";
            advice = "You have a moderate surplus. Balanced mutual funds or diversified ETFs "
                    + "would suit your profile, offering growth with manageable risk.";
        } else {
            riskLevel = "High Risk (Growth)";
            advice = "You have a healthy surplus relative to your income. You may consider "
                    + "stocks, real estate investment trusts (REITs), or diversified equity funds "
                    + "for higher long-term returns.";
        }
        System.out.printf("Current Balance  : %.2f SAR%n", balance);
        System.out.printf("Monthly Salary   : %.2f SAR%n", monthlySalary);
        System.out.printf("Risk Level       : %s%n", riskLevel);
        System.out.printf("Advice           : %s%n", advice);
        System.out.println("---------------------------------");
    }
}
