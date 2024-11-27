#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<n;i++){
        int max=0;
        for(int j=1;j<n-i;j++){
            if(arr[j]>arr[max])
            max=j;
        }
        int temp=arr[n-i-1];
        arr[n-i-1]=arr[max];
        arr[max]=temp;
    }
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}