import java.util.Scanner;

public class BrautifulMatrix {
    public static void main(String[] args){
        int[][] arr=new int[5][5];
        Scanner scn= new Scanner(System.in);
        int i,j,swaps=0;
        for(i=0;i<5;i++){
            for (j=0;j<5;j++){
                arr[i][j]= scn.nextInt();
                if(arr[i][j]==1){
                    int hSwap,vswap;
                    hSwap=j-2;
                    if(hSwap<0)
                        hSwap*=-1;
                    vswap=i-2;
                    if(vswap<0)
                        vswap*=-1;
                    swaps=vswap+hSwap;
                    break;
                }
            }
        }
        System.out.println(swaps);
    }
}

