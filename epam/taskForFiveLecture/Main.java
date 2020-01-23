package epam.taskForFiveLecture;

import java.util.Arrays;

/**
 * @author Anna Fetsun
 *  task 1 -> Создание третьего массива известной длины
 *  task 2 -> Создание третьего массива неизвестной длины
 */

public class Main {

    public static int[] randomArray(int size){
        int[] arrayWithValue = new int[size];
        for (int i = 0; i < size; i++){
            arrayWithValue[i] = (int) Math.round((Math.random() * 30) - 15);
        }
        return arrayWithValue;
    }

    public static int[] fillArraysWithSum(int[] array1, int[] array2){
        int sizeOfArray = array1.length;
        int[] arraySum = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++){
            arraySum[i] = array1[i] + array2[i];
        }
       return arraySum;
    }

    public static int[][] takePositiveArray(int[] array){
        int k = 0;
        int negK = 0;
        int sizeOfArray = array.length;
        int[] positiveArray = new int[sizeOfArray];
        int[] negativeArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            if (array[i] >= 0) {
                positiveArray[k++] = array[i];
            } else {
                negativeArray[negK++] = array[i];
            }
        }
        int[][] sum = {Arrays.copyOfRange(positiveArray, 0, k),
                Arrays.copyOfRange(negativeArray, 0, negK)};
        return sum;
    }

    public static void main(String[] args) {
        int setSize = 10;

        int[] defaultArray1 = {1, 2, 3};
        int[] defaultArray2 = {3, 2, 1};

        int[] randomArray1 = randomArray(setSize);
        int[] randomArray2 = randomArray(setSize);

        int[] defaultSumArray = Main.fillArraysWithSum(defaultArray1, defaultArray2);
        int[] randomSumArray = Main.fillArraysWithSum(randomArray1, randomArray2);

        System.out.println(" < ********* task 1 ********* >");
        System.out.print("The sum of the default array : \t\t");
        for (int element: defaultSumArray) {
            System.out.print(element + " ");
        }
        System.out.print("\nThe value of the first array : \t\t");
        for (int element: randomArray1) {
            System.out.print(element + " ");
        }
        System.out.print("\nThe value of the second array : \t");
        for (int element: randomArray2) {
            System.out.print(+ element + " ");
        }
        System.out.print("\nThe sum of the random arrays : \t\t");
        for (int element: randomSumArray) {
            System.out.print(element + " ");
        }

      // ***** task 2 ******* //
        int[] arrayForDivide = randomArray(setSize);

        int[][] divArray = takePositiveArray(arrayForDivide);

        System.out.print("\n < ********* task 2 ********* >");
        System.out.print("\nGeneral array for divide : \n");
        for (int element: arrayForDivide) {
            System.out.print(element + " ");
        }

        System.out.print("\nTaken array with positive value from general array : \n");
        for (int[] element: divArray) {
            for (int el: element) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
