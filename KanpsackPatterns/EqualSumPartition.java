package KanpsackPatterns;

// Here these Numerical is Think i have Array[]={1,5,11,5}
// i need sum of two partition Sum should be Equal That Means Two SubArry should give eqaul Sum 
public class EqualSumPartition {
    public static boolean Function(int arr[]){
        int sum=0;
        int n=arr.length-1;
        for (int i=0;i<=arr.length;i++){
            sum=sum+arr[i];
        }
        //Here i will be Checking These With Odd Or Even 
        // Basically If Total Sum is Odd then We cant Do Two Equal Partition
        // if its Even then We can do two Equal Partition
        //Hence So
        if(sum%2!=0){
            return false;
        }else{
            // It Should Return True Becuase we sum IS Even thn there is stwo subset should be Equal right ;
           return Helper(arr,n,sum/2);
        }
       
    }
     public static boolean Helper(int arr[],int n,int Target){
           if(Target==0){
            return true;

           } 
           if(n==0){
            if(arr[0]==Target){
                return true;
            }
           }
           boolean Take=false;
           boolean NotTake=Helper(arr, n-1, Target);
           if(arr[n]<=Target){
            Take=Helper(arr, n-1, Target-arr[n]);
           }
           return Take||NotTake;
        }
    public static void main(String[] args) {
        int arr[]={1,5,11,5};
    }
}
