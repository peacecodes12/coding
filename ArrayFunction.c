#include<stdio.h>
void print(int *p,int size){
    int i=0;
    for(i=0;i<size;i++){
    p[i]=0;
        printf("%d",p[i]);
    }
}
int main(){
    int arr[5]={1,2,3,4,5};
    print(arr,5);

}