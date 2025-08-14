#include <stdio.h>
#include <conio.h>

int main() {

    int cost_price = 3500;
    int profit = 0;
    int selling_price = 0;
    int vat = 0;
    int service_charge = 0;

    selling_price = cost_price + (cost_price * 27)/100;
    profit = selling_price - cost_price;
    vat = (selling_price * 12.7)/100;
    service_charge = (selling_price * 3.87)/100;

    printf("\nSelling Price : %d", selling_price);
    printf("\nProfit : %d", profit);
    printf("\nVAT : %d", vat);
    printf("\nSERVICE CHARGE : %d", service_charge);

    return 0;
}