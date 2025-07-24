// Finding 3 digit no or not without using if..else / ternary?

#include<stdio.h>
#include<conio.h>

int main()
{
    int no;

    printf("Enter a No : ");
    scanf("%d", &no);

    (no> 99 && no < 1000) && printf("The No is 3 Digit") || printf("No is NOt an 3 Digit No");

    return 0;
}