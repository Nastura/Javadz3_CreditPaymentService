public class CreditPaymentService {

    // Аннуитетный платёж = Сумма кредита × Коэффициент аннуитета;
    // Amount of credit - сумма кредита
    // Credit term in years - Срок кредита в годах.
    // Credit term in months - Срок кредита в месяцах.
    // Interest rate in years - процентная ставка в год.
    // Interest rate in months - процентная ставка в год.
    // Annuity payment - Аннуитетный платеж.


    public int calculate(int amountOfCredit, int creditTermInYears) {
        int creditTermInMonths = creditTermInYears * 12;
        double interestRateInYears = 9.99;
        double interestRateInMonths = interestRateInYears / 100 / 12;
        double сoefficient = (interestRateInMonths * Math.pow((1 + interestRateInMonths), creditTermInMonths) / (Math.pow((1 + interestRateInMonths), creditTermInMonths) - 1));
        int annuityPayment = (int) (amountOfCredit * сoefficient);


        return annuityPayment;
    }

}
