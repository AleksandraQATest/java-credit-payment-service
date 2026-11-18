public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double payment1 = service.calculate(1_000_000, 9.99, 1);
        double payment2 = service.calculate(1_000_000, 9.99, 2);
        double payment3 = service.calculate(1_000_000, 9.99, 3);

        System.out.println(payment1);
        System.out.println(payment2);
        System.out.println(payment3);
    }
}