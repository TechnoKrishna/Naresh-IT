#include<stdio.h>
int main(){
    int amount;
    scanf("%d",&amount);

    if(amount%100==0){
        printf("Valid amount ");
    }
    else printf("Invalid amount");
}