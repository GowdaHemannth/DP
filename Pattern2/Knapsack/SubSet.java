public class SubSet {
    // Used To Find Whether the Given Sum Of Subset Present or Not
    public static boolean Function(int index,int arr[],int target){
        if(target==0){
            return true;
        }
        if(index==0){
            return arr[0]==target; 
        }
        boolean Take=false;
        if(arr[index]<=target){
           Take=Function(index-1, arr, target-arr[index]);

        }
        boolean NotTake=Function(index-1, arr, target);

        return Take||NotTake;
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,1};
        int n=arr.length-1;
        int target=10;
      
        System.out.println(Function(n, arr, target));
    }
    
}
