import static java.lang.Math.*;

public class SubsetBitmasking {
    public static void main(String[] args){
        int[] arr={2,7,9,1,5,8};
        int n=arr.length;
        int i,j;
        for(i=0; i<=(pow(2,n)-1); i++){
            String bitarray=(Integer.toBinaryString(i));
            j=0;
            for (;j<bitarray.length();j++){
                if (bitarray.charAt(j) == '1') {
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }

    }
}
