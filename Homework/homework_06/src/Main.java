public class Main {

    public static void main(String[] args) {

        int i = 11;
        int j = 9;
        //isEven(i);
        aLotOfStars("jshdfklj");
        nameFromColumn("Manchester City");
        i = SummOfOddNum();
        System.out.println(i);

    }
/*  1) Дано слово. Добавить к нему в начале и конце столько звездочек, сколько букв в этом слове.*/

    public static void aLotOfStars(String word) {
        int i;
        int count = word.length();
        String resultWord="";
        for (int j = 0; j < 2; j++) {
            for (i = 0; i < count; i++) {
                resultWord = resultWord + '*';
            }
            i = 0;
            if (j == 0) {
                resultWord = resultWord + word;
            }
        }
        System.out.println(resultWord);
    }
 /*  2) Дано название футбольного клуба. Напечатать его на экране "столбиком".*/

    public static void nameFromColumn(String nameTeam) {
        int k;
        int count = nameTeam.length();
        char[] resultName = new char[count];

        for (k = 0; k < count; k++) {
            //resultName[k] = nameTeam.charAt(k);
            //System.out.printf(resultName[k]+"\n");
            System.out.println(nameTeam.charAt(k));
        }
    }
    /* 3) Найти сумму положительных нечетных чисел, меньших 50.*/

    public static int SummOfOddNum() {
        int result = 0;
        for(int k = 50; k > 0; k--) {
            if (k%2 == 1){
                result = result + k;
            }
        }
        return result;
    }

   /* 4) Вася открыл счет в банке 1 марта, вложив 1000 грн. Через каждый месяц размер вклада увеличивается на 2% от имеющейся суммы. Определить:
    а) прирост суммы вклада за каждый месяц с 1-го марта до конца года;
    б) сумму вклада через: полгода, 2 года, 5 лет.*/
   /* ------------------------------------------------------------------------
    а) прирост суммы вклада за каждый месяц с 1-го марта до конца года;*/
   public static int sumOfDeposite(int day, int year, String month) {
       int i;
       int count = word.length();
       String resultWord="";
       for (int j = 0; j < 2; j++) {
           for (i = 0; i < count; i++) {
               resultWord = resultWord + '*';
           }
           i = 0;
           if (j == 0) {
               resultWord = resultWord + word;
           }
       }
       System.out.println(resultWord);
   }




}

