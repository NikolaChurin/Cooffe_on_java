package PavelDz.Dz2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Guest guest = new Guest(0, "Гость 1");
        Kuhnya kuhnya = new Kuhnya();
        Zakaz zakaz = new Zakaz();
        int summZakaz = 0;
        int nZakaza = 0;
        String[] finishName = new String[5];
        System.out.println("Введите ваше имя");
        guest.setName(sc.nextLine());
        System.out.println("Введите ваш баланс");
        guest.setBalance(sc.nextInt());
        sc.nextLine();
        System.out.println("Выберите кухню. У нас есть : " + kuhnya.getNamekuhnya());
        zakaz = kuhnya.createZakaz(sc.nextLine());
        for (int i = 1; i < 5; i++) {
            System.out.println(zakaz.getMenu(i) + " рублей. Заказываем?(да/нет)");
            if (sc.nextLine().equals("да")) {                                     //Если да
                if (guest.sdacha(summZakaz + zakaz.getPriceEat(i)) < 0) {
                    System.out.println("У вас недостаточно средств");
                } else {
                    summZakaz = summZakaz + zakaz.getPriceEat(i);
                    nZakaza++;
                    finishName[nZakaza - 1] = zakaz.getMenu(i);
                }
            }
        }
        if (nZakaza != 0) {
            System.out.println("Спасибо за ваш заказ! "+guest.getName());
            System.out.println("Ваш заказ:");
            for (int i = 1; i <= nZakaza; i++) {
                System.out.println(finishName[i-1]);
            }
            System.out.println("Сумма вашего заказа: " + summZakaz);
            System.out.println("Оставшаяся сумма на балансе: " + guest.sdacha(summZakaz));
        } else System.out.println("Вы ни чего не заказали!");
    }
}
