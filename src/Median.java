/***
 * Median of Two Sorted Arrays
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 *
 * Example1:
 * Input:nums1 = [1,3], nums2 = [2]
 * Output:2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 *
 * Example2:
 * Input:nums1 = [1,2], nums2 = [3,4]
 * Output:2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 *
 * Constraints:
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i], nums2[i] <= 106
 */
import java.util.*;
import java.util.stream.*;

public class Median {

    public static double findMedian(int[] nums1, int[] nums2) {
        Integer[] num1 = Arrays.stream( nums1 ).boxed().toArray( Integer[]::new );
        List <Integer> n1 = Arrays.asList(num1);
        Integer[] num2 = Arrays.stream( nums2 ).boxed().toArray( Integer[]::new );
        List <Integer> n2 = Arrays.asList(num2);
        List<Integer> newList = Stream.concat(n1.stream(), n2.stream())
                .collect(Collectors.toList());

        int length = newList.size();
        if(length % 2 == 0){
            return (newList.get(length/2) + newList.get((length/2)+1)) / 2.0;
        }
        else return newList.get(length/2);
    }

    public static void main(String[] args) {
        int [] nums1 = {1, 2};
        int [] nums2 = {3};
        double res = findMedian(nums1, nums2);
        System.out.println(res);

        //Add more tests
    }
}