
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Stick {
    public static int Function(int i,int j,ArrayList<Integer>Cuts){
        if(i>j){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
            int ans=Cuts.get(j+1)-Cuts.get(i-1)+Function(i,k-1,Cuts)+Function(k+1,j,Cuts);
            min=Math.min(ans, min);

        }
        return min;
    }
   public static int Cost(int n,int c,ArrayList<Integer>Cuts){
    Cuts.add(7);
    Cuts.add(0);
    Collections.sort(Cuts);
 return Function(1,c, Cuts);
   }
    
    public static void main(String[] args) {
        ArrayList<Integer>Cuts=new ArrayList<>(Arrays.asList(3,5,1,4));
       int c=Cuts.size();
       int n=7;
  System.out.println(Cost(n, c, Cuts));
        
    }
    
}
