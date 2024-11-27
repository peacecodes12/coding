import java.util.*;
public  class TransformationAtoB{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        LinkedList<Integer> list = transformation(b,a); // 2,162,""
        if(list == null)
            System.out.println("NO");
        else
        {
            System.out.println("YES");
            System.out.println(list.size());
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i) + " ");
            }
        }

    }

    public static LinkedList<Integer> transformation(int current, int target){
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(current);
        while(current > target){
            if(current % 2 ==0){
                current = current/2;
                list.addFirst(current);
            }
            else if(current % 10 == 1){
                current = current/10;
                list.addFirst(current);
            }
            else break;
        }
        if(current == target)
            return list;

        return null;
    }
}