#include <stdio.h>
int main(){
    int x=12,y=-5,z=-3;
    scanf("%d %d %d",&x,&y,&z);
    if(x>=y && x>=z){
        if(y>z)
        printf("Second Max: %d",y);
        else printf("Second Max: %d",z); 
    }
    else if(y>=x && y>=z){
        if(x>z)
        printf("Second Max: %d",x);
        else printf("Second Max: %d",z);
    }
    else{
        if(x>y)
        printf("Second Max: %d",x);
        else printf("Second Max: %d",y);
    }

}