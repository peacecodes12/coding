import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Triplet {
    int val;
    int fre;
    int idx;
}

class TripletComparator implements Comparator<Triplet> {
    public int compare(Triplet t1, Triplet t2) {
        if (t1.fre != t2.fre) {
            return t1.fre - t2.fre; // ascending order of frequency
        }
        if (t1.val != t2.val) {
            return t1.val - t2.val; // ascending order of value
        }
        return t1.idx - t2.idx; // ascending order of index
    }
}

public class Comparator1 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 5, 2};
        int n = arr.length;
        int[] fre = new int[101]; // frequency array, assuming values are within 0-100

        for (int i = 0; i < n; i++) {
            fre[arr[i]]++;
        }

        ArrayList<Triplet> v = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Triplet t = new Triplet();
            t.val = arr[i];
            t.fre = fre[arr[i]];
            t.idx = i;
            v.add(t);
        }

        Collections.sort(v, new TripletComparator());

        for (int i = 0; i < n; i++) {
            System.out.print(v.get(i).val + " ");
        }
    }
}