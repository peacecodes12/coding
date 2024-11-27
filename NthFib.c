#include <stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int a=0,b=1,fib;
    if(n<=1)
    {printf("%d",n);
    }
    else{
        for(int i=2;i<=n;i++){
            fib=a+b;
            a=b;
            b=fib;
    }
    printf("%d",fib);
    }
    return 0;
}