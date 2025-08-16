package Pattern5;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.ArrayList;
// Here we will be solving the Longest Divisble Subset Numerical 
// Here we solve these Numerical you will get Many Questions Like Pritig the LIS Then Optimization technique for the LIS
public class Numerical2 {
    public static ArrayList<Integer> Function(int arr[]){
        int n=arr.length;
        ArrayList<Integer>DP=new ArrayList<>(Collections.nCopies(n, 1));
        ArrayList<Integer>Hash=new ArrayList<>(Collections.nCopies(n, 0));
        for (int i = 0; i < n; i++) {
    Hash.set(i, i);
}
        for (int i=0;i<n;i++){
          for(int prev=0;prev<=i-1;prev++){
            if(arr[i]%arr[prev]==0&&1+DP.get(prev)>DP.get(i)){
              DP.set(i, 1+DP.get(prev));
              Hash.set(i, prev);

            }
          }
        }

        // Now get the Largest Elemnts Index
        int ans=-1;
        int LastIndex=0;
        for(int i=0;i<n;i++){
          if(DP.get(i)>ans){
            ans=DP.get(i);
            LastIndex=i;
          }
        }

        ArrayList<Integer>AS=new ArrayList<>();
        AS.add(arr[LastIndex]);
        while(Hash.get(LastIndex)!=LastIndex){
          LastIndex=Hash.get(LastIndex);
          AS.add(arr[LastIndex]);

        }
        Collections.reverse(AS);
        return AS;
    }
    public static void main(String[] args){
  int arr[]={1,16,7,8,4};
  Arrays.sort(arr);
   System.out.println(Function(arr));
    }
    
}
