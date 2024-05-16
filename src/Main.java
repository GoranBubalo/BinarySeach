import java.util.jar.Manifest;

public class Main {

    public static void main(String[] args) {

        /*
         *  Write a Java program to find a specified element in a given array of elements using Binary Search
         * */


        int[] array = {2, 4, 5, 7, 2};
        int search = 7;
        int result = findElement(array, search);
        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("The element is present at " + " index " + result);
        }
    }

    public static int findElement(int[] array, int numberSearch) {

        int highNumber = array.length - 1; //Getting the index of the last element
        int lowNumber = 0;

        while (lowNumber <= highNumber) {

            int mid = lowNumber + (highNumber - lowNumber) / 2;

            // is number present in mid
            if (array[mid] == numberSearch) {
                return mid;
            }
            //if number greater, ignore left half
            if (array[mid] < numberSearch) {
                lowNumber = mid + 1;
            //if number smaller, ignore right half
            } else {
                highNumber = mid - 1;
            }

        }
        //If we reach here, then the element was
        //not present
        return -1;
    }
}