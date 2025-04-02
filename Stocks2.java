public class Stocks2 {
    public static int Stock1(int arr[],int i,int buy,int n){
        if(i==n){
            return 0;
        }
        int Profit=0;
        if(buy==0){// Here you can Buy it 
             Profit=Math.max(-arr[i]+Stock1(arr, i+1, 1, n), 0+Stock1(arr, i+1, 0, n));
        }

        if(buy==1){ // here you can not Buy it
            Profit=Math.max(arr[i]+Stock1(arr, i+1, 0, n), 0+Stock1(arr, i+1, 1, n));
        }
        
    return Profit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(Stock1(arr, 0, 0, arr.length));

    }
    
}
