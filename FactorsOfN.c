#include <stdio.h>
int main(){
    int n,i=1;
    scanf("%d",&n);
    while(n/2 >= i){
        if(n%i==0)
        printf("%d \n",i);
        i++;
    }
    printf("%d \n",n);

}