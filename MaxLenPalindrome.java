import java.util.Arrays;
import java.util.Scanner;

public class MaxLenPalindrome {
        public static void main (String[] args) {
            Scanner scn= new Scanner(System.in);

            String s= scn.nextLine();
            int i,j,k,max=0,ans;
            int [] index=new int[2];
            String maxString="";
            for(i=0;i<s.length();i++){    //babad
                for(j=i;j<s.length();j++){ //b
                    ans=0;
                    ans=isPalindrome(i,j,s);
                    if(ans>0 && ans>max){
                        index[0]=i;
                        index[1]=j;
                        max=ans;
                    }
                }
            }
            for(i=index[0];i<=index[1];i++)
                maxString+=s.charAt(i);
            System.out.println(maxString);
        }

        public static int isPalindrome(int i,int j, String s){
            int tempI=i,tempJ=j;
            for(;i<=j;i++,j--){
                if(s.charAt(i)!=s.charAt(j))
                    return 0;
            }
            return tempJ-tempI+1;
        }

}
