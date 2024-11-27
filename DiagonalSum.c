#include <stdio.h>
#include <math.h>
int main(){
    int n;
    scanf("%d",&n);
    int arr[n][n];
    int sum=0;
    for(int i=0;i<n;i++){
        for(int j =0; j < n; j++){
            scanf("%d",&arr[i][j]);
        }        
    }
    for(int i=0;i<n;i++)
    sum+=arr[i][i];
    for(int i=0,j=n-1;i<n;j--,i++)
    sum+=arr[i][j];
    if( n % 2==0)
    printf("%d",sum);
    else{
        int i= ceil(n/2);
        sum=sum - arr[i][i];
        printf("%d",sum);
    }

}