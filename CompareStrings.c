#include<stdio.h> 
int main(){
    char str1[100]={"Hello am Ganesh"},str2[100]={"Hello am ganesh"};
    int i=0,flag;
    for(i=0;str1[i]!='\0';i++){
        if(str1[i]!=str2[i]){
            flag=1;
            break;
        }
    }
    if(flag==0){
        printf("String equal");
    }
    else printf("String not equal");
    return 0;
}