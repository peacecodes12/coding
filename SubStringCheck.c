#include<stdio.h>
int main(){
    char str[100]={"ababababb"};
    char substr[100]={"ababababbaabc"};
    int j,i;
    for(i=0;str[i]!='\0';i++){
        int k=i;
        for(j=0;substr[j]!='\0';j++){
            if(substr[j]!=str[k])
            break;
            k++;
        }
        if(substr[j]=='\0'){
            printf("Yes");
            break;
        }
    }
    if(substr[j]!='\0')
    printf("no");
    return 0;
}