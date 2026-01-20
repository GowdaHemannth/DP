package PATTERNTWODGRID;
public class GridUniqe {
    public static int Function(int m,int n){
        if(m==0&&n==0){
            return 1;
        }
        // Look For Edge Case
        if(m<0 || n<0){
            return 0;
        }


        // Here i can go to Up And Left
        int Up=Function(m-1,n);
        int Left=Function(m,n-1);
        return Up+Left;
    }
    public static void main(String[] args){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int m=arr.length-1;
        int n=arr[0].length-1;
        System.out.println(Function(m, n));

    }
    
}
