package Pattern5;

public class Numerical1 {
    public static int Function(int i,int prev,int arr[]){
        int n=arr.length;
        if(n==i){
            return 0;
        }
        int NotTake=Function(i+1,prev,arr);
        int Take=0;
        if(prev==-1||arr[i]>arr[prev]){
            Take=1+Function(i+1, i, arr);
        }
        return Math.max(Take,NotTake);
         
    }
      

    public static void main(String [] args){
        int arr[]={2,5,3,9,101,18};
        System.out.println(Function(0, -1, arr));
    }
    
}
