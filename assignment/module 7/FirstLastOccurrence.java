package assignment3;

public class FirstLastOccurrence {

    static int first(int arr[], int key){
        int left=0,right=arr.length-1,ans=-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==key){
                ans=mid;
                right=mid-1;
            }
            else if(arr[mid]<key)
                left=mid+1;
            else
                right=mid-1;
        }

        return ans;
    }

    static int last(int arr[], int key){
        int left=0,right=arr.length-1,ans=-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==key){
                ans=mid;
                left=mid+1;
            }
            else if(arr[mid]<key)
                left=mid+1;
            else
                right=mid-1;
        }

        return ans;
    }

    public static void main(String[] args){

        int arr[]={1,2,2,2,3,4};

        System.out.println(first(arr,2));
        System.out.println(last(arr,2));
    }
}
