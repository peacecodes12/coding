public class ArraySearch2D {
    public static void main(String[] args){
        int [][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        boolean x= searchMatrix(matrix,5);
        System.out.println(x);
    }
    public static  boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[i].length-1;
        while(i<matrix.length && j>=0){
            if(matrix[i][j]>target)
            {
                j--;
            }
            else if(matrix[i][j]<target){
                i++;
            }
            else return true;
        }
        return false;

    }
}
