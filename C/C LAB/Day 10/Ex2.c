#include<stdio.h>
int main(){
    int digit1,digit2,num,sum;
    scanf("%d",&num);

    if(num>=10 && num<=99){
        digit1=num/10;
        digit2=num%10;

        sum = digit1+digit2;

        if(sum%2==0){
            printf("Sum of digits is even");
        }
        if(sum%2!=0){
            printf("Sum of digits is odd");
        }
    }
}