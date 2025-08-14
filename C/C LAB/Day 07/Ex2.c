#include<stdio.h>

int main()
{

    int speed;

    scanf("%d", &speed);

    (speed > 80) ? printf("500") : (speed > 60 && speed < 80) ? printf("100") : (speed <= 60) ? printf("No Fine") : printf("Invalid");

    return 0;
}