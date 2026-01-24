public class PatternTwo {
    public static int Function(int arr[],int i,int buy){
        // Comes Base Case
        if(i==arr.length){
            return 0;
        }

        // 
        int Profit=0;
        if(buy==0){
            //  Here If You Buy if Buy is 0
            Profit=Math.max(-arr[i]+Function(arr, i+1, 1),
                              0+Function(arr, i+1, 0));
                   

        }else{
            Profit=Math.max(arr[i]+Function(arr, i+1, 0), // Once you sell then you are Allowed to Buy 
                         0+Function(arr, i+1, 1));
        }
        return Profit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(Function(arr, 0, 0));
    }
    
}
