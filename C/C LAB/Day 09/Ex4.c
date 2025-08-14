#include<stdio.h>

int main(){

    int h;
    scanf("%d",&h);

     
    if(h>=5 && h<=11){
        printf("It's Morning.");
    }
    if(h>=12 && h<=16){
        printf("It's Afternoon.");
    }
    if(h>=17 && h<=20){
        printf("It's Evening.");
    }
    if(h>=21 && h<=23 || h>=0 && h<=4){
        printf("It's Night.");
    }

}