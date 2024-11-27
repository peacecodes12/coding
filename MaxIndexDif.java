import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxIndexDif {
    public static class Pair<A, B>{
        int first;
        int second;
        public Pair(int element ,int index){
            this.first = element;
            this.second = index;
        }
        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }

    }
    public static void main(String[] args){
        int[] arr = { 5,2,6,4,4,3,1};
        List<Pair<Integer,Integer>> pair = new ArrayList<>();
        int i = 0;
        for (; i < arr.length; i++){
            pair.add(new Pair<>(arr[i],i));
        }
        Collections.sort(pair, (a, b) -> Integer.compare(a.first, b.first));
        int[] SuffixMax = new int[arr.length];
        SuffixMax[arr.length-1] = pair.get(arr.length-1).second;
        for(i = pair.size()-2; i>=0;i--){
            if(pair.get(i).second > SuffixMax[i+1])
                SuffixMax[i] = pair.get(i).second;
            else SuffixMax[i] = SuffixMax[i+1];
        }

    }
}

// 2 5 6 1 2 3
// 1 5 6 2 2 3
// 1 2 6 5 2 3
// 1 2 2 5 6 3
// 1 2 2 3 6 5
