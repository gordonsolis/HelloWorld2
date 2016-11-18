package util;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 * Created by Gordon Solis on 11/17/2016.
 */
public class SortingUtils
{
    public static void swap(int[] array, int firstIndex, int secondIndex)
    {
        int placeholder = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = placeholder;
    }

    public static void insertionSort(int[] array)
    {
        int totalOperations = 0;
        for (int i = 0; i<array.length;i++)
        {
            for(int j = i; j>0;j--)
            {
                if(array[j]<array[j-1]) {
                    swap (array, j, j-1);
                    totalOperations+=3;
                }
                totalOperations++;
            }
        }
        System.out.println("Total operations: "+ totalOperations);
    }

    public static void selectionSort(int[] array)
    {
        int totalOperations = 0;
        for(int i = 0; i < array.length; i++)
        {
            int lowestIndex = i;
            for(int j = i; j < array.length; j++)
            {
                if (array[j] < array[lowestIndex]) {
                    lowestIndex = j;
                    totalOperations++;
                }
                totalOperations++;
            }
            swap(array, i, lowestIndex);
            totalOperations+=3;
        }
        System.out.println("Total operations: " + totalOperations);
    }

    public static void bubbleSort(int[] array)
    {
        int totalOperations = 0;
        for (int i = 0; i < array.length; i++)
        {
            for (int j =  array.length-1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                    totalOperations += 3;
                }
                totalOperations++;
            }
        }
        System.out.println("Total operation: "+ totalOperations);
    }
}
