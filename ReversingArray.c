#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int array[n];
    int i;
    for( i = 0; i < n; i++){
        scanf( "%d", &array[i]);
    }
    for( i = 0; i < n/2; i++){
        int temp=array[i];
        array[i]=array[n-i-1];
        array[n-i-1]=temp;
    }

    for( i = 0; i < n; i++){
        printf("%d \n",array[i]);
    }
    
}