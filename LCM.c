#include <stdio.h>
int main(){
    int num1,num2,max,LCM=-1;
    scanf("%d %d",&num1,&num2);
    if(num1>=num2)
    max=num1;
    else max=num2;
    int start=num1*num2;
    while(start>=max){
        if(start% num1==0 && start %num2==0)
        LCM=start;
        start--;
    }
    printf("%d",LCM);
    return 0;
}