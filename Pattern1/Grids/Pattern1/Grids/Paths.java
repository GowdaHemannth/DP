package Pattern1.Grids;
public class Paths{
    public static int Paths(int i,int j){
        if(i==0&&j==0){
            return 1;
        }
        if(i<0||j<0){
            return 0;
        }
        int up=Paths(i-1, j);
        int left=Paths(i, j-1);
        return up+left;
    }
    public static void main(String[] args) {
        int n=7;
                int m=3;
                                int arr[][]=new int[m][n];
                              System.out.println(Paths(m-1,n-1));  
    }
}