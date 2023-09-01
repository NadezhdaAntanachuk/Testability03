public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000;
        float percent = 9.99F;
        for (int ppInYear = 1; ppInYear < 4; ppInYear++) {
            double pl = service.calculate(sum, percent, ppInYear * 12);
            System.out.println("Сумма кредита: " + sum);
            System.out.println("Срок кредита, лет: " + ppInYear);
            System.out.println("Ежемесячный платеж: " + (int) pl + " руб.\n");
        }
    }
}