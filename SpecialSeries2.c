// #include <stdio.h>
// int main(){
//     int n,x,i;
//     scanf (" %d %d", &n, &x);
//     long long num, din;
//     double sum = 0;
//     for( i = 0 ; i <= n ; i++ ){
//         num=1;
//         for(int j=1;j<=i;j++)
//         num=num*x;
//         int temp = i;
//         din = 1;
//         while(temp != 0){
//             din = din * temp;
//             temp--;
//         }
//         sum = sum + (num*1.0) / din;
//     }
//     printf( "%lf" , sum);
// }


#include<stdio.h>
int main(){
    int n,x,i;
    scanf("%d %d",&n,&x);
    long long int num=1,din=1;
    double sum=1;
    for( i = 1; i<= n;i++){
        num*=x;
        din*=i;
        sum=sum+(num*1.0)/din;
    }
    printf("%lf", sum);
}