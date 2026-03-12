package assignment3;

public class SelectionSort {

    public static void main(String[] args){

        int arr[]={5,3,8,4,2};

        for(int i=0;i<arr.length-1;i++){

            int min=i;

            for(int j=i+1;j<arr.length;j++){

                if(arr[j]<arr[min])
                    min=j;
            }

            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        for(int x:arr)
            System.out.print(x+" ");
    }
}
