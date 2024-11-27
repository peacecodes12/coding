import java.util.Scanner;

public class AliceBobCandies {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while(T-- > 0){
            inputPrecess(scn);
        }
    }
    public static void inputPrecess(Scanner scn){
        int N = scn.nextInt();
        int i;
        int totalAlice=0,totalBob=0;
        int prevAlice = 0, prevBob = 0;
        int trackAlice = 0, trackBob = N-1;
        int[] candies = new int[N];
        for (i = 0; i < N; i++){
            candies[i] = scn.nextInt();
        }
        for (i = 0;trackAlice <= trackBob; i++){
            int cur = 0;
            if(i % 2 == 0){
                while(cur <= prevBob && trackAlice <= trackBob){
                    cur += candies[trackAlice];
                    trackAlice++;
                }
                totalAlice += cur;
                prevAlice = cur;
            }
            else{
                while(cur <= prevAlice && trackBob >= trackAlice){
                    cur += candies[trackBob];
                    trackBob--;
                }
                totalBob += cur;
                prevBob = cur;
            }
        }
        System.out.println(i+ " " + totalAlice+ " "+ totalBob);
    }
}



/// fuckkk yeahhhhh boyyyy
