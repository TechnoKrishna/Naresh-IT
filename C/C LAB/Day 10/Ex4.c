#include<stdio.h>
int main(){
    int num;
    scanf("%d",&num);

    if(num%10 == 5){
        printf("Last digit is 5");
    }
    else printf("Last digit is not 5");
}