public class PatternThreeSatck {
    // Here the Question Satates That We are Allowed to Do Tarction Twicw 
    /// VER VERY IMPORTANT TIP WHEN DO YOU THINK TRANSCRTION COMPLETD WHEN PERSON BUYS AND SELLS 
      public static int Function(int arr[],int i,int buy,int Count){
        // Comes Base Case
        if(i==arr.length|| Count==0){
            return 0;
        }

        // 
        int Profit=0;
        if(buy==0){
            //  Here If You Buy if Buy is 0
            Profit=Math.max(-arr[i]+Function(arr, i+1, 1,Count),
                              0+Function(arr, i+1, 0,Count));
                   

        }else{
            Profit=Math.max(arr[i]+Function(arr, i+1, 0,Count-1), // Once you sell then you are Allowed to Buy 
                         0+Function(arr, i+1, 1,Count));
        }
        return Profit;
    }
    public static void main(String[] args) {
        
    }
    
}
