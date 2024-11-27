public class FlowerBed {
    public static void main(String[] args){
        int [] flowerbed= {0,0,0,1};
        int n = 1,i;
        for(i = 0; i < flowerbed.length && n>0; i++){
            if(flowerbed[i] == 1){
                i++;
            }
            else {
                if (i == 0) {
                    if (flowerbed.length == 1 || flowerbed[i + 1] != 1 ) {
                        flowerbed[i] = 1;
                        n--;
                        i++;
                    }
                } else if (i == flowerbed.length - 1) {
                    if (flowerbed[i - 1] != 1) {
                        flowerbed[i] = 1;
                        n--;
                    }
                } else if (flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                    i++;
                }
            }

        }
        System.out.println(n == 0);
    }
}
