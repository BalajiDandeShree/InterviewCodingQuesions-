package com.shred;


/*
 * When passed two arrays of names, it will return an array containing the names
 * that appear in either or both arrays. The returned array should have no
 * duplicates.
 */

import java.util.*;

public class MergeArrays {
    public static String[] mergeArrays(String[] arr1, String[] arr2) {
        // Combine both arrays
        List<String> combinedList = new ArrayList<>(Arrays.asList(arr1));
        combinedList.addAll(Arrays.asList(arr2));
        
        // Use a Set to remove duplicates
        Set<String> uniqueNames = new HashSet<>(combinedList);
        
        // Convert Set back to array and return
        return uniqueNames.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] array1 = {"Olivia", "Sophia", "Emma", "Sophia"};
        String[] array2 = {"Ava", "Emma", "Olivia", "Emma"};

        String[] mergedArray = mergeArrays(array1, array2);
        System.out.println(Arrays.toString(mergedArray)); // Output: [John, Jane, Alice, Bob, Charlie]
    }
}