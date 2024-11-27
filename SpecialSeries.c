#include <stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int a=1,sum=0;
    if(n==1)
    printf("%d",a);
    else{
        for(int i=1;i<=n;i++){
            sum=sum+(a*10+1);
            a=a*10+1;
        }
        printf("%d",sum);
    }
}