import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Привіт, відважний герою!");
        System.out.println("На тебе чекає цікава подорож!");
        int health = 100;
        int luck = 50;
        //1подія
        System.out.println("Ти йшов чарівною стежкою і натрапив на роздоріжжя: 1 - стара стежка, 2 - нова стежка");
        System.out.print(">");// Таким чином можна отримати цифру яку ввів користувач
        // і зберегти її в змінну типу int
        int choice1 = sc.nextInt();
        if (choice1 == 1) {
            System.out.println("Ти проходиш старою стежкою і втрачаєш 20 поінтів здоров’я!");
            health -= 20;// відняти очки здоров*я
        } else if (choice1 == 2) {
            System.out.println("Везунчику, ти знайшов скарб і отримуєш 30 поінтів удачі!");
            luck += 30;// додати очки удачі
        } else {
            System.out.println("Халепа! Ти заплутався і встрачаєш 10 поінтів здоров'я");
            health -= 10;// відняти очки здоров*я
        }
        //2подія
        System.out.println("Рушаємо далі!");
        System.out.println("WOW! Ти натрапив на загадковий колодязь. Що зробиш?");
        System.out.println("1 - Вип'ю чаріної води");
        System.out.println("2 - Не дуже хочеться пити невідому воду");
        System.out.print(">");
        int choice2 = sc.nextInt();

        if (choice2 == 1) {
            System.out.println("Хто ризикує і п'є з колодязя... Тому магічна вода подарує 50 поінітв здоров’я.");
            health += 50;
        } else if (choice2 == 2) {
            System.out.println("Ти втомився, а вода сама себе не вип'є..тому втрачаєш 50 поінтів удачі.");
            luck -= 50;
        } else {
            System.out.println("Нічого не змінилося.");
        }
        //3подія
        System.out.println("Подивись, ти зустрів чарівну істоту! Яка вона?");
        System.out.println("1 - Дружня");
        System.out.println("2 - Ворожа");
        System.out.println("3 - Байдужа");
        System.out.print(">");


        int animalType = sc.nextInt();

        switch (animalType) {
            case 1:
                System.out.println("Істота дружня! Вона поділилася їжею. +20 поінтів до здоров’я.");
                health += 20;
                break;
            case 2:
                System.out.println("Істота ворожа і атакує! Ви втратили 30 поінтів здоров’я.");
                health -= 30;
                break;
            case 3:
                System.out.println("Істота байдужа. Нічого не сталося.");
                break;
        }
        System.out.println(" ");
        if (health <= 0 || luck <= 0) {
            System.out.println("Ви не змогли пройти ліс... Спробуйте ще раз!");
        } else {
            System.out.println("Вітаємо! Ви змогли пройти через чарівний ліс!");
        }
        sc.close();
        System.out.println("\n[КІНЕЦЬ!]");
    }
}
