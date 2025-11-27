package Pattern1.Grids;
public class Triangle {
    // Here The Uniquness Of these Numerical is That 
    // You will Not Be Having the Mixed Ending Point like Previous Grids Numericals 
    // Where you were Told that If you Reach At any Point AT Last Row  You can Stop 

    // 
    public static int Function(int i,int j,int triangle[][],int n){
        //Here there is No need To Worry About the J Going Out of Bound Because 
        // Since it is a Triangle It will never go out of Bound 
        // Either it will GO Down Or Diagonal Or Down Right ;
        if(i==n){
            return triangle[n][j];
        }

        int down=triangle[i][j]+Function(i+1, j, triangle, n);
        int Diagonal=triangle[i][j]+Function(i+1, j+1, triangle, n);
        return Math.min(Diagonal, down);
    }
    public static void main(String[] args) {
        int triangle[][] = {{1},
        {2, 3},
        {3, 6, 7},
        {8, 9, 6, 10}};

int n = triangle.length-1;
System.out.println(Function(0, 0, triangle, n));
    }
    
}
