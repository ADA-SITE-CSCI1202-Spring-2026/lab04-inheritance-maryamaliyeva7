package week06;

public class MathDemo {
   public static int min(int a, int b){
    if (a < b) {
        return a;
    }
    return b;
   }
   
   public static int max(int a, int b){
    if ( a > b) {
        return a;
    }
    return b;
   }

   public static int sum(int[] args){
    int s = 0;
    for (int n : args){
        s += n;
    }
    return s;
   }
}