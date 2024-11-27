#include <stdio.h> 
int main(){
    char str[100]={"8737238423"};
    long long int a=0;
    for(int i =0;str[i]!='\0';i++){
        
        a=a*10+str[i]-'0';
        
    }
    printf("\n%lld",a);

    return 0;

}