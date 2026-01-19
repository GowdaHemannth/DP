public class Practice {
    // Golden Rule When You Thought of Doing Numericals With Recursion At First Dont Think Of 
    // Base Case At First Dont think of Base 
    public static int Function(int W1[],int n,int W,int value[]){
           if(n==0||W==0){
            return 0;
           }
          
        // Here Think of Two Choices Either you can Take when the Weight is Less than Actual Weight 
        if(W1[n]>W){
            return Function(W1 ,n-1,W,value );
        }else{
            int Take=value[n]+Function(W1, n-1, W-W1[n], value);
            int NotTake=Function(W1, n-1, W, value);
            return Math.max(Take,NotTake);
        }
       
    }
    public static void main(String []args){
      int W1[] = {1,2,3,4,5,6,7,8};
        int value[] = {3, 5, 8, 9, 10, 17, 17, 20};
        int W =  8;
        int n = W1.length-1;
    }
    
}
