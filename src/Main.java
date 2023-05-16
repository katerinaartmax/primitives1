public class Main {
    public static void main(String[] args) {

        // Объявляем переменную для хранения стоимости билета
        double ticketCost = 125_000;

        // Объявляем переменную для хранения количества рублей для одной бонусной мили
        int milesPerDollar = 20;

        // Рассчитываем количество бонусных миль
        int miles = (int) (ticketCost / milesPerDollar);

        // Выводим результат на экран
        System.out.println("Количество бонусных миль: " + miles);
    }
}