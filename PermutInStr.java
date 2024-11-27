import java.util.Scanner;
// plan??
// we match start index of str1 to find if the start element appears in str2, if it does from there back and front the elements are counted
// idea here is that ill have 2 arrays which keep count of element in both string and then its compared
public class PermutInStr {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine(); // an
        String str2 = scn.nextLine(); // ganesh
        int i ,j;
        int[] count1 =  new int[26];
        boolean isPossible = false;
        for(i = 0; i < str1.length(); i++){
            int cur = str1.charAt(i) - 'a';
            count1[cur]++;
        }
        for (j = 0; j < str2.length(); j++){
            int cur = str2.charAt(j) - 'a';
            int[] count2 =  new int[26];
                if(count1[cur] > 0){
                    leftfrequency(count1,count2,str2,j,str1.length());
                    isPossible = check(count2,count1);
                    if(isPossible){
                        System.out.println("True");
                        break;
                    }
                    count2 = new int[26];
                    rightfrequency(count1,count2,str2,j,str1.length());
                    isPossible = check(count2,count1);
                    if(isPossible){
                        System.out.println("True");
                        break;
                    }
                }
        }
    }
    public static void leftfrequency(int[] count1 , int[] count2 , String str ,int i , int length ){
        if(i - length + 1 >= 0) {
            for (int j = 0 ; j < length; j++,i--) {
                int cur = str.charAt(i) - 'a';
                if(count1[cur] < 1)
                    break;
                count2[cur]++;
            }
        }
    }

    public static void rightfrequency(int[] count1 , int[] count2, String str ,int i , int length ){
        if(i + length + 1 < str.length()) {
            for (int j = 0 ; j < length; j++,i++) {
                int cur = str.charAt(i) - 'a';
                if(count1[cur] < 1)
                    break;
                count2[cur]++;
            }
        }

    }
    public static boolean check(int[] count1, int[] count2){
        for (int i = 0; i < 26; i++){
            if(count1[i] != count2[i])
                return false;
        }
        return true;
    }
}
