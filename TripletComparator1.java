import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TripletComparator1 {
    public static void main(String[] args){
        int[] arr = {11,22,3,40,15,6,71};
        int[] frequency = new int[100];
        List <triplet> list = new ArrayList<>();
        for(int i= 0; i < arr.length; i++){
            frequency[arr[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            list.add(new triplet(frequency[arr[i]], arr[i], i));
        }


    }

    public static boolean cmp(triplet t1, triplet t2){
    return false;
    }
    public static class triplet {
    int frequency;
    int value;
    int index;
    triplet(int a, int b, int c){
        this.frequency = a;
        this.value = b;
        this.index = c;
    }
    }
}

