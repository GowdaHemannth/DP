package PATTERNTWODGRID;

public class NinjaTraining {
    public static int Function(int arr[][], int Row, int Last) {

        // Now Write Base Case Here IT CAN Go ANYWHERE HERE MENAS Not an Fixed point but
        // When reaches
        // Row As Zero we nedd to Stop
        if (Row == 0) {
            int maxi = 0;
            for (int i = 0; i < arr[0].length; i++) {
                maxi = Math.max(maxi, arr[Row][i]);
            }
            return maxi;
        }
        // Here i will Get Saying why am i Initalize Differntly HERE ANSWER TO THAT IS
        // HERE WE ARE NOT HAVINGLINEAR RECURSIO BUT INSTEAD WE ARE HAVING BRACHING
        // RESURION HENCE IT WILL TAKE FOR EACH CYCLE

        int Maxi = 0;
        for (int i = 0; i < arr[0].length; i++) { // Here i Have Taken Columns length Becuase Hee we going to Coumns
                                                  // Only
            if (i != Last) {
                int Points = arr[Row][i] + Function(arr, Row - 1, i);
                Maxi = Math.max(Maxi, Points);
            }

        }
        return Maxi;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 5 },
                { 3, 1, 1 },
                { 3, 3, 3 } };
        int Row = arr.length - 1;
        // why are we passing 3 Last becuase Since its first call expect 0,1,2 if i pass
        // 100 also it doesnt matter
        System.out.println(Function(arr, Row, 3));
    }

}
