import ru.netology.sqr.SqrtService;

public class Main {
    public static void main(String[] args) {
        SqrtService service = new SqrtService();
        int result = service.calculateSqrtService(10,99);
        System.out.println("Количество квадратных корней в диапазоне от 10 до 99 составляет: " + result);
    }
}