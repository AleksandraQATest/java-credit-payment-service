public class CreditPaymentService {
    public double calculate(double amount, double annualRate, int years) {
        double monthlyRate = annualRate / 100 / 12;
        int months = years * 12;

        double coefficient = Math.pow(1 + monthlyRate, months);
        double payment = amount * monthlyRate * coefficient / (coefficient - 1);

        return payment;
    }
}