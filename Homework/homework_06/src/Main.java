public class Main {

    public static void main(String[] args) {

        int i = 11;
        float result;
        //float[] sum;
        aLotOfStars("java");
        nameFromColumn("Manchester");
        result = sumIncrease(3, 1000);
        i = summOfOddNum();
        sumOfDepPerMonth(3, 1000);
        sumOfDep(60, 1000);
        //System.out.println(i);
        //System.out.println(result);

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
   public static float sumIncrease(int month, float startSum) {

       float finalSum = startSum;
       int term = 12 - month;
       for (int i = 1; i <= term; i++){
           finalSum = finalSum + ((finalSum*2)/100);
       }
      System.out.println("Общий прирост суммы вклада до конца года: " + (finalSum - startSum));
      return (finalSum - startSum);
   }
    /* ---------------------------------------------------------------------------------------
    а) помесячный прирост суммы вклада за каждый месяц с 1-го марта до конца года;*/
    public static float[] sumOfDepPerMonth(int month, float startSum) {

        int term = 12 - month;
        float[] increaseSumPerMonth = new float[term];
        float finalSum = startSum;
        for (int i = 0; i < term; i++) {
            increaseSumPerMonth[i] = finalSum + ((finalSum * 2)/100);
            finalSum = increaseSumPerMonth[i];
            System.out.println("Прирост суммы вклада за " + (i+1) + " месяц: " + (finalSum - startSum));
        }
        return increaseSumPerMonth;
    }

    /*б) сумму вклада через: полгода, 2 года, 5 лет.*/
/* ------------------------------------------------------------------------------*/
    public static float[] sumOfDep(int countOfMonth, float startSum) {
        int i;
        float[] increaseSumPerMonth = new float[countOfMonth];
        float finalSum = startSum;
        for (i = 0; i < countOfMonth; i++) {
            increaseSumPerMonth[i] = finalSum + ((finalSum * 2)/100);
            finalSum = increaseSumPerMonth[i];
        }
        System.out.println("Сумма вклада через полгода: " + increaseSumPerMonth[5]);
        System.out.println("Сумма вклада через 2 года: " + increaseSumPerMonth[23]);
        System.out.println("Сумма вклада через 5 лет: " + increaseSumPerMonth[59]);
        return increaseSumPerMonth;
    }

    /* 5) Определить, войдет ли в конверт с внутренними размерами a и b мм прямоугольная открытка размером с и d мм.
    Для размещения открытки в конверте необходим зазор в 1 мм с каждой стороны.*/
    /*------------------------------------------------------------------------------------*/
    public static boolean envelope(int envelopeA, int envelopeB, int cardC, int cardD){
        if ((envelopeA-1) >= cardC && (envelopeB-1) >= cardD){
            return true;
        }
        return false;
    }
    /* 6) Даны два различных вещественных числа. Определить наибольшее из них применив
    один неполный условный оператор.*/
    /*------------------------------------------------------------------------------------*/
    public static float biggestNum(float num1, float num2) {
        if (num1 < num2) {
            return num2;
        }
        return num1;
    }
}
