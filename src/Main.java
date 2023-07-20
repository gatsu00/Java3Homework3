public class Main {
    public static void main(String[] args) {
        CreditPaymentService calculator = new CreditPaymentService();

        double loanAmount = 500000; // сумма кредита
        int loanTerm = 36; // срок кредита в месяцах
        double interestRate = 10; // процентная ставка

        double monthlyPayment = calculator.calculate(loanAmount, loanTerm, interestRate);

        System.out.println("Ежемесячный платеж: " + monthlyPayment);
    }
}