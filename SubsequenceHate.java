import java.util.Scanner;

public class SubsequenceHate {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while(T-- > 0){
            solution(scn);
        }
    }
    public static void solution(Scanner scn){
        String str = scn.nextLine();
        int[] prefixSum = new int[str.length()];
        int[] suffixSum = new int[str.length()];
        int ops =0;
        if(str.charAt(0) == 1)
            suffixSum[str.length()-1] = 1;
        else suffixSum[str.length()-1] = 0;

        if(str.charAt(0) == 1)
            prefixSum[0] =1;
        else prefixSum[0] = 0;

        for (int i = 1 ; i < str.length(); i++){
            if(str.charAt(i) == 1)
                prefixSum[i] = prefixSum[i-1] + 1;
        }

        for (int i = str.length() -2 ; i > -1; i--){
            if(str.charAt(i) == 1)
                suffixSum[i] = suffixSum[i+1] +1;
        }
        for (int i = 0; i < str.length(); i++ ){
            if(str.charAt(i) == 0){
                if(suffixSum[i] > 0)
                    ops += suffixSum[i] -1;
            }
        }
    }
}
