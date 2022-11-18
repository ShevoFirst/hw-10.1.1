import java.time.LocalDate;

public class Main {
    public static void checkLeap() {//Задание 1.
        int currentYear = LocalDate.now().getYear();
        if ((currentYear % 4 == 0 && currentYear % 100 != 0) || currentYear % 400 == 0) {
            System.out.println("високосный год - " + currentYear);
        } else System.out.println("невисокосный год - " + currentYear);
    }

    public static void checkDeviceYear(int clientOs, int clientDeviceYear) {//Задание 2.
        int currentYear = LocalDate.now().getYear();
        switch (clientOs) {
            case 0:
                if (clientDeviceYear < currentYear) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else
                    System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 1:
                if (clientDeviceYear < currentYear) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else
                    System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("не удалось определить операционную систему");
        }
    }

    public static short checkDeleviryTime(int deliveryDistance ){
        short deliveryTime;
        if (deliveryDistance <20) {
            deliveryTime=1;
        }else
            deliveryTime = (short) (deliveryDistance/40+1);
            deliveryTime++;
        return deliveryTime;
    }

        public static void main(String[] args) {
        checkLeap();
        checkDeviceYear(1,2018);
        short deliveryTime = checkDeleviryTime(141);
        System.out.println("Потребуется дней: " + deliveryTime);
        }
}