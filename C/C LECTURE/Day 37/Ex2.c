#include <stdio.h>
#include <conio.h>

int main() {

// Read a customer id, name, no of items purchased and rate of item. Find the amount, 35% discount and total. 

// DYNAMIC PRICING

    int id;
    char name[30];
    float qty, price, amount, disc, tot;

    printf("Enter Consumer id, name, quantity purchased & rate of item : ");

    scanf("%d %s %f %f", &id, name, &qty, &price);

    amount = qty * price;

    printf("Amount = %.2f\n", amount);
    
    printf("Enter Discount Percentage : ");
    scanf("%f", &disc);

    disc = amount * disc / 100;

    tot = amount - disc;

    printf("Amount = %.2f, Discount=%.2f, Total=%.2f", amount, disc, tot);

    return 0;
}