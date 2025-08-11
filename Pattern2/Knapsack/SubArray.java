public class SubArray {
    // Brute force maximum sum of the non adjcent Elements 
    public static void main(String[] args) {
        int arr[]={2,1,4,9};
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           for(int j=i+2;j<arr.length;j++){
           max=Math.max(max,arr[i]+arr[j]);
            }
        }
        System.out.println(max);
    }
    
}
