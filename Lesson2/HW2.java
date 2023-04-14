package JavaCore.Lesson2;

public class HW2 {


    public static void main(String[] args) {

        String[][] array =
                {
                        {"70", "2", "3", "4"},
                        {"8", "6", "7", "8"},
                        {"9", "10", "11", "1"},
                        {"13", "14", "h", "7"}




                };
        try {
            createArray(array);
            //throw new NumberFormatException("MyArrayDataException");

        } catch (NumberFormatException e) {
            System.out.println("[!] - Значение этой ячейки массива не является числом!");
            e.printStackTrace();
            //throw new ArrayIndexOutOfBoundsException("MyArraySizeException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println();
            System.out.println("Неверная длина массива");
            e.printStackTrace();
        }


        System.out.println();


    }

    public static void createArray(String[][] array) throws ArrayIndexOutOfBoundsException, NumberFormatException {
        int sum = 0;

        int[][] array2 = new int[4][4];

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                array2[i][j] = Integer.parseInt(array[i][j]);
                sum = sum + array2[i][j];

                System.out.print("[" + array2[i][j] + "]" + " ");


            }

        }
        System.out.println();
        System.out.println("Сумма элементов массива целых чисел array2 равна " + sum);








        /*if (array.length > 4 || array.length < 4) {
            System.out.println();
            System.out.println("Неверная длина массива!");
            throw new ArrayIndexOutOfBoundsException("MyArraySizeException");

        }*/

    }

}



