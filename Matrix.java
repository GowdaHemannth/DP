public class Matrix {
    public static int MatrixChainMultiplication(int arr[],int i,int j){
        if(i>=j){
            return 0;
        }
        int Min=Integer.MAX_VALUE;
      for(int k=i;k<=j-1;k++){
      int ans=(arr[i-1]*arr[k]*arr[j])+MatrixChainMultiplication(arr, i, k)+MatrixChainMultiplication(arr, k+1, j);
      Min=Math.min(ans, Min);
      }
  return Min;
    } 
        
    
    public static void main(String[] args) {
        int arr[]={40,20,30,10,30};
        int j=arr.length-1;
        System.out.println(MatrixChainMultiplication(arr, 1, j));

        
    }
    
}
