import java.util.Scanner;

public class VowelMaxCount {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        scn.nextLine();
        while(T-- >0){
            String str = scn.next();
            int k = scn.nextInt();

            int i,curCount=0,max;

            for(i=0;i<k;i++){
                if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' )
                    curCount++;
            }

            max=curCount;

            for(i=k;i<str.length()-k;i++){
                if(str.charAt(i-k)=='a' || str.charAt(i-k)=='e' || str.charAt(i-k)=='i' || str.charAt(i-k)=='o' || str.charAt(i-k)=='u' )
                    curCount--;

                if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' )
                    curCount++;

                if(max < curCount)
                    max=curCount;

                if(max==k)
                    break;
            }
            System.out.println(max);
        }
    }
}
