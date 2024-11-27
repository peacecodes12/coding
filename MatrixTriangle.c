#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int arr[n][n],i,j;
    for( i=0;i<n;i++){
        for( j=0;j<n;j++){
            scanf("%d",&arr[i][j]);
        }
    }
    printf("Lower triangle:\n");
    for(i=0;i<n;i++){
        for(j=0;j<=i;j++){
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }

    printf("Upper triangle:\n");
    for(i=0;i<n;i++){
        for(j=n-1;j>=i;j--){
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
}