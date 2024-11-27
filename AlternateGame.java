public class AlternateGame {
    public static void main(String[] args) {
        int[] arr= {5, 3, 7, 10};
        System.out.println(calculate(true,0,arr.length-1,arr,0));
    }
    public static int calculate(boolean chance, int start, int end, int[] arr, int sum){
        if(start > end){
            return sum;
        }
        int sum1 = 0, sum2 = 0;
        if(!chance){
//            sum1 = calculate(true,start+1,end,arr,sum);
//            sum2 = calculate(true,start,end-1,arr,sum);
            if(arr[start] > arr[end])
                sum1 = calculate(true,start+1,end,arr,sum);
            else sum1  = calculate(true,start,end-1,arr,sum);
        }
        else {
            sum1 = calculate(false,start+1,end,arr,sum+arr[start]);
            sum2 = calculate(false,start,end-1,arr,sum+arr[end]);
        }
        if(sum1 > sum2) return sum1;
        return sum2;
    }
}
