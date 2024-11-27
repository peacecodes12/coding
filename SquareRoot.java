public class SquareRoot {
    public static void main(String[] args){
        int n = 1;
        System.out.println(sqrt(n));
    }

    public static int sqrt(int num){
        int low = 0, high = num, mid;
        while(low <= high){
            mid = low + (high - low)/2;
            if(mid * mid > num)
                high = mid -1;
            else if (mid * mid < num)
                    low = mid+1;
            else
                return mid;
        }
        return high;
    }
}
