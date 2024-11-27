#include <stdio.h>
int main(void) {
    int n;
    scanf("%d",&n);
    int i=0;
    for(;i<n;i++){
        int element;
        scanf("%d",&element);
        int j=0,sum=0;
        for(;j<element;j++){
            int num;
            scanf("%d",&num);
            int digits=0;
            while(num!=0){
                digits++;
                num/=10;
            }
            sum=sum+digits;
        }
        int prime=0;
        for(int m=2;m<=sum/2;m++){
            if(sum % m ==0){
                prime++;
                break;
            }
        }
        if(prime==0)
        printf("Yes");
        else printf("No");
    }
    return 0;
}