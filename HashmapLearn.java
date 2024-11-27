//import java.util.HashMap;
//
//public class HashmapLearn {
//    public static void main(String[] args) {
//        HashMap<Integer,Integer> hash = new HashMap<>();
//        hash.put(12,1);
//        System.out.println(hash);
//    }
//}

import java.util.HashMap;

public class HashmapLearn{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        HashMap<Integer,Integer> hash = new HashMap<>();
        int i;
        for( i = 0; i < arr.length; i++){
            if(hash.containsKey(10 - arr[i])){
                System.out.println(true);
                break;
            }
            else {
                hash.put(arr[i],arr[i]);
            }


        }
    }
}


