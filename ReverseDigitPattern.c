#include <stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int rev=0,i=0,temp=n;
    while(temp!=0){
        rev=rev*(10^i)+temp%10;
        temp/=10;
    }
    int new=0;
    i=0;
    while(rev!=0){
        new=new*(10^i)+rev%10;
        printf("%d \n",new);
        rev=rev/10;
    }
    return 0;
}