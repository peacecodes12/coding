#include<stdio.h>
int main(){
    int ai,aj,bi,bj;
    printf("Enter Ai Aj Bi Bj:\n");
    scanf("%d %d %d %d",&ai,&aj,&bi,&bj);
    int i,j,k;
    int arr[ai][aj],b[bi][bj],prod[ai][bj];
    printf("First matrix:\n");
    for(i=0;i<ai;i++){
        for(j=0;j<aj;j++){
            scanf("%d",&arr[i][j]);
        }
    }
    printf("Second matrix:\n");
    for(i=0;i<bi;i++){
        for(j=0;j<bj;j++){
            scanf("%d",&b[i][j]);
        }
    }
    printf("Output:\n");
    for(i=0;i<ai;i++){
        for(j=0;j<bj;j++){
            prod[i][j]=0;
            for(k=0;k<bi;k++){
                prod[i][j]=arr[i][k]*b[k][j]+prod[i][j];
            }
            printf("%d ",prod[i][j]);
        }
        printf("\n");
    }
}