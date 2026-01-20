package KanpsackPatterns;


// Waht is Basically Kanpsack Means 
// You have a bag (knapsack) with limited space

// You have many items

// You can’t carry all

// So you must decide smartly

// Goal: get maximum benefit from limited capacity
public class Knapsack {
    public static int Function(int W1[],int value[],int W,int n){
        if(n==0||W==0){
            return 0;
        }
        // Dont take Becuase you Cant Take Thats All
        if(W<W1[n]){
            return Function(W1, value, W, n-1);
        }else{
            int Take=value[n]+Function(W1, value, W-W1[n], n-1);
            int NotTaken=Function(W1, value, W, n-1);
            return Math.max(Take,NotTaken);
        }

    }
    public static void main(String[] args) {
         int W1[] = {1,2,3,4,5,6,7,8};
        int value[] = {3, 5, 8, 9, 10, 17, 17, 20};
        int W =  8;
        int n = W1.length-1;
        System.out.println(Function(W1, value, W, n));
    }
    
}
