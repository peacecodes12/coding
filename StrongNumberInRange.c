#include <stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int i=1;
    while(i<=n){
        int temp=i,sum=0;
    while(temp!=0){
        int digit=temp%10;
        int fact=1;
        while(digit>=1){
            fact=fact*digit;
            digit--;
        }
        temp/=10;
        sum+=fact;
    }
    if(sum==i){
        printf("%d ", i);
    }
    i++;
    }
    
    return 0;
}