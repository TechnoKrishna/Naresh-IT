#include<stdio.h>
#include<conio.h>

int main()
{
    int age;
    float price;

    scanf("%f %d", &price, &age);

    (age < 12) ? printf("Final ticket price: %.2f", price - (price*50)/100)  : (age <= 25 && age >= 12) ? printf("Final ticket price: %.2f", price - (price*30)/100) : printf("Final ticket price: %.2f", price);


    return 0;
}