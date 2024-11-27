import java.util.Scanner;

public class FourFactorsOptimised {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int[] Array=new int[10001];
        int[] factors= new int[10001];
        int[] factorsSum=new int[10001];
        int i,j;
        factors[1]=1;
        for(i=2;i<10001;i++){
            factors[i]=1;
            factorsSum[i]=1;
            Array[i]=i;
        }

        for(i=2;i<=10001/2;i++){
            for(j=1;j<10001/i;j++){
                factors[i*j]++;
                factorsSum[i*j]+=i;
            }
        }
        int T=scn.nextInt();
        while (T!=0){
            int sum=0;
            int N=scn.nextInt();
            int[] InputArr=new int[N];
            for(i=0;i<N;i++){
                InputArr[i]= scn.nextInt();
                if(factors[InputArr[i]]==4){
                    sum+=factorsSum[InputArr[i]];
                }
            }
            System.out.println(sum);
            T--;
        }

    }
}
