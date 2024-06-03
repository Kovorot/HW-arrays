import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] intArr = new int[]{1, 2, 3}; //Первый массив
        double[] dblArr = {1.57, 7.654, 9.986}; //Массив с дробями
        byte[] myArr = new byte[4]; //Произвольный массив
        myArr[0] = 4;
        myArr[1] = -7;
        myArr[2] = 100;
        myArr[3] = 14;

        //Задача 2
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);
            if (intArr.length - i == 1) break;
            System.out.print(", ");
        }
        System.out.println();

        for (int i = 0; i < dblArr.length; i++) {
            System.out.print(dblArr[i]);
            if (dblArr.length - i == 1) break;
            System.out.print(", ");
        }
        System.out.println();

        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i]);
            if (myArr.length - i == 1) break;
            System.out.print(", ");
        }
        System.out.println();
        System.out.println();

        //Задача 3
        for (int i = intArr.length - 1; i >= 0; i--) {
            System.out.print(intArr[i]);
            if (i == 0) break;
            System.out.print(", ");
        }
        System.out.println();

        for (int i = dblArr.length - 1; i >= 0; i--) {
            System.out.print(dblArr[i]);
            if (i == 0) break;
            System.out.print(", ");
        }
        System.out.println();

        for (int i = myArr.length - 1; i >= 0; i--) {
            System.out.print(myArr[i]);
            if (i == 0) break;
            System.out.print(", ");
        }
        System.out.println();
        System.out.println();

        //Задача 4
        for (int i = 0; i < intArr.length; i++) {

            if (intArr[i] % 2 != 0) {
                intArr[i]++;
            }
        }
        System.out.println(Arrays.toString(intArr));
    }
}