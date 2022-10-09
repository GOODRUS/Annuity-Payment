public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1_000_000; // Сумма кредита
        int map = service.calculate(loanAmount);
        System.out.println(map + " рублей ваш ежемесячный платёж");
    }
}
