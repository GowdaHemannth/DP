

public class GridUniquePath {
    public static int tWoDUniquePaths(int i,int j,int nums[][]){
        if(i==0 &&j==0){
            return 1;
        }
        if(i<0||j<0){
            return 0;
        }
        int up=tWoDUniquePaths(i-1,j,nums);
        int left=tWoDUniquePaths(i,j-1,nums);
        return up+left;


    }
    public static void main(String[] args) {
        int nums[][]={{1,2,3},{4,5,6},{7,8,9}};
        int i=nums[0].length-1;
        int j=nums.length-1;
        tWoDUniquePaths(i,j,nums);
        
    }
    
}


// For Memoization it will be of good use if we use the 
// 1st step Create a 2D Array o fSize m n int nums[][]=new int[m][n];
// 2nd Step Fill the Array with -1 Values
// 3rd step    return up+left; Store it Like nums[i][j]=up+Left;
// 4th Step Before Calling each Step Check if its Not -1 
    //      if(nums[i][j]!=-1){
    //      return nums[i][j];})
    //  else{
        //      nums[i][j]=up+Left;}
        