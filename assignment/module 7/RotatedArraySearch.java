package assignment3;

public class RotatedArraySearch {

    static int search(int arr[], int key){

        int left=0,right=arr.length-1;

        while(left<=right){

            int mid=(left+right)/2;

            if(arr[mid]==key)
                return mid;

            if(arr[left]<=arr[mid]){

                if(key>=arr[left] && key<arr[mid])
                    right=mid-1;
                else
                    left=mid+1;
            }
            else{

                if(key>arr[mid] && key<=arr[right])
                    left=mid+1;
                else
                    right=mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args){

        int arr[]={4,5,6,7,0,1,2};

        System.out.println(search(arr,0));
    }
}
