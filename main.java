public class Main {
    public static void main(String[] args) {
        // Переменная стоимости билета
        int priceOfTicket = 13_676;

        // Переменная количества рублей одной бонусной мили
        int rublesBonus = 20;

        //Расчет количества бонусных миль
        int bonusMiles = priceOfTicket / rublesBonus;

        // Результат
        System.out.println("Количество начисленных миль: " + bonusMiles);

    }
}