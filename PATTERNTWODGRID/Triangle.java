package PATTERNTWODGRID;

public class Triangle {
    public static int Function(int arr[][],int m,int i,int j){
          
        if(i==m||j==m){
            return 1;

        }

        // Here I can Go Down and Diagonal 
        int Down=Function(arr,m, i+1, j);
        int Diagnoal=Function(arr,m, i+1, j+1);
        return Down+Diagnoal;

    }
    public static void main(String[] args) {
        // Here its Nothing we will be ahving Matrix in Trib]gle Format 
        int arr[][]={{1},
                      {2,3},
                       {4,5,6}};
        int m=arr.length-1;
        int n=arr[0].length-1;               
        
    }
}