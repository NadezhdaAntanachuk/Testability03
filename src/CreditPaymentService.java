public class CreditPaymentService {
    public double calculate(int sum, float percent, int pp) {
        // Реп = Кредит * ПС / (1 - (1 + ПС)^(-ПП))), ПС = percent / (100 * 12)
        // Переменные sum: Кредит, persent: процентная ставка, pp: ПП (платежный период)
        double ps = percent / 100 / 12;
        double result = sum  * ps / (1 - Math.pow((1 + ps),(-pp)));
        return result;
    }
}
