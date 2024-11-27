import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllStringPermut {
    public static void main(String[] args){
        List<List<Character>> charArr = new ArrayList<>();
        String str = "ABCd";
        char[] arr= str.toCharArray();
        Permute(arr,0);
    }
    public static void Permute(char[] arr, int index){
        if(index == arr.length ){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int i;
        for (i = index; i < arr.length; i++){
            swap(arr,i,index);
            Permute(arr,index+1);
            swap(arr,i,index);
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }



}
