#include<stdio.h>
int main(){
    int num1,num2,min;
    int i=1,GCD;
    scanf("%d %d",&num1,&num2);
    if(num1>=num2){
        min=num2;
    }
    else min=num1;
    while(i<=min/2){
        if(num1%i==0 && num2 % i==0){
            GCD=i;
        }
        i++;
    }
    printf("%d", GCD);
}