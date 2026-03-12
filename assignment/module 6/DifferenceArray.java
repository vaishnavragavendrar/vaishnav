package assignment3;

public class DifferenceArray {

    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50};
        int diff[] = new int[arr.length];

        diff[0] = arr[0];

        for(int i=1;i<arr.length;i++){
            diff[i] = arr[i] - arr[i-1];
        }

        int l = 1;
        int r = 3;
        int val = 5;

        diff[l] += val;

        if(r+1 < diff.length)
            diff[r+1] -= val;

        int result[] = new int[arr.length];

        result[0] = diff[0];

        for(int i=1;i<arr.length;i++){
            result[i] = result[i-1] + diff[i];
        }

        for(int x : result)
            System.out.print(x + " ");
    }
}
