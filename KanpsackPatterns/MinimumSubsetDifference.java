package KanpsackPatterns;

import java.util.ArrayList;

public class MinimumSubsetDifference {
    public static boolean Function(int arr[], int Target, int n) {
        if (Target == 0) {
            return true;

        }
        if (n == 0) {
            return arr[0] == Target;
        }
        // Here we have taken boolean As true Becuase if in case take condtion not
        // applied Mens need to aplly these
        boolean Take = false;

        boolean NotTake = Function(arr, Target, n - 1);
        if (arr[n] <= Target) {
            Take = Function(arr, Target - arr[n], n - 1);
        }
        return Take || NotTake;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 11, 5 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        ArrayList<Integer> ArrayList = new ArrayList<>();
        for (int i = 0; i <= sum/2;i++){
            if (Function(arr, i, arr.length - 1) == true) {
                ArrayList.add(i);

            }
        }

        System.out.println(ArrayList);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ArrayList.size(); i++) {
            min = Math.min(min, Math.abs(sum - 2 * ArrayList.get(i)));
        }
        System.out.println(min);
    }

}
