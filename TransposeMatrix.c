#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int arr[n][n],transpose[n][n];
    int i,j;
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            scanf("%d",&arr[i][j]);
            transpose[j][i]=arr[i][j];
        }
    }
    printf(" Transpose: \n");
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            printf("%d ",transpose[i][j]);
        }
        printf("\n");
    }

}