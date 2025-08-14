#include<stdio.h>
int main(){
    int D;
    scanf("%d",&D);

    if(D>=1 && D<=5){
        printf("Weekday");
    }
    if(D==6 || D==7){
        printf("Weekend");
    }
    if (D>7){
        printf("Invalid day number ");
    }
}