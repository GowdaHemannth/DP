

import java.util.function.Function;

// Here we will be writiting Code for the scrumbeled string Of MCM Pattern in Dynamic Progtramming 

public class Scrumbeled{
    public static boolean Function(String S1,String S2){
        // Base Case 
       if (S1.equals(S2)) {
    return true;
}
        if (S1.length()<=1){
            return false;
        }
        boolean Flag=false;
        int n = S1.length();

        for (int k=1;k<=S1.length()-1;k++){
            //Here these for Swaaped conditon 
    if ( (Function(S1.substring(0,k), S2.substring(n-k, n)) && 
      Function(S1.substring(k, n), S2.substring(0, n-k))) 
   || 
     (Function(S1.substring(0,k), S2.substring(0,k)) && 
      Function(S1.substring(k, n), S2.substring(k, n))) ) {
    Flag = true;
    break;
}
        }
        return Flag;
    }
    public static void main(String[]args){
        String S1="great";
        String S2="rgeat";
        System.out.println(Function(S1, S2));
    }
    
}