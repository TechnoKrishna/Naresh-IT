// Finding voter eligibility without using if..else / ternary?

#include<stdio.h>
#include<conio.h>

int main()
{
    int age;

    printf("Enter your Age : ");
    scanf("%d", &age);

    age >= 18 && printf("You are Eligible") || printf("You are not Eligible");

    return 0;
}