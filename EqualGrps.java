
import java.util.*;
import java.lang.*;
import java.io.*;

    /* Name of the class has to be "Main" only if the class is public. */
    public class EqualGrps
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner scn = new Scanner(System.in);
            int T = scn.nextInt();
            while(T-- >0 ){
                int N = scn.nextInt();
                int[] count = new int[10001];
                int i, element,X=0;
                for (i = 0;i < N ;i++ ){
                    element = scn.nextInt();
                    count[element]++;
                    if(i == N-1)
                        X = count[element];
                }
                checkCount(X,count);
            }
        }

        public static void checkCount(int X, int[] count){
            for(int i = 0 ; i < count.length ; i++){
                if(count[i] != 0 )
                {
                    if(X != count[i]){
                        System.out.println("false");
                        return;
                    }

                }
            }
            System.out.println("true");
        }
    }

