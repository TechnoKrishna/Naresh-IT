#include<stdio.h>

int main(){

    int num;

    scanf("%d",&num);

    if(num%5 == 0 && num%11 == 0){
        printf("%d is divisible by both 5 and 11",num);
    }
    if (num%5 !=0){
        printf("%d is Not divisible by both 5 and 11",num);
    }
}