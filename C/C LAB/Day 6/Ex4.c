#include <stdio.h>
#include <conio.h>

int main()
{
    int no;

    scanf("%d", &no);

    (no % 2 == 0 && no % 5 == 0) ? printf("Even and Divisible by 5") : (no % 2 == 1 && no % 5 == 0) ? printf("Not Even but Divisible by 5") : printf("Not both Even and Divisible by 5");

    return 0;
}