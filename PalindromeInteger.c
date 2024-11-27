#include <stdio.h>
#include <math.h>
int palindrome(long long n);
int prime(long long n);
int main(void) {
    long long n;
    scanf("%lld",&n);
    if(n==0)
    printf("%lld",n+1); 
    
    else if(palindrome(n) && prime(n) ){
        printf("%lld",n);
    }
     
    else{
        long long i=n+1;
        while(1){
            if(palindrome(i) && prime(i)){
                 printf("%lld",i);
                 break;
            }
            i++;
        }

    }
    return 0;
}

int palindrome(long long n){
    long long rev=0,temp=n;
    int digits=0;
    while(temp!=0){
        rev=rev*10+temp%10;
        temp/=10;
        digits++;
    }
    if(rev==n)
    return 1;
    
    return 0;
}

int prime(long long n){
    int count =0;
    for(int i=2; i<n/2 ; i++){
        if(n % i == 0){
            count++;
            break;
        }
    }
    if(count==0)
    return 1;

    return 0;
}