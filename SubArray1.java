public class SubArray1 {
    public static int Recursion(int nums[],int n){
        if(n==0){
            return nums[n];
        }
        if(n<0){
            return 0;
        }
        int pick=nums[n]+Recursion(nums, n-2);
        int NotPick=0+Recursion(nums, n-1);
        return Math.max(pick, NotPick);
    }
       
  
    public static void main(String[] args) {
        int nums[]={2,1,4,9};
        int n=nums.length-1;
       System.out.println(Recursion(nums, n));
    }
    
}
