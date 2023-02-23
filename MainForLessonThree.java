package lesson3;

public class MainForLessonThree {

    public static void main(String[] args) {
        //printArr();
        //replacementNumber();
        //oneHundredArray();
        //array();
        //squareArray();
        fiveArray(36,10);



    }

    public static void printArr() {
        int something = 1;
        int i;
        int j;
        int[][] table = new int[3][4];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                table[i][j] = something;
                System.out.print(table[i][j] + " ");
                something++;
            }
            System.out.println();
        }
    }

    public static void replacementNumber() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i]--;
            } else {
                arr[i]++;
            }
            System.out.print(arr[i] + " ");
        }
    }


    public static void oneHundredArray() {
        int i;
        int[] arr = new int[100];
        for (i = 0; i < 100; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }

    }

    public static void array() {
        int i;
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void squareArray() {
        int[][] sqArr = new int[4][4];
        int unit = 1;
        int i;
        int j;
        for (i = 0; i < sqArr.length; i++) {
            for (j = 0; j < 4; j++) {
                if (i == j) {
                    sqArr[i][j] = unit;
                }
                if ((i == 0 && j == 3) || (i == 1 && j == 2) || (i == 2 && j == 1) || (i == 3 && j == 0)) {
                    sqArr[i][j] = unit;
                }
                System.out.print(sqArr[i][j] + " ");
            }
            System.out.println();

        }

    }

    public static int[] fiveArray(int initialValue, int len) {
        int[] arr = new int[len];
        int i;
        for (i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        return arr;
    }



}



