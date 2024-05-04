/**
 * HD in Computing Software Development
 *          HDCSDEV_INT
 *   Terminal Assessment - 2023/2024
 *       Due: Sat 4 May 2024
 *        Data Structures
 *   Lecture: Dr Keith Maycock
 *            ---
 *  Student: Sergio Vinicio da Silva Oliveira
 *  ID: x23170981
 *            ---
 * Question 3 - Recursive Binary Search
 * -> Implement the binary search algorithm recursively.
 * -> Array [] = { 72, 12, 23, 5, 2, 16, 8, 91, 38, 56}.
 * -> Search 23 and return the index, or -1 if does not exist
 */

package com.alucontrol.Question3;

import java.util.Arrays;

public class Search
{
    //Implement the binary search algorithm recursively.
    public int recursiveBinarySearch(int[] collection, int key)
    {
        //Call the method Assist
        return recursiveBinarySearchAssist(collection, key, 0, collection.length - 1);
    }

    //Implement the binary search algorithm recursively, getting the Array, the Target and the Boundaries
    public int recursiveBinarySearchAssist(int[] collection, int target, int low, int high)
    {
        //establishing the mid of the array
        int mid = (low + high) / 2;

        //base case, to avoid an infinite recursion
        if (low > high)
        {
            return -1; //does not exist
        }

        //considering the target is the middle
        if (collection[mid] == target)
        {
            return mid; //found the target
        }

        //keep looking recursively (left side)
        else if (collection[mid] > target)
        {
            return recursiveBinarySearchAssist(collection, target, low, mid -1);
        }

        //keep looking recursively (right side)
        else
        {
            return recursiveBinarySearchAssist(collection, target, mid + 1, high);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("This is TABA - Data Structures" +
                "\nQuestion 3 - Binary Search Algorithm Recursively" +
                "\nStudent: Sergio Oliveira - x23170981\n---");


        /** Instance Variables */
        int [] collection = { 72, 12, 23, 5, 2, 16, 8, 91, 38, 56}; //the array asked on the exercise
        int key = 23; //I'm looking for ths number


        /** To ensure that the input data is suitable for the purposes of the search,
         *  I'm sorting the array using Java Collection https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html */
        System.out.println("Array [] Collection: " + Arrays.toString(collection));
        Arrays.sort(collection);
        System.out.println("\nThe Array was sorted using Java Collection (Arrays.sort())\n");
        System.out.println("Array [] Collection: " + Arrays.toString(collection));

        /** Instantiating the Search class, creating a new object mySearch of type Search. */
        Search mySearch = new Search();
        System.out.println("\nThe user is looking for the key: "+ key +
                "\nThe index is --> " + mySearch.recursiveBinarySearch(collection, key) + " <-- in the sorted array.");
    }
}
