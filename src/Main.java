import java.time.LocalDate;

public class Main {
    public static void checkLeap(int year) {//Задание 1.
        if (year % 4 == 0) {
            System.out.println("високосный год - " + year);
        } else System.out.println("невисокосный год - " + year);
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
        checkLeap(2022);
        checkDeviceYear(1,2018);
        short deliveryTime = checkDeleviryTime(141);
            System.out.println("Потребуется дней: " + deliveryTime);
        }
}