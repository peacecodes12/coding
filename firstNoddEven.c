#include <stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int i=0;
    while(i<=n){
        printf("%d ",i);
        i+=2;
    }
    printf("\n");
    i=1;
    while(i<=n){
        printf("%d ",i);
        i+=2;
    }
}