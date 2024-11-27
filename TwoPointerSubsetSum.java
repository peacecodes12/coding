public class TwoPointerSubsetSum {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int i = 0, j = 0, curr = 0;
        int sum = 15;
        while(i < arr.length){
            if(i == j){
                curr = arr[i];
            }
            if( curr < sum)
            {
                if(j == arr.length - 1 )
                    break;
                j++;
                curr +=  arr[j];
            }
            else if(curr > sum) {
                curr -= arr[i];
                i++;
                if(j < i)
                    j++;
            }
            else if(curr == sum){
                System.out.println("true");
                break;
            }
        }
        if(curr != sum)
        System.out.println(false);
    }
}
