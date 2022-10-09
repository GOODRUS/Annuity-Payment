public class CreditPaymentService {
    public int calculate(int loan) {
        double rate = 9.99; // Ежегодная ставка
        int month = 12; // На сколько лет берётся кредит, указано в месяцах
        double loanRate = rate / 12 / 100; // Ставка по кредиту в месяц
        double annuityRatio = (loanRate * Math.pow(1 + loanRate, month)) / (Math.pow(1 + loanRate, month) - 1); // Коэффициент аннуитета
        int map = (int) Math.round(annuityRatio * loan); // Ежемесячный аннуитетный платёж
        return map;
    }
}