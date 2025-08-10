package Pattern1.Grids;
public class Ninja {
    // Ninja Training Numerical

    public static int Recurence(int n,int last,int arr[][]){
        if(n==0){
            int maxi=0;
            for(int i=0;i<arr[0].length;i++){
                if(i!=last){
                 maxi=   Math.max(maxi, arr[n][i]);

                }
                
            }
            return maxi;
        }

        int maxi=0;
        for(int j=0;j<arr[0].length;j++){
            int Points=arr[n][j]+Recurence(n-1, j, arr);
          maxi=  Math.max(maxi, Points);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[][]={{1, 2, 5},
        {3, 1, 1},
        {3, 3, 3}};
        int n=arr.length -1;
       System.out.println( Recurence(n, 3, arr));
    }
     
    
}
