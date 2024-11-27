// number = sum of factorial of digits

#include <stdio.h>
int main(){
    int n,SN=0;
    scanf("%d",&n);
    int temp=n;
    while(temp!=0){
        int digit=temp%10,fact=1;
        temp=temp/10;
        while(digit>0){
            fact=fact*digit;
            digit--;
        }
        SN=fact+SN;
    }
    if(SN==n)
    printf("%d is Strong number",n);
    else 
    printf("%d is not Strong number",n);
    return 0;
}