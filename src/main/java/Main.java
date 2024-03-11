import ru.netology.sqr.MonthsOfRest;

public class Main {
    public static void main(String[] args) {
        MonthsOfRest service = new MonthsOfRest();
        System.out.println(service.monthsOfRest(100_000, 60_000, 150_000));
        System.out.println(service.monthsOfRest(10_000, 3_000, 20_000));
    }
}