#include<stdio.h>
int main(){
    char word[100]={"abzAbhmekwgdJh"};
    int i;
    for(i=0;word[i]!='\0';i++){
        if(word[i]>='a' && word[i]<='z')
        word[i]=word[i]+('A'-'a');
    }
    printf("%s",word);
}