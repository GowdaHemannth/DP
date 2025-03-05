public class Triangle {
    public static int Function(int i,int j,int triangle[][],int n){
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
