import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");

        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else  {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2
        System.out.println("Задание 2");

        int clientDeviceYear = 2014;

        if (clientOS==0)
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
                else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");}
         else
            if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");}
                else {
            System.out.println("Установите обычную версию приложения для Android по ссылке");}


                // Задание 3
        System.out.println("Задание 3");
        int year = 100;

        if (year %4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " явлется высокостным годом");
        }
        else {
            System.out.println(year + " явлется невысокостным годом");
        }
        // Задание 4
        System.out.println("Задание 4");

        int deliveryDistance = 27;

        int deliveryDays = 1;

        if (deliveryDistance > 20){
            deliveryDays++;
            System.out.println(deliveryDays + " дня необходимо для доставки");
        }
        if (deliveryDistance > 40){
            deliveryDays++;
            System.out.println(deliveryDays + " дня необходимо для доставки");
        }
        if (deliveryDistance > 60){
            deliveryDays++;
            System.out.println(deliveryDays + " дня необходимо для доставки");
        }
        // Задание 5
        System.out.println("Задание 5");

        int monthNumber = 3;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Данный месяц зимы");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Данный месяц весны");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Данный месяц лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Данный месяц осени");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
        }













    }




