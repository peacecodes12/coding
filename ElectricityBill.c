#include <stdio.h>
int main(void) {
    int unit,count=0;
    float bill=0;
    scanf("%d", &unit);
    while(unit>0){
        if(count==0){
            bill=bill+ 50*0.5;
            unit=unit-50;
            count++;
            continue;
        }
        if(count==1){
            bill=bill+ 100*0.75;
            unit=unit-100;
            count++;
            continue;
        }
        if(count==2){
            bill=bill+ 100*1.20;
            unit=unit-100;
            count++;
            continue;
        }
        if(count>2){
            bill=bill+ unit*1.50;
            count++;
            unit=0;
            break;
        }
        
    }
    bill=(bill*0.2)+bill;
    printf("%.2f",bill);
    return 0;
}