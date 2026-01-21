package KanpsackPatterns;

public class Subset {
    public static boolean Function(int arr[],int Target,int n){
        if(Target==0){
            return true;

        }
        if(n==0){
            if(arr[0]==Target){
                return true;
            }
        }
        // Here we have taken boolean As true Becuase if in case take condtion not applied Mens need to aplly these
        boolean Take=false;

        boolean NotTake=Function(arr, Target, n-1);
        if(arr[n]<=Target){
            Take=Function(arr, Target-arr[n], n-1);
        }
        return Take|| NotTake;
       
    }
    public static void main(String[] args) {
      int arr[]={1,5,11,5};
        
    }
  
    
}
