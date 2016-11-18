import QueuePackage.LinkedQueue;
import StackPackage.LinkedStack;
import util.SortingUtils;

import java.util.Random;
import java.util.Scanner;

//homework; write a main method

public class MainClass {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        while (true)
        {
            System.out.print("How big of an array should I create: ");
            int arraySize = kb.nextInt();
            int[] unsortedArray = new int[arraySize];

            System.out.print("What should the maximum value of the array be: ");
            int maxNumber = kb.nextInt();

            for (int i = 0; i < arraySize; i++) {
                unsortedArray[i] = random.nextInt(maxNumber);
            }

            printArray(unsortedArray);
            SortingUtils.insertionSort(unsortedArray);
            printArray(unsortedArray);

            boolean continuation = true;
            while (continuation) {
                System.out.print("Continue? Y/N");
                String input = kb.next();
                if (input.equals("Y")) continuation = false;
                else if (input.equals("N")) return;
            }
        }
    }

    private static void printArray(int [] array)
    {
        System.out.print("Array contents: ");
        for (int i = 0; i<array.length; i++)
        {
            System.out.print(array[i]+ ", ");
        }

        System.out.println("end.");
    }
}
