import java.util.ArrayList;
import java.util.List;

public class ListString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("2");
        list.add("4");
        String str = "abc";
        list.add(str);
        list.add(0,"12");
        str = new String(str + "aaa");
        list.add(str);
        for (String s : list) System.out.println(s);
        StringBuffer sb = new StringBuffer();
        sb.append("456");
        sb.append("444");
        int a = 9;
        String str1 = Integer.toString(a);
        System.out.println(sb+" "+sb.capacity()+" "+sb.length());
    }
}
