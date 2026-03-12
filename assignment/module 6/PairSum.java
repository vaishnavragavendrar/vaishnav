package assignment3;

public class PairSum {

    public static void main(String[] args) {

        int arr[] = {2,7,4,5,3};
        int target = 9;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
