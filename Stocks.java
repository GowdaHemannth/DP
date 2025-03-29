public class Stocks{
    public static int Max(int arr[] ,int n){
        int mini=arr[0];
        int MaxProfit=0;
        for(int i=1;i<n;i++){
            int CutProfit=arr[i]-mini;
             mini=Math.min(arr[i],mini);
             MaxProfit=Math.max(MaxProfit, CutProfit);
        }
   return MaxProfit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int n=arr.length;
        System.out.println(Max(arr, n));
    }
}