public class CreditPaymentService {
    public int calculate(int credit, double percent, int numberOfMonths) {

        double percentageRate;
        percentageRate = percent / (100 * 12);
        double payment;
        payment = credit * (percentageRate / (1 - Math.pow((1 + percentageRate), -numberOfMonths)));
        return (int) payment;
    }
}
