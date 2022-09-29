package topmail.kz;

public class LessonThird {
    public static void main(String[] args) {
        //income according compound interests
        int interestRate = 7;
        int dayInYear = 365;
        int averageDayInMonth = 30;
        int amountOfMoney = 2500000;

        double IncomePerMonth = ((amountOfMoney * interestRate) / 100 / dayInYear) * averageDayInMonth;
        System.out.println(IncomePerMonth);
    }
}
