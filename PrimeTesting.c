#include <stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int i=2,count=0;
    while(i<=n/2){
        if(n%i==0)
        count++;
        i++;
    }
    if(count==0)
    printf("%d is prime",n);
    else printf("%d is not prime",n);
}