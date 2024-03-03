public class Main {
    public static void main(String[] args) {

        int initialAccountAmount = 100;// Объявляете переменные для входных данных и
        int amountCredited = 1100;// параметров программы: начального счёта,
        int finalAccountAmount;// суммы пополнения и тп
        int bonusRubles;

        if (amountCredited > 1000) {
            bonusRubles = amountCredited / 100 * 1;
            finalAccountAmount = initialAccountAmount + amountCredited + bonusRubles;
            System.out.println("Hello!");
            System.out.println("Your final account amount is: " + finalAccountAmount + " rubles");
            System.out.println("You received " + bonusRubles + " bonus rubles");
            System.out.println("Have a nice day!");
        } else {
            bonusRubles = 0;
            finalAccountAmount = initialAccountAmount + amountCredited;
            System.out.println("Hello!");
            System.out.println("Your final account amount is: " + finalAccountAmount + " rubles");
            System.out.println("You received " + bonusRubles + " bonus rubles");
            System.out.println("Have a nice day!");
            // Условным оператором проверяете, превысила ли
        }
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
