public class Main {

    public static void main(String[] args) {

        float[] usd = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int grade[] = {3, 5, 2, 5, 5, 5, 5, 2, 3, 5, 3};
        int numbers[] = {0, 5, 2, 5, 5, 5, 5, 2, 3, 5, 3, 15, 15, 16, 25, 20, 405, 455};
        daysOfMonth(2, args);
        playingCards(1, 8);

    }

    /* Составить программу, которая в зависимости от порядкового номера месяца (1, 2, ..., 12) выводит
    на экран количество дней в этом месяце. Рассмотреть два случая:
        1) год не является високосным;
        2) год может быть високосным (информация об этом вводится в аргументы при запуске программы).*/
    /*-----------------------------------------------------------------------------------------*/
    public static void daysOfMonth(int month, String[] args) {
        int year = Integer.valueOf(args[0]);
        switch (month) {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                System.out.println("31");
                break;
            case 2:
                if (year % 4 == 0) {
                    System.out.println("Февраль высокосного года " + year + " 29 дней");
                } else {
                    System.out.println("28");
                }
                break;
            case 4:case 6:case 9:case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("неверные данные");
                break;
        }
    }
    /*2) Мастям игральных карт условно присвоены следующие порядковые номера: масти "пики" — 1, масти "трефы" — 2,
    масти "бубны" — 3, масти "червы" — 4, а достоинству карт: "валету" — 11, "даме" — 12, "королю" — 13,
    "тузу" — 14 (порядковые номера карт остальных достоинств соответствуют их названиям: "шестерка",
    "девятка" и т. п.). По заданным номеру масти m (1 <= m <=  4) и номеру достоинства карты k (6 <= k <= 14)
    определить полное название (масть и достоинство) соответствующей карты в виде "Дама пик", "Шестерка бубен" и т. п.*/
    public static void playingCards(int suitCard, int valueCard) {
        String fullNameOfCard = "";
        switch (valueCard) {
            case 6:
                fullNameOfCard = fullNameOfCard + "Шестерка ";
                break;
            case 7:
                fullNameOfCard = fullNameOfCard + "Семерка ";
                break;
            case 8:
                fullNameOfCard = fullNameOfCard + "Восьмерка ";
                break;
            case 9:
                fullNameOfCard = fullNameOfCard + "Девятка ";
                break;
            case 10:
                fullNameOfCard = fullNameOfCard + "Десятка ";
                break;
            case 11:
                fullNameOfCard = fullNameOfCard + "Валет ";
                break;
            case 12:
                fullNameOfCard = fullNameOfCard + "Дама ";
                break;
            case 13:
                fullNameOfCard = fullNameOfCard + "Король ";
                break;
            case 14:
                fullNameOfCard = fullNameOfCard + "Туз ";
                break;
            default:
                System.out.println("Нет такой карты ");
                break;
        }
        switch (suitCard) {
            case 1:
                fullNameOfCard = fullNameOfCard + "пик";
                break;
            case 2:
                fullNameOfCard = fullNameOfCard + "треф";
                break;
            case 3:
                fullNameOfCard = fullNameOfCard + "бубен";
                break;
            case 4:
                fullNameOfCard = fullNameOfCard + "червей";
                break;
            default:
                System.out.println("Нет такой масти");
                break;
        }
        System.out.println(fullNameOfCard);
    }



}