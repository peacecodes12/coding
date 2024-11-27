#include <stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int i;
    scanf("%d",&i);
    for(int j=i;j<n;j++){
        arr[j]=arr[j+1];
    }
    for(int j=0;j<n;j++){
        printf("%d ",arr[j]);
    }
    return 0;
}