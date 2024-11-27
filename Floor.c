#include <stdio.h>
int main (){
    float n;
    scanf( "%f", &n);
    int temp=n;
    if(temp-n==0){
        printf("Ceil: %d",(int) (n));
        printf("Floor: %d", (int)(n));
    }
    else 
    {
        printf("Ceil: %d \n",(int) (n+1));
        printf("Floor: %d", (int)(n));
    }
    return 0;
}
