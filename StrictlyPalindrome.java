import java.util.ArrayList;
import java.util.List;

public class StrictlyPalindrome {
    public static void main(String[] args){
        boolean bool = strictlyPalindrome(9);
        System.out.println(bool);
    }
    public static boolean strictlyPalindrome(int n){
        int i = 2;
        for (; i < n-1; i++){
            int temp = n;
            List <Integer> list = new ArrayList<>();
            while(temp > 0){
                if(temp == 1)
                    list.add(temp);
                else
                    list.add(temp % i);
                temp /= i;
            }
            System.out.println(list);
            for(int  j = 0; j < list.size()/2; j++)
            {
                if(! list.get(j).equals(list.get(list.size()-1-j)))
                    return false;
            }
        }
        return true;
    }
}
