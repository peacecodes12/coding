public class DistinctRectangles {
    public static void main(String[] args){
        int[] arr = {2,3,3,5};
        int b = 15,count = 0;
        int i =0, j = 0;
        for (i = 0; i < arr.length ;i++){
            if(i == 0 || (i != 0 && arr[i] != arr[i-1]))
            {
                for(j = i; j < arr.length; ){
                    int length = arr[i];
                    int breadth = arr[j];
                    int area = (length * breadth);
                    if(area < b){
                        if(length == breadth )
                            count++;
                        else
                            count +=2;
                        j++;
                        if(j != arr.length){
                            if(j > 0 && arr[j] == arr[j-1])
                                j++;
                        }
                    }
                    else break;
                }
            }
        }
        System.out.println(count);
    }
}
