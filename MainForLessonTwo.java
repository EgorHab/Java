package lesson1;

public class MainForLessonTwo {
    public static void main(String[] args) {
        //System.out.println(returnTrueFalse(11,10));
        //turnPositiveNegative(-1);
        //System.out.println(returnTrueFalsePosNeg(-1));
        //printString(100, "double");
        System.out.println(year(504));

    }

    public static boolean returnTrueFalse(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static void returnPositiveNegative(int n) {
        if (n>=0) {
            System.out.println("Положительное");
        }
        else {
          System.out.println("Отрицательное");
        }
        }

        public static boolean returnTrueFalsePosNeg(int n) {
        return (n<0);
        }

        public static void printString(int x, String repeat) {
            for (int i = 0; i<x; i++) {
            System.out.println(repeat);
            }
        }

        public static boolean year(int y) {
        return (y%4==0) && ((y%100!=0) || (y%400==0));

        }

    }




