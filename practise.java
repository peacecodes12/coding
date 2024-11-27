public class practise {
    public static void main(String[] args) {

    }

    public static boolean isPartition(int[] arr, int curSum, int target, int index){
        if(index == arr.length)
            return false;
        if(curSum == target)
            return true;
        boolean included = isPartition(arr,curSum + arr[index], target,index+1);
        boolean notIncluded = isPartition(arr, curSum, target, index+1);
        return included || notIncluded;
    }
}
