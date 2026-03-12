package assignment3;

public class BinarySearch {

    static int iterativeSearch(int arr[], int key){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(arr[mid] == key)
                return mid;

            if(arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    static int recursiveSearch(int arr[], int left, int right, int key){

        if(left <= right){

            int mid = (left + right) / 2;

            if(arr[mid] == key)
                return mid;

            if(arr[mid] < key)
                return recursiveSearch(arr, mid + 1, right, key);
            else
                return recursiveSearch(arr, left, mid - 1, key);
        }

        return -1;
    }

    public static void main(String[] args){

        int arr[] = {2,4,6,8,10,12};
        int key = 10;

        System.out.println(iterativeSearch(arr,key));
        System.out.println(recursiveSearch(arr,0,arr.length-1,key));
    }
}
