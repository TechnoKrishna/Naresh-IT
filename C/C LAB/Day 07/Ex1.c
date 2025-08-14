#include<stdio.h>

int main()
{

    float Pd, Td;

    scanf("%f %f", &Td, &Pd);

    (((Pd / Td) * 100) >= 75) ? printf("Eligible for bonus") : printf("Not eligible for bonus");

    return 0;
}