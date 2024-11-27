#include <stdio.h>
int main(){
    int marks;
    scanf("%d",&marks);
    if(marks>70)
    printf("Grade A");
    else if (marks>40)
    printf("Grade B");
    else
    printf("Grade C");
    return 0;
}