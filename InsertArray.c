#include <stdio.h>
int main(){
    int n=6,k=5;
    // scanf("%d %d",&n,&k);
    int arr[n];
    for(int i=0;i<k;i++)
    scanf("%d",&arr[i]);
    int x=6,i=5;
    // scanf("%d %d",&x,&i);
    for(int j=k-1;j>=i;j--){
        arr[j+1]=arr[j];
    }
    arr[i]=x;
    for(int i=0;i<n;i++)
    printf("%d ",arr[i]);
    return 0;
}