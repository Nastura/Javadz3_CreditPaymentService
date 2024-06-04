public class Main {
    public static void main(String[] args) {


        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Ежемесячный платеж: " + service.calculate(1000000, 1));
        System.out.println();
        System.out.println("Ежемесячный платеж: " + service.calculate(1000000, 2));
        System.out.println();
        System.out.println("Ежемесячный платеж: " + service.calculate(1000000, 3));
        System.out.println();
    }
}