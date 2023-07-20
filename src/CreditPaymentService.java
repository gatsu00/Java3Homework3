public class CreditPaymentService {
    public double calculate(double loanAmount, int loanTerm, double interestRate) {
        double monthlyInterestRate = interestRate / 100 / 12;
        double monthlyPayment = loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanTerm) / (Math.pow(1 + monthlyInterestRate, loanTerm) - 1);
        return monthlyPayment;
    }
}
