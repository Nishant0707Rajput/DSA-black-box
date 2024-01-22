package PrefixSum;
import java.util.*;

public class printAllSubArray {
    
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7} ;
        f(arr);
    }
    
    public static void f(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = i; j < n; j++){
                temp.add(arr[j]);
                System.out.println(temp);
            }
        }
    }
}
