import java.util.Scanner;

public class ZigZagConverstion {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        s = convert(s,4);
        System.out.print(s);
//        test();
    }
    public static String convert(String s, int numsRows) {
            int gap1 = (2 * numsRows) - 2;
            int gap2 = 0;
            if(gap2 == 0 && gap1 ==0)
                return s;
            String s1 = "";
            for (int i = 0; i < numsRows; i++) {
                int first = i;
                int second = i + gap1;
                if (gap1 == 0)
                    second = i;

                while ((first < s.length() || second < s.length())) {
                    if (gap1 > 0 && (first < s.length()))
//                    System.out.print(s.charAt(first));
                    {
                        s1 += s.charAt(first);

                    }
                    if (gap2 != 0 && (second < s.length())) {
//                    System.out.print(s.charAt(second));
                        s1 += s.charAt(second);
                    }
                    first += gap1 + gap2;
                    second += gap2 + gap1;
                }
                gap2 += 2;
                gap1 -= 2;
            }
//        System.out.println(s1);
            return s1;
        }

    public static void test(){
        String s = "ABC";
        String s1 = "AB";
        s = s+s1;
        System.out.println(s);

    }
}
