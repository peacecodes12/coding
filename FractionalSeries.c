#include <stdio.h>
int main(){
    int n,i;
    float sum=0;
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        sum=sum+(1*1.0)/i;
    }
printf("%f",sum);
}