public class PermutationOfString {
    public static void main(String[] args){
        String str="ABCD",tempStr="";
        Permutation(str,str.length(),0,0,tempStr);
        //The parameters are the string, the length of the string, current index
    }
    public static void Permutation(String str, int lenght, int index, int position, String tempStr){
        if(index==lenght){
            for(int i=0;i<position;i++){
                System.out.print(tempStr.charAt(i));
            }
            System.out.println();
            return;
        }

    }
}


/*
 ABC : 0

*/