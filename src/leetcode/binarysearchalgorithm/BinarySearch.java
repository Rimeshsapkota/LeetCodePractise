package leetcode.binarysearchalgorithm;

/**
 * I am using binary search algorithm
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int searchElement=5;
        System.out.println(new BinarySearch().findElementInArray(arr,searchElement));
    }

    public int findElementInArray(int[] arr, int search){
        int low=0;
        int high=arr.length-1;
       while (low<=high){
           int mid=low+(high-low)/2;
           if (arr[mid]==search){
               return mid;
           }
           if (arr[mid]<search){
               low = mid + 1;
           }
           else
               high=mid-1;

       }
       return -1;

    }
}
