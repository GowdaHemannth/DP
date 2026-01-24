public class PatternFourSatck {
    // Here we need to tHINK of dURING THER cOOL dOWN pERIOD 
    // Cool Down here Means if sell you cant Buy Very Next Day
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
            // AS YOU CAN SEE HERE AFTER SELLING I CANT BUY NEXT DAY SO GO TO i+2
            Profit=Math.max(arr[i]+Function(arr, i+2, 0), // Once you sell then you are Allowed to Buy 
                         0+Function(arr, i+1, 1));
        }
        return Profit;
    }
    public static void main(String[] args) {
        
    }
    
}
