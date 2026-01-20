package PATTERNTWODGRID;


// Here Question is Same as the Previous Numerical Where WEhere we arwe Just Returning A Minimum Sum Thats All 
// Here we will be Finding min Or Max Value 

public class GridUniqueTwo {
    public static int Function(int m,int n,int arr[][]){

if(m==0&&n==0){
            return arr[0][0] ;
        }
        // Look For Edge Case
        if(m<0 || n<0){
            return Integer.MIN_VALUE;
        }


        // Here i can go to Up And Left
        int Up= arr[m][n]+Function(m-1,n, arr);
        int Left=arr[m][n]+Function(m,n-1,arr);
        return Math.min(Up,Left);
    
    
    }
    public static void main(String[] args) {
          int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
    }
    
}
