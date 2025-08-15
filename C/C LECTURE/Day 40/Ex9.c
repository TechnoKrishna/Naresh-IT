#include <stdio.h>
#include <conio.h>

int main() {

    int n;

    printf("Enter year no "); scanf("%d" ,&n);

    if(n%4==0 && n%100!=0 || n%400==0) puts( "Leap Year"); else puts("Common Year");

    return 0;
}