#include<stdio.h>
int main(){
    char str[100];
    int i,vowles=0;
    scanf("%s",str);
    for(i=0;str[i]!='\0';i++){
        if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u')
        vowles++;
    }
    printf("%d",vowles);
}