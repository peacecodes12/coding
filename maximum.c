#include <stdio.h>
int main(){
    int x,y,z;
    scanf("%d %d %d",&x,&y,&z);
    if(x>=y){
        if(z<=x)
        printf("Max: %d\n",x);
        else
        printf("Max: %d\n",z);
    }
    else {
        if(z<=y)
        printf("Max: %d\n",y);
        else
        printf("Max : %d\n ",z);
    }

    if(x<=y){
        if(x<=z)
        printf("Min: %d",x);
        else
        printf("min: %d",z);
    }
    else {
        if(y<=z)
        printf("Min: %d",y);
        else
        printf("Min: %d",z);
    }
    return 0;
}