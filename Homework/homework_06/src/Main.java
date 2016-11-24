public class Main {

    public static void main(String[] args) {

        int i = 11;
        float result;
        //isEven(i);
        aLotOfStars("jshdfklj");
        nameFromColumn("Manchester City");
        result = sumOfDepositeAll(3, 1000);
        i = summOfOddNum();
        System.out.println(i);
        System.out.println(result);

    }
/*  1) Дано слово. Добавить к нему в начале и конце столько звездочек, сколько букв в этом слове.*/

    public static void aLotOfStars(String word) {
        int count = word.length();
        String resultWord="";
        int i, j;
        for (j = 0; j < 2; j++) {
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

    public static int summOfOddNum() {
        int result = 0;
        for(int k = 50; k > 0; k--) {
            if (k%2 == 1){
                result = result + k;
            }
        }
        return result;
    }

   /* 4) Вася открыл счет в банке 1 марта, вложив 1000 грн. Через каждый месяц размер вклада увеличивается на 2% от
   имеющейся суммы. Определить:
    а) прирост суммы вклада за каждый месяц с 1-го марта до конца года;
    б) сумму вклада через: полгода, 2 года, 5 лет.*/
   /* -----------------------------------------------------------------------------------------
    а) общий прирост суммы вклада за каждый месяц с 1-го марта до конца года;*/
   public static float sumOfDepositeAll(int month, float startSum) {

       float finalSum = startSum;
       for (int i = 0; i < (12-month); i++){
           finalSum = finalSum + ((finalSum*2)/100);
       }
      return (finalSum - startSum);
   }
    /* ---------------------------------------------------------------------------------------
    а) помесячный прирост суммы вклада за каждый месяц с 1-го марта до конца года;*/
    public static float[] sumOfDepositePerMonth(int month, float startSum) {

        float[] increaseSumPerMonth = new float[12 - month];
        float finalSum = startSum;
        for (int i = 1; i <= (12 - month); i++) {
            increaseSumPerMonth[i] = startSum + ((startSum * 2) / 100);
            startSum = increaseSumPerMonth[i];
        }
        return increaseSumPerMonth;
    }

    /*б) сумму вклада через: полгода, 2 года, 5 лет.*/
    public static float sumOfDeposite(int month, int termPerMonth, float startSum) {

        float[] increaseSumPerMonth = new float [termPerMonth];
        float finalSum = startSum;
        for (int i = 0; i < termPerMonth; i++){
            finalSum = finalSum + ((finalSum*2)/100);
        }
        return (finalSum - startSum);
    }
/* ------------------------------------------------------------------------------*/

}

