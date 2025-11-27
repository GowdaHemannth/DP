package Pattern1;
import java.util.Arrays;
// DP Type Memoization

// Here the Question is Frog Jump Given an Array A Frog can Jump like ne step or Two Steps So we need to return the Minimum Cost


// These is TABULATION CODE !!!!!!!
// NUMERICAL 1

public class Frog1{
    
        public static void main(String[] args) {
            int Hieght[]={20,30,40,20};
            int n=Hieght.length;
            int[] DP=new int[n+1];
            Arrays.fill(DP,-1);
            DP[0]=0;
            int Right=Integer.MAX_VALUE;
            for(int i=1;i<n;i++){
                int left=DP[i-1]+Math.abs(Hieght[i]-Hieght[i-1]); // Here we are Substarcting the Present Cost to Previous Cost 
                // For one jump
            if(i>1){
                 Right=DP[i-2]+Math.abs(Hieght[i]-Hieght[i-2]);
            }
            DP[i]=Math.min(Right, left);

        }
        System.out.println(DP[n-1]);
        
    }
}

