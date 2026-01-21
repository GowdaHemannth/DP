package KanpsackPatterns;

public class CountSubSet {
     public static int Function(int arr[],int Target,int n){
        if(Target==0){
            return 1;

        }
        if(n==0){
            if(arr[0]==Target){
                return 1;
            }else{
                return 0;
            }
        }
        // Here we have taken boolean As true Becuase if in case take condtion not applied Mens need to aplly these
        int Take=0;

        int NotTake=Function(arr, Target, n-1);
        if(arr[n]<=Target){
            Take=Function(arr, Target-arr[n], n-1);
        }
        return Take+ NotTake;
       
    }
    public static void main(String[] args) {
        
    }
    
}
