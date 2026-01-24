public class Stock{
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        // Here the Qustion Sates you can Buy and Sell on the Any Given Day 
        // we need to get the Maximum Profir 
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int profit=arr[j]-arr[i];
                max=Math.max(max, profit);

            }
        }
        System.out.println(max);

     
        int min=arr[0];
        int maxProfit=0;
        for (int i=1;i<arr.length;i++){
            int cost=arr[i]-min;
            maxProfit=Math.max(maxProfit, cost);
            min=Math.min(arr[i],min);
        }
        System.out.println(maxProfit);
    }

}