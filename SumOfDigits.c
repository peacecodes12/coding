#include <stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int temp=n,sum=0;
    while(temp!=0){
        sum=temp%10+sum;
        temp=temp/10;
    }
    printf("%d",sum);
}