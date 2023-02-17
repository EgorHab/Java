package lesson1;

public class MainForLessonOne {
    public static void main(String[] args) {
        printThreeWords();
        //checkSumSign();
        //printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
      System.out.println("Orange");
      System.out.println("Banana");
      System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = -9;
        int b = 5;
        String result;
        result = (a+b)>=0 ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(result);
    }
    public static void printColor() {
        int value = 1001;
        String result = null;
        if (value<=0) result = "Красный";
        if (value >0&& value<=100) result ="Желтый";
        if (value>100) result = "Зеленый";
        System.out.println(result);
    }
    public static void compareNumbers() {
        int a = 3;
        int b = 5;
        String result;
        result = (a>=b) ? "a>=b" : "a<b";
        System.out.println(result);
    }
}
