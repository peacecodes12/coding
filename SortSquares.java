//import java.util.Arrays;
//
//public class SortSquares {
//    public static void main(String[] args) {
//        int[] arr = {-12,-4, -3, -1, 1, 4, 5, 6, 7}; // input array
//        int[] sorted = new int[arr.length]; // array to maintain the sorted elements
//        int i;
//        for (i = 0; i < arr.length; i++) { // checking for the first non-negative element
//            if (arr[i] >= 0)
//                break;
//        }
//        int j = i - 1, k;
//        for (k = 0; j >= 0 && i < arr.length; ) { // placing the squares of elements in sorted form
//            int squareI = arr[i] * arr[i];
//            int squareJ = arr[j] * arr[j];
//            if (squareJ < squareI) {
//                sorted[k] = squareJ;
//                k++;
//                j--;
//            } else {
//                sorted[k] = squareI;
//                i++;
//                k++;
//            }
//        }
//        if (j >= 0) { // adding the squares of leftover negative elements to sorted array
//            for (; j >= 0; j--, k++)
//                sorted[k] = arr[j] * arr[j];
//        }
//        if (i < arr.length) // adding the squares of leftover positive elements to sorted array
//            for (; i < arr.length; i++, k++)
//                sorted[k] = arr[i] * arr[i];
//        System.out.println(Arrays.toString(sorted));
//    }
//}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortSquares {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Integer[] arr = {-4, -2, -1};
        List<Integer> list1 = Arrays.asList(arr);
        int i;
        for (i = 0; i < list1.size();i++){
            if(list1.get(i) >=0)
                break;
        }
        int j=i-1;
        for(;j>=0 && i < list1.size();){
            int squareI = list1.get(i) * list1.get(i);
            int squareJ = list1.get(j) * list1.get(j);
            if(squareJ<squareI){
                list.add(squareJ);
                j--;
            }
            else {
                list.add(squareI);
                i++;
            }
        }
        if( j >=0){
            for(;j>=0;j--){
                int squareJ = list1.get(j) * list1.get(j);
                list.add(squareJ);
            }
        }
        else if(i < list1.size()){
            for (;i<list1.size();i++)
            {
                int squareI = list1.get(i) * list1.get(i);
                list.add(squareI);
            }
        }
        System.out.println(list);
    }
}
