package Pattern1.Grids;
public class NinjaFriends {
    public static int Function(int i,int j1,int j2,int matrix[][],int n,int m){
        // Base Case Or Out of Bound Case 
        if(j1<0||j1>m||j2<0||j2>m){
           return  Integer.MIN_VALUE;
        }
        // Base Case If it reaches Lat row
        if(i==n){
            if(j1==j2){
                return matrix[i][j1];
            }else{
                return matrix[i][j1]+matrix[i][j2];
            }
        }
        int Max=Integer.MIN_VALUE;

        for(int di=-1;di<=1;di++){
            for(int dj=-1;dj<=1;dj++){
                int ans;
                if(j1==j2){
                    ans=matrix[i][j1]+Function(i+1, j1+di, j2+dj, matrix, n ,m);
                }else{
                    ans=matrix[i][j1]+matrix[i][j2]+Function(i+1, j1+di, j2+dj, matrix, n,m);
                }
                Max=Math.max(Max, ans);
            }
        }
        return Max;
    }
    public static void main(String[] args) {
        int matrix[][] =  {  
            {3, 1, 1},  
            {2, 5, 1},  
            {1, 5, 5},  
            {2, 1, 1}  
        };
    int n = matrix.length-1;
    int m = matrix[0].length-1;
System.out.println(Function(0, 0, m, matrix, n, m));
    }
    
}
