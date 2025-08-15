#include <stdio.h>
#include <conio.h>

int main() {

    float sales, da, commission, gross;
    float basic = 10000, bonus;

    printf("Enter Sales : ");
    scanf("%f", &sales);

    if(sales >= 100000)
    {
        bonus = 10000;

        commission = (sales * 10) / 100;
    }
    else
    {
        bonus = 2000;

        commission = (sales * 5) / 100;   
    }

    da = (basic * 65) / 100;
    gross = basic + da + bonus + commission;

    printf("\nBasic : %.2f", basic);
    printf("\nDa : %.2f", da);
    printf("\nBonus : %.2f", bonus);
    printf("\nCommission : %.2f", commission);
    printf("\nGross Salary : %.2f", gross);
    
    return 0;
}