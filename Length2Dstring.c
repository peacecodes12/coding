#include<stdio.h>
int main(){
    char names[5][100];
    int length[5];
    int i;
    for(i=0;i<5;i++){
        scanf("%s",names[i]);
        length[i]=0;
    }
    for(i=0;i<5;i++){
        int j=0;
        while(names[i][j]!='\0'){
            length[i]++;
            j++;
        }
        printf("%s length is: %d \n", names[i],length[i]);
    }

}